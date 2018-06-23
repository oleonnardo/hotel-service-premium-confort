/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import app.controllers.CompraServicoController;
import config.Carbon;
import config.Flash;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import vendor.eloquent.Model;
import vendor.interfaces.Compras;

/**
 *
 * @author LEONARDO
 */
public class CompraServico extends Model {

    public final static String table = "compra_servico";

    private int id;

    private int hospede_id;
    private int servicos_id;
    private int qtde_criancas;
    private int qtde_pessoas;
    private String obs;
    private GregorianCalendar data_compra;
    private String ativo;

    public String getTable(){
        return CompraServico.table;
    }
    
    public boolean setTipoServicoID(int tipo_servico_id) {
        if (tipo_servico_id <= 0) {
            Flash.error("É necessário selecionar uma CATEGORIA DE SERVIÇO.");
            return false;
        }
        return true;
    }

    public boolean setServico(String servico) {
        if (servico.trim().equals("")) {
            Flash.error("É necessário selecionar um SERVIÇO.");
            return false;
        }
        return true;
    }

    public boolean setQtdeCriancas(String qtde_criancas) {
        if (qtde_criancas.trim().equals("")) {
            Flash.error("Campo QUANTIDADE DE CRIANÇAS é obrigatório.");
            return false;
        }
        if (Integer.valueOf(qtde_criancas) < 0) {
            Flash.error("Campo QUANTIDADE DE CRIANÇAS não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public boolean setQtdePessoas(String qtde_pessoas) {
        if (qtde_pessoas.trim().equals("")) {
            Flash.error("Campo QUANTIDADE DE PESSOAS é obrigatório.");
            return false;
        }
        if (Integer.valueOf(qtde_pessoas) < 0) {
            Flash.error("Campo QUANTIDADE DE PESSOAS não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public ResultSet hasManyTipoServico() {
        try {
            return this.hasMany("tipo_servico", "ativo", 1);
        } catch (Exception ex) {
            try {
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function hasManyTipoServico() in Model --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }


}
