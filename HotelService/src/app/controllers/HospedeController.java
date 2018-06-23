/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import vendor.interfaces.Controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.models.Hospede;
import config.Flash;

/**
 *
 * @author LEONARDO
 */
public class HospedeController implements Controller{
    
    Hospede hospede;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public HospedeController(app.models.Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public ResultSet index() {
        try {
            return this.hospede.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.hospede.create(request);
            if( this.resultSet.next() ){
                // Flash.success("Hóspede cadastrado.");;
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        Flash.error("Ocorreu ao cadastrar o registro.");
        return null;
    }

    @Override
    public ResultSet show(int id) {
        try {
            this.resultSet = this.hospede.find(id);
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

    @Override
    public ResultSet update(Object[] request, int id) {
        try {
            this.resultSet = this.hospede.update(request,id);
            if( this.resultSet.next() ){
                Flash.success("Hóspede modificado.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao modificar o registro.");
        }
        return null;
    }

    @Override
    public ResultSet delete(int id) {
        try {
            this.resultSet = this.hospede.delete(id);
            if( this.resultSet.next() ){
                Flash.success("Hóspede removido.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao remover o registro.");
        }
        return null;
    }
    
}
