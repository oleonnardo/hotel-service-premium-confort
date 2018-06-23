/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor.eloquent;

import config.Flash;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author leonardo
 */
public abstract class Model extends DB {

    private String query;

    private final Connection con;

    private ResultSet rs;

    private PreparedStatement ps;

    public Model() {
        this.con = run();
    }

    private Object getTable() throws Exception {
        try {
            return this.getClass().getField("table").get(this);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new Exception("Campo TABLE nao encontrado: function getTable() --- ", ex);
        }
    }

    public ResultSet select(String sql) throws Exception {
        try {
            this.ps = this.con.prepareCall(sql);
            return this.ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function select() --- ", ex);
        }
    }

    public boolean execute(String sql) throws Exception {
        try {
            this.ps = this.con.prepareCall(sql);
            return this.ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function execute() --- ", ex);
        }
    }

    public boolean fill(Object[] array, String sql) throws Exception {
        try {
            this.ps = this.con.prepareCall(sql);
            for (int i = 1; i <= array.length; i++) {
                this.ps.setObject(i, String.valueOf(array[i - 1]).trim());
            }
            return this.ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function fill() --- ", ex);
        }
    }

    public ResultSet all() throws Exception {
        this.query = "SELECT * FROM " + this.getTable();
        return this.select(this.query);
    }

    public ResultSet allfilter() throws Exception {
        this.query = "SELECT * FROM " + this.getTable() + " WHERE ativo = 1";
        return this.select(this.query);
    }

    public ResultSet create(Object[] obj) throws Exception {
        try {
            this.query = "INSERT INTO " + this.getTable() + " VALUES (NULL, ";
            for (int i = 0; i < obj.length; i++) {
                this.query = this.query.concat("?");
                this.query = (i != obj.length - 1) ? this.query.concat(", ") : this.query;
            }
            this.query = this.query.concat(");");

            if ( ! this.fill(obj, this.query)) {
                int last_id = this.lastRegister();
                if (last_id > 0) {
                    return this.find(last_id);
                }
            }            
            return null;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function create() --- ", ex);
        }
    }

    public ResultSet find(int id) throws Exception {
        try {
            this.query = "SELECT * FROM " + this.getTable() + " WHERE id = " + id;
            return this.select(this.query);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function find() --- ", ex);
        }
    }

    public ResultSet update(Object[] obj, int id) throws Exception {
        try {
            this.query = "UPDATE " + this.getTable() + " SET ";
            int cont = 0;

            String[] fields = this.getFields();
            for (Object field : fields) {
                this.query = this.query.concat(field + " = ? ");
                this.query = (cont != fields.length - 1) ? this.query.concat(", ") : this.query;
                cont++;
            }

            this.query = this.query.concat(" WHERE id = " + id);

            if (!this.fill(obj, this.query)) {
                return this.find(id);
            }

        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Campo nao encontrado: function update() --- ", ex);
        }
        return null;
    }

    public ResultSet delete(int id) throws Exception {
        try {
            this.query = "DELETE FROM " + this.getTable() + " WHERE id = " + id;
            this.execute(this.query);
            return this.all();
        } catch (SecurityException ex) {
            System.out.println(ex);
            throw new Exception("Campo TABLE nao encontrado: function delete() --- ", ex);
        }
    }

    private String[] getFields() {
        Field fieldlist[] = this.getClass().getDeclaredFields();
        String[] fields = new String[fieldlist.length - 2];

        for (int i = 0; i < fieldlist.length; i++) {
            Field fld = fieldlist[i];
            if (!fld.getName().equals("table") && !fld.getName().equals("id")) {
                fields[i - 2] = fld.getName();
            }
        }
        return fields;
    }

    private int lastRegister() throws Exception {
        try {
            this.query = "SELECT MAX(id) AS cont FROM " + this.getTable();
            this.rs = this.select(this.query);
            while (this.rs.next()) {
                return Integer.valueOf(this.rs.getString("cont"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function lastRegister() --- ", ex);
        }
        return 0;
    }

    public int count() {
        try {
            this.query = "SELECT COUNT(*) AS rows FROM " + this.getTable();
            this.rs = this.select(this.query);
            while (this.rs.next()) {
                return this.rs.getInt("rows");
            }
        } catch (Exception ex) {
            try {
                System.out.println(ex);
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function count() --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return 0;
    }

    public boolean hasOne(String table, String foreignKey, Object key) throws Exception {
        try {
            this.query = "SELECT COUNT(*) AS rows FROM " + table + " WHERE " + foreignKey + " = " + key;
            this.rs = this.select(this.query);
            while (this.rs.next()) {
                return this.rs.getInt("rows") > 0;
            }
            return false;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function hasOne() --- ", ex);
        }
    }

    public ResultSet hasMany(String table, String foreingKey, Object key) throws Exception {
        try {
            this.query = "SELECT * FROM " + table + " WHERE " + foreingKey + " = " + key;
            return this.select(this.query);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function hasMany() --- ", ex);
        }
    }

    public ResultSet like(String foreingKey, Object key, Object[] foreingKeys) throws Exception {
        try {
            this.query = "SELECT * FROM " + this.getTable() + " WHERE " + foreingKey + " LIKE '%" + key + "%'";
            this.query = this.and(this.query, foreingKeys);
            return this.select(this.query);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function like() --- ", ex);
        }
    }

    public ResultSet equals(String foreingKey, Object key, Object[] foreingKeys) throws Exception {
        try {
            this.query = "SELECT * FROM " + this.getTable() + " WHERE " + foreingKey + " = '" + key + "'";
            this.query = this.and(this.query, foreingKeys);
            return this.select(this.query);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function equals() --- ", ex);
        }
    }

    public String and(String sql, Object[] foreingKeys) {
        if( foreingKeys!=null){
            for (Object fk : foreingKeys) {
                sql = sql.concat(" AND " + fk);
            }
        }
        return sql;
    }
    
}
