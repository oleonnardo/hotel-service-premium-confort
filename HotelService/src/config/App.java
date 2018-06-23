/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author leonardo
 */
public abstract class App {
    
    
    public final static String nomeHotel = "HOTEL CAMPINA CONFORT PREMIUM"; 
    
    /**
     * 
     * Make & Feel: layout das telas da aplicação Java.
     */
    public static String makeAndFell = "Windows";
    
    /**
     * 
     * Configurando a localização, para a data e hora(Gregorian Calendar) do sistema.
     */
    public final static String UTC = "pt";
    public final static String LOCALE = "BR";
    
    /**
     * 
     * Pré definição das cores da aplicação que estão visiveis nas telas
     */    
    public final static Color COLOR_HOVER = new Color(96,173,0);
    public final static Color COLOR_APP = new Color(87, 89, 98);
    public final static Color COLOR_BTN_CADASTRAR = new Color(100,149,237);
    public final static Color COLOR_BTN_EDITAR = new Color(0,153,0); 
    public final static Color COLOR_BTN_CANCELAR = new Color(51,51,51); 
    public final static Color COLOR_BTN_MODIFICAR = new Color(113,106,202);
    
    
}
