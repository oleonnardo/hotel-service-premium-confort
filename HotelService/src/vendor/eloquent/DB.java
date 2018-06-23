/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor.eloquent;

import config.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import config.Flash;

/**
 *
 * @author leonardo
 */
public abstract class DB extends Database {

    private Connection connection;
    
    public static Connection run() {
        try {
            Class.forName(DRIVER());
            return DriverManager.getConnection(URL(), USERNAME(), PASSWORD());

        } catch (ClassNotFoundException | SQLException ex) {
            Flash.error("Falha na conexão com o banco de dados. O programa não pode ser iniciado.");
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    protected static void stop(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão: ", ex);
        }
    }

    protected static void stop(Connection con, PreparedStatement ps) {
        
        stop(con);
        
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão: ", ex);
        }
    }

    protected static void stop(Connection con, PreparedStatement ps, ResultSet rs) {
        
        stop(con, ps);
        
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão: ", ex);
        }
    }

}
