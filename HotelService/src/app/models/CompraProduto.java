/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import config.Flash;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import vendor.eloquent.Model;
import vendor.interfaces.Compras;

/**
 *
 * @author LEONARDO
 */
public class CompraProduto extends Model implements Compras{

    public final static String table = "compra_produto";
    private int id;
    
    private int hospede_id;
    private int produto_id;
    private GregorianCalendar data_compra;
    private int porcoes;
    private String obs;
    private String ativo;

    public boolean setProduto(int produto_id){
        if( produto_id < 0 ){
            Flash.error("Selecione um PRODUTO na tabela.");
            return false;
        }
        return true;
    }
    
    public boolean setPorcao(String porcao) {
        if(porcao.equals("")){
            Flash.error("Campo PORÇÃO é obrigatório.");
            return false;
        }
        if (Integer.valueOf(porcao) <= 0) {
            Flash.error("Campo PORÇÃO não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public ArrayList<String[]> addCompraCarrinho(ArrayList<String[]> carrinhoDeCompras, Object[] request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String[]> validarCompra(ArrayList<String[]> carrinhoDeCompras, Object[] request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] addCompraCarrinho(Object[] request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
