/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.CompraProduto;
import config.Flash;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vendor.interfaces.Controller;

/**
 *
 * @author LEONARDO
 */
public class CompraProdutoController implements Controller{
    
    CompraProduto compraproduto;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public CompraProdutoController(app.models.CompraProduto compraproduto) {
        this.compraproduto = compraproduto;
    }

    @Override
    public ResultSet index() {
        try {
            return this.compraproduto.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.compraproduto.create(request);
            if( this.resultSet.next() ){
                //Flash.success("Categoria de produto cadastrado.");
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
            this.resultSet = this.compraproduto.find(id);
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
            this.resultSet = this.compraproduto.update(request,id);
            if( this.resultSet.next() ){
                Flash.success("Categoria de produto modificado.");
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
            this.resultSet = this.compraproduto.delete(id);
            if( this.resultSet.next() ){
                Flash.success("Categoria de produto removido.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao remover o registro.");
        }
        return null;
    }
}
