/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Produtos;
import config.Flash;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vendor.interfaces.Controller;

/**
 *
 * @author LEONARDO
 */
public class ProdutoController implements Controller{

    Produtos produtos;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public ProdutoController(app.models.Produtos produtos) {
        this.produtos = produtos;
    }

    @Override
    public ResultSet index() {
        try {
            return this.produtos.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.produtos.create(request);
            if( this.resultSet.next() ){
                Flash.success("Produto cadastrado.");
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
            this.resultSet = this.produtos.find(id);
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
            this.resultSet = this.produtos.update(request,id);
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

    @Override
    public ResultSet delete(int id) {
        try {
            this.resultSet = this.produtos.delete(id);
            if( this.resultSet.next() ){
                Flash.success("Produto removido.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao remover o registro.");
        }
        return null;
    }
    
}
