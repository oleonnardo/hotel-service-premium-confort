/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor.interfaces;

import java.util.ArrayList;

/**
 *
 * @author leonardo
 */
public interface Compras {

    public ArrayList<String[]> validarCompra(ArrayList<String[]> carrinhoDeCompras, Object[] request);
    
    public String[] addCompraCarrinho(Object[] request);
}
