/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import app.controllers.CompraServicoController;
import config.Carbon;
import java.sql.ResultSet;
import vendor.eloquent.Model;
import config.Flash;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leonardo
 */
public class Servicos extends Model {

    public final static String table = "servicos";

    private int id;

    private int tipo_servico_id;
    private String nome;
    private String descricao;
    private double preco;
    private int vagas;
    private int qtde_pessoa_max;
    private int qtde_crianca_max;
    private String obs;
    private int ativo;
    
    
    public boolean setTipoServicoID(int tipo_servico){
        if(tipo_servico <= 0){
            Flash.error("Selecione uma Categoria de Serviço.");
            return false;            
        }
        return true;
    }
    
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

    public boolean setPreco(String preco) {
        if (preco.trim().equals("")) {
            Flash.error("Campo PREÇO é obrigatório.");
            return false;
        }
        if (Double.valueOf(preco) < 0) {
            Flash.error("Campo PREÇO não pode ser negativo.");
            return false;
        }
        return true;
    }

    public boolean setVagas(String vagas) {
        if (vagas.trim().equals("")) {
            Flash.error("Campo VAGAS é obrigatório.");
            return false;
        }
        if (Integer.valueOf(vagas) < 0) {
            Flash.error("Campo VAGAS é obrigatório e não pode ser negativo.");
            return false;
        }
        return true;
    }

    public boolean setQtdePessoaMax(String qtde_pessoa_max) {
        if (qtde_pessoa_max.trim().equals("")) {
            Flash.error("Campo NÚMERO MÁXIMO DE PESSOAS é obrigatório.");
            return false;
        }
        if (Integer.valueOf(qtde_pessoa_max) < 0) {
            Flash.error("Campo NÚMERO MÁXIMO DE PESSOAS é obrigatório e não pode ser negativo.");
            return false;
        }
        return true;
    }

    public boolean setQtdeCriancaMax(String qtde_crianca_max) {
        if (qtde_crianca_max.trim().equals("")) {
            Flash.error("Campo NÚMERO MÁXIMO DE CRIANÇAS é obrigatório.");
            return false;
        }
        if (Integer.valueOf(qtde_crianca_max) < 0) {
            Flash.error("Campo NÚMERO MÁXIMO DE CRIANÇAS é obrigatório e não pode ser negativo.");
            return false;
        }
        return true;
    }

    public boolean setObs(String obs) {
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
            if (this.hasOne("compra_servico", "servicos_id", id)) {
                Flash.warning("Não é possivel remover esse registro.\n" +
                        "Existem outros cadastros no sistema que necessitam dele.\n" +
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
    
    public ResultSet search(String text) {
        try {
            return this.like("nome", text.trim().toUpperCase(), new Object[]{"ativo", 1});
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
    
    public ResultSet filterServiceType(int tipo_servico_id){
        try {
            return this.equals("tipo_servico_id", tipo_servico_id, new Object[]{"ativo", 1});
        } catch (Exception ex) {
            try {
                throw new Exception("Ocorreu um erro na consulta com o banco de dados: function filterServiceType() in Model --- ", ex);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public boolean retirarVaga(int id){
        try {
            ResultSet resultSet;
            resultSet = this.find(id);
            if( resultSet.next() ){
                int qtdeVagas = resultSet.getInt("vagas");
                if( qtdeVagas==0 ){
                    Flash.error("Nenhuma vaga disponível.");
                    return false;
                }
                
                qtdeVagas -= 1;
                
                this.update(new Object[]{
                    resultSet.getString("tipo_servico_id"),
                    resultSet.getString("nome"),
                    resultSet.getString("descricao"),
                    resultSet.getString("preco"),
                    qtdeVagas,
                    resultSet.getString("qtde_pessoa_max"),
                    resultSet.getString("qtde_crianca_max"),
                    resultSet.getString("obs"),
                    resultSet.getString("ativo"),
                }, id);
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("Erro na função retirarVaga(), na classe Serviços"+ex);
        }
        return false;
    }
    
    public boolean reporVaga(int id){
        try {
            ResultSet resultSet;
            resultSet = this.find(id);
            if( resultSet.next() ){
                int qtdeVagas = resultSet.getInt("vagas");                
                qtdeVagas += 1;
                
                this.update(new Object[]{
                    resultSet.getString("tipo_servico_id"),
                    resultSet.getString("nome"),
                    resultSet.getString("descricao"),
                    resultSet.getString("preco"),
                    qtdeVagas,
                    resultSet.getString("qtde_pessoa_max"),
                    resultSet.getString("qtde_crianca_max"),
                    resultSet.getString("obs"),
                    resultSet.getString("ativo"),
                }, id);
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("Erro na função reporVaga(), na classe Serviços"+ex);
        }
        return false;
    }
    
    
    public boolean temVaga(int id){
        try {
            ResultSet resultSet;
            resultSet = this.find(id);
            if( resultSet.next() ){
                int qtdeVagas = resultSet.getInt("vagas");
                System.out.println("Qtde vagas " + qtdeVagas);
                if( qtdeVagas==0 ){
                    Flash.error("Nenhuma vaga disponível.");
                    return false;
                }                
                return true;
            }
            return false;
        } catch (Exception ex) {
            System.out.println("Erro na função reporVaga(), na classe Serviços"+ex);
        }
        return false;
    }
    
    
    public ArrayList<String[]> validarCompra(ArrayList<String[]> carrinhoDeCompras, Object[] request) {
        ResultSet resultSet;
        
        try {
            resultSet = this.find(Integer.valueOf(String.valueOf(request[1])));

            if (resultSet != null && resultSet.next()) {

                int id_servico = resultSet.getInt("id");
                
                int qtde_crianca_permitido = resultSet.getInt("qtde_crianca_max");
                int qtde_pessoa_permitido = resultSet.getInt("qtde_pessoa_max");

                int qtde_crianca_informado = Integer.valueOf(String.valueOf(request[2]));
                int qtde_pessoa_informado = Integer.valueOf(String.valueOf(request[3]));

                if (qtde_crianca_informado <= qtde_crianca_permitido && qtde_pessoa_informado <= qtde_pessoa_permitido) {
                    
                    if( this.temVaga(id_servico) ){
                        carrinhoDeCompras.add(this.addCompraCarrinho(request));
                        this.retirarVaga(id_servico);
                    }
                    
                } else {

                    if (Flash.confirm(
                            "O número de hospedes é maior que o permitido nesse serviço. Deseja duplicar o pedido do serviço?",
                            "question") == 0) {
                                
                        int cont = qtde_crianca_informado + qtde_pessoa_informado;
                        int qtde_total = qtde_crianca_permitido + qtde_pessoa_permitido;

                        do {
                            if( this.temVaga(id_servico) ){
                                cont -= qtde_total;
                                carrinhoDeCompras.add(this.addCompraCarrinho(request));
                                this.retirarVaga(resultSet.getInt("id"));
                            }
                        } while (cont > 0);
                    }

                }
            }
        } catch (Exception ex) {
            System.out.println("Erro na função validarCompra(): " + ex);
        }

        return carrinhoDeCompras;
    }
    
    public String[] addCompraCarrinho(Object[] request) {
        return new String[]{
            String.valueOf(request[0]), // hospede_id
            String.valueOf(request[1]), // servicos_id
            String.valueOf(request[2]), // qtde_criancas
            String.valueOf(request[3]), // qtde_pessoas
            String.valueOf(request[4]), // obs
            Carbon.getDate(Carbon.now(), "yyyy-MM-dd HH:mm:ss"), //data_compra
            String.valueOf(request[6]), // nome_servico
            String.valueOf(request[7]), // vagas
            String.valueOf(request[8]), // preco
        };
    }
    
    public void storeCompras(ArrayList<String[]> carrinhoDeCompras, CompraServicoController controller){
        for (int i = 0; i < carrinhoDeCompras.size(); i++) {
            controller.store(new Object[]{
                carrinhoDeCompras.get(i)[0],
                carrinhoDeCompras.get(i)[1],
                carrinhoDeCompras.get(i)[2],
                carrinhoDeCompras.get(i)[3],
                carrinhoDeCompras.get(i)[4],
                carrinhoDeCompras.get(i)[5],
                "S"
            });
        }
    }
    
}
