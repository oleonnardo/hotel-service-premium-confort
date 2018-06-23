/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Sistema;
import config.Flash;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LEONARDO
 */
public class SistemaController {
    
    Sistema sistema;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public SistemaController(Sistema sistema) {
        this.sistema = sistema;
    }

    public ResultSet index() {
        try {
            return this.show(1);            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    public ResultSet show(int id) {
        try {
            this.resultSet = this.sistema.find(id);
            if( this.resultSet.next() ){
                return this.resultSet;
            }else{
                Flash.warning("Nenhum registro encontado.");
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao exibir o registro.");
        }
        return null;
    }

    public ResultSet update(Object[] request, int id) {
        try {
            this.resultSet = this.sistema.update(request,id);
            if( this.resultSet.next() ){
                Flash.success("Produto modificado.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao modificar o registro.");
        }
        return null;
    }
    
}
