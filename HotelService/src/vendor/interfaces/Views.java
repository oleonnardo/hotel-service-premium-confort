/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor.interfaces;

import java.awt.Color;
import java.sql.ResultSet;

/**
 *
 * @author leonardo
 */
public interface Views {

    public Object[] requestsInputs();

    public void clearInputs();

    public boolean isValidForm();

    public void fillInputs();

    public void loadTable(ResultSet rs);
    
    public void action_cadastrar(boolean status, String btn, Color color);

    public void action_modificar(boolean status, String btn, Color color);

}
