/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author leonardo
 */
public abstract class Database {
    
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://";
    private final static String HOST = "localhost";
    private final static String DATABASE = "hotelservice";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private final static String CHARSET = "utf8mb4";
    private final static String COLLATION = "utf8mb4_unicode_ci";
    
    protected static String DRIVER() {
        return DRIVER;
    }

    protected static String URL() {
        return URL+HOST+"/"+DATABASE+"?useUnicode=true&amp;characterEncoding="+CHARSET;
    }
    
    protected static String USERNAME() {
        return USERNAME;
    }

    protected static String PASSWORD() {
        return PASSWORD;
    }
    
    protected static String DATABASE(){
        return DATABASE;
    }

    protected static String CHARSET(){
        return CHARSET;
    }

    protected static String COLLATION(){
        return COLLATION;
    }
    
        
}
