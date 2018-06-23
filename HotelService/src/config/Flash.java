/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Driver;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public abstract class Flash {
    
    public static void success(String message){
        String icon = "/resources/images/flash/success.png";
        JOptionPane.showMessageDialog(null, message, "Sucesso!", 0, new ImageIcon(Driver.class.getResource(icon)));  
    }
    
    public static void info(String message){
        String icon = "/resources/images/flash/info.png";
        JOptionPane.showMessageDialog(null, message, "Informação!", 0, new ImageIcon(Driver.class.getResource(icon))); 
    }
    
    public static void warning(String message){
        String icon = "/resources/images/flash/warning.png";
        JOptionPane.showMessageDialog(null, message, "Notificação!", 0, new ImageIcon(Driver.class.getResource(icon)));
    }
    
    public static void error(String message){
        String icon = "/resources/images/flash/error.png";
        JOptionPane.showMessageDialog(null, message, "Erro!", 0, new ImageIcon(Driver.class.getResource(icon)));        
    }
    
    public static Object input(String message, String icon){
        icon = "/resources/images/flash/"+icon+".png";
        return JOptionPane.showInputDialog(null, message, "", 0, new ImageIcon(Driver.class.getResource(icon)), null, "");
    }
    
    public static int confirm(String message, String icon){
        icon = "/resources/images/flash/"+icon+".png";
        return JOptionPane.showConfirmDialog(null, message, "", JOptionPane.YES_NO_OPTION, 0, new ImageIcon(Driver.class.getResource(icon)));
    }
    
}
