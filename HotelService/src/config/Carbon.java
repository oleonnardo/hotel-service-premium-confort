/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author leonardo
 */
public abstract class Carbon {

    private final static int addDay = 30;

    private final static int addYear = 1;    
    
    public static Date now() {
        return new Date();
    }
        
    public static Date isToday(Date date){
        return (date == null) ? Carbon.now() : date;        
    }
    
    public static int isAddDay(int ad){
        return (ad == 0) ? Carbon.addDay : ad;        
    }
    
    public static int isAddYear(int ad){
        return (ad == 0) ? Carbon.addYear : ad;        
    }
    
    public static String getDate(Date date, String format){
        return new SimpleDateFormat(format).format(date);
    }
    
    public static String getDate(Date date) {
        return DateFormat.getDateInstance().format(Carbon.isToday(date));
    }

    public static String getShortDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.SHORT).format(Carbon.isToday(date));
    }

    public static String getMediumDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.MEDIUM).format(Carbon.isToday(date));
    }

    public static String getLongDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.LONG).format(Carbon.isToday(date));
    }

    public static String getFullDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.FULL).format(Carbon.isToday(date));
    }
   
    public static String extenseDay(Date date) {
        return new SimpleDateFormat("EEEE", new Locale(App.UTC, App.LOCALE)).format(Carbon.isToday(date));
    }
    
    public static String extenseMonth(Date date) {
        return new SimpleDateFormat("MMMM", new Locale(App.UTC, App.LOCALE)).format(Carbon.isToday(date));
    }

    public static Date gregorianToDate(GregorianCalendar gc){
        return new Date(gc.getTimeInMillis());
    }
    
    public static Date addDay(Date date, int days){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(Carbon.isToday(date));
        gc.add(Calendar.DAY_OF_MONTH, Carbon.isAddDay(days));
        return Carbon.gregorianToDate(gc);
    }
    
    public static Date addYear(Date date, int years){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(Carbon.isToday(date));
        gc.add(Calendar.YEAR, Carbon.isAddDay(years));
        return Carbon.gregorianToDate(gc);
    }
    
    public static Date stringToDate(String str){
        try { 
            return new SimpleDateFormat("yyyy-MM-dd").parse(str);
        } catch (ParseException ex) {
            try {
                throw new Exception("Erro na função StringToDate: ", ex);
            } catch (Exception ex1) {
                System.out.println("Erro na função StringToDate: " + ex1);
            }
        }
        return null;
    }
    
    public static Date stringToDate(String str, String format){
        try { 
            DateFormat dateFormat = new SimpleDateFormat(format); 
            return dateFormat.parse(str);
        } catch (ParseException ex) {
            try {
                throw new Exception("Erro na função StringToDate: ", ex);
            } catch (Exception ex1) {
                System.out.println("Erro na função StringToDate: " + ex1);
            }
        }
        return null;
    }
    
    public static String dateToDB(String[] str){
        return str[2]+"-"+str[1]+"-"+str[0];
    }
    
}


