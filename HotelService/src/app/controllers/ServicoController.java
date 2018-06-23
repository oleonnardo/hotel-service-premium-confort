/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import vendor.interfaces.Controller;
import app.models.Servicos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Flash;

/**
 *
 * @author LEONARDO
 */
public class ServicoController implements Controller{

    Servicos servicos;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public ServicoController(Servicos servicos) {
        this.servicos = servicos;
    }

    @Override
    public ResultSet index() {
        try {
            return this.servicos.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.servicos.create(request);
            if( this.resultSet.next() ){
                Flash.success("Serviço cadastrado.");
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
            this.resultSet = this.servicos.find(id);
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
            this.resultSet = this.servicos.update(request,id);
            if( this.resultSet.next() ){
                Flash.success("Serviço modificado.");
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
            this.resultSet = this.servicos.delete(id);
            if( this.resultSet.next() ){
                Flash.success("Serviço removido.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao remover o registro.");
        }
        return null;
    }
    
}
