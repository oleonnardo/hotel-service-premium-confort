/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import vendor.interfaces.Controller;
import app.models.CategoriaProduto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Flash;

/**
 *
 * @author LEONARDO
 */
public class CategoriaProdutoController implements Controller{
    
    CategoriaProduto categoriaproduto;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public CategoriaProdutoController(app.models.CategoriaProduto categoriaproduto) {
        this.categoriaproduto = categoriaproduto;
    }

    @Override
    public ResultSet index() {
        try {
            return this.categoriaproduto.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.categoriaproduto.create(request);
            if( this.resultSet.next() ){
                Flash.success("Categoria de produto cadastrado.");
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
            this.resultSet = this.categoriaproduto.find(id);
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
            this.resultSet = this.categoriaproduto.update(request,id);
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
            this.resultSet = this.categoriaproduto.delete(id);
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
