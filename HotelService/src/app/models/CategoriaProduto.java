/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import vendor.eloquent.Model;
import config.Flash;
import java.sql.ResultSet;

/**
 *
 * @author leonardo
 */
public class CategoriaProduto extends Model {
   
    public final static String table = "categoria_produto";
    
    private int id;
    
    private String nome;
    private String descricao;
    private int ativo;

    public boolean setNome(String nome) {
        if (nome.trim().equals("")) {
            Flash.error("Campo NOME é obrigatório.");
            return false;
        }
        if (nome.trim().length() >= 250) {
            Flash.error("Limite máximo de 250 caracteres para o NOME.");
            return false;
        }
        return true;
    }

    public boolean setDescricao(String descricao) {
        if (descricao.trim().equals("")) {
            Flash.error("Campo DESCRIÇÃO é obrigatório.");
            return false;
        }
        if (descricao.trim().length() >= 500) {
            Flash.error("Limite máximo de 500 caracteres para o DESCRIÇÃO.");
            return false;
        }
        return true;
    }
    
    public boolean setAtivo(boolean yes, boolean no) {
        if (yes || no) {
            return true;
        }
        Flash.error("Selecione uma opção no item ATIVO.");
        return false;
    }

    public boolean haveAny(int id) throws Exception {
        try {
            if (this.hasOne("produto", "categoria_produto_id", id)) {
                Flash.warning("Não é possivel remover esse registro.\n" +
                        "Existem outros cadastros no sistema que necessitam desse registro.\n" +
                        "Desative a visualização deste registro, caso não queira mais utilizá-lo em próximos cadastros.");
                return false;
            }else{    
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function haveAny() --- ", ex);
        }
    }
    
    public ResultSet hasManyCategoriaProduto() {
        try {
            return this.hasMany("categoria_produto", "ativo", 1);
        } catch (Exception ex) {
            try {
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function hasManyCategoriaProduto() in Model --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }
    
    
    
}
