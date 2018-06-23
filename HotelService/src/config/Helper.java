/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.StringUtils;
import java.awt.Color;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author leonardo
 */
public abstract class Helper {

    public static void hoverImage(JLabel label, String icon, Class classe) {
        label.setIcon(new ImageIcon(classe.getClass().getResource(icon)));
    }

    public static void hoverLabel(JLabel label, Color color) {
        label.setForeground(color);
    }

    public static void visible(JLabel btn, boolean status) {
        btn.setVisible(status);
    }

    public static void visible(JPanel btn, boolean status) {
        btn.setVisible(status);
    }
    
    public static String formatPrice(double number){
        return NumberFormat.getCurrencyInstance().format(number);
    }

    public static String[] explode(String delimiter, String string){
        return string.split(delimiter);
    }
    
    public static void echo(Object string){
        System.out.println(String.valueOf(string));
    }
    
    public static int increment(int value){
        return value+=1;
    }
    
    public static int decrement(int value){
        return value-=1;
    }
        
    public static void setBorderPainted(JRadioButton radioButton, boolean status) {
        radioButton.setBorderPainted(status);
    }
}
