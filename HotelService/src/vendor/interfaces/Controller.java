/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor.interfaces;

import java.sql.ResultSet;

/**
 *
 * @author leonardo
 */
public interface Controller {
    
    public ResultSet index();
    
    public ResultSet store(Object[] request);
    
    public ResultSet show(int id);
    
    public ResultSet update(Object[] request, int id);
    
    public ResultSet delete(int id);    
    
}
