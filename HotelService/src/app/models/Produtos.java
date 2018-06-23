/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import config.Flash;
import java.sql.ResultSet;
import vendor.eloquent.Model;

/**
 *
 * @author LEONARDO
 */
public class Produtos extends Model {

    public final static String table = "produto";

    private int id;

    private int categoria_produto_id;
    private String titulo;
    private String descricao;
    private double preco;
    private int ativo;

    public boolean setCategoriaProduto(int categoria_produto_id) {
        if (categoria_produto_id == 0) {
            Flash.error("Selecione uma CATEGORIA.");
            return false;
        }
        return true;
    }

    public boolean setTitulo(String titulo) {
        if (titulo.trim().equals("")) {
            Flash.error("Campo NOME PRODUTO é obrigatório.");
            return false;
        }
        if (titulo.trim().length() >= 250) {
            Flash.error("Limite máximo de 250 caracteres para o NOME PRODUTO.");
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

    public boolean setPreco(String preco) {
        if (preco.trim().equals("")) {
            Flash.error("Campo PREÇO é obrigatório.");
            return false;
        }
        if (Double.valueOf(preco) <= 0) {
            Flash.error("Campo PREÇO não pode ser negativo ou nulo.");
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

    public boolean haveAny(Integer valueOf) throws Exception {
        try {
            if (this.hasOne("compra_produto", "produto_id", id)) {
                Flash.warning("Não é possivel remover esse registro.\n"
                        + "Existem outros cadastros no sistema que necessitam dele.\n"
                        + "Desative a visualização deste registro, caso não queira mais utilizá-lo em próximos cadastros.");
                return false;
            } else {
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
                System.out.println(ex);
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function hasManyCategoriaProduto() in Model --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public ResultSet search(String text) {
        try {
            return this.like("titulo", text.trim().toUpperCase(), new Object[]{ "ativo", 1 });
        } catch (Exception ex) {
            try {
                System.out.println(ex);
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function search() in Model --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

}
