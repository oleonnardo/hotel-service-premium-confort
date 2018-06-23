/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.UUID;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public abstract class PDF {

    public static boolean create(String html) {
        String caminho;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(UUID.randomUUID().toString()+".pdf"));
        fileChooser.setDialogTitle("Salvar Arquivo");
        
        if (fileChooser.showSaveDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            caminho = fileToSave.getAbsolutePath();
            try {
                File file = new File(caminho);
                file.getParentFile().mkdirs();

                Document document = new Document(PageSize.A4);
                PdfWriter.getInstance(document, new FileOutputStream(file));
                document.open();
                StringBuilder sb = new StringBuilder();
                sb.append(html);

                HTMLWorker htmlWorker = new HTMLWorker(document);
                htmlWorker.parse(new StringReader(sb.toString()));
                document.close();
                return true;
                
            } catch (IOException | DocumentException ex) {
                ex.printStackTrace();
            }
            
            return false;
        
        }
        return false;

    }

}
