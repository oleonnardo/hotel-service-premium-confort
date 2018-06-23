/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import config.Carbon;
import java.util.Date;
import java.util.GregorianCalendar;
import vendor.eloquent.Model;
import config.Flash;
import config.Helper;
import config.Validate;
import config.WebServiceCep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardo
 */
public class Hospede extends Model {

    public final static String table = "hospede";

    private int id;

    private String nome;
    private String email;
    private String cpf;
    private Date nascimento;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private GregorianCalendar data_inicial;
    private GregorianCalendar data_final;
    private int tipo_cartao;
    private String cartao_credito;
    private Date data_vencimento;
    private int codigo_seguranca;
    private char status_contrato;

    public boolean setNome(String nome) {
        if (nome.equals("")) {
            Flash.error("O nome é obrigatório!");
            return false;
        }
        if (nome.length() > 150) {
            Flash.error("Nome possui no maximo 150 caracteres.");
            return false;
        }
        return true;
    }

    public boolean setEmail(String email) {
        try {
            if (!Validate.isValidEmail(email)) {
                Flash.error("Digite um e-mail válido.");
                return false;
            }
            if (email.length() > 100) {
                Flash.error("E-mail possui no maximo 100 caracteres.");
                return false;
            }
            
            String sql = "SELECT COUNT(*) AS totalEmail FROM " + Hospede.table + " WHERE email = '" + email.trim().toUpperCase() + "' LIMIT 1";
            ResultSet resultSet = this.select(sql);
            if (resultSet.next()) {
                if (resultSet.getInt("totalEmail") == 0) {
                    return true;
                }
            }
            
            Flash.error("E-mail já cadastrado.");
            return false;
            
        } catch (Exception ex) {
            System.out.println("Erro na função setEmail();" + ex);
        }
        return false;
    }

    public boolean setCpf(String cpf) {
        if (cpf.equals("")) {
            Flash.error("CPF é obrigatório.");
            return false;
        }
        return true;
    }

    public boolean setNascimento(String nascimento) {
        if (nascimento.trim().isEmpty()) {
            Flash.error("Informe sua data de nascimento");
            return false;
        }
        return true;
    }

    public boolean setCep(String cep) {
        if (cep.trim().isEmpty()) {
            Flash.error("É obrigatório informar o CEP.");
            return false;
        }
        if (cep.trim().length() != 8) {
            Flash.error("CEP inválido.");
            return false;
        }

        return true;
    }

    public boolean setContato(String telefone, String celular) {
        if (telefone.trim().isEmpty() && celular.trim().isEmpty()) {
            Flash.error("É necessário informar um telefone/celular para contato.");
            return false;
        }
        return true;
    }

    public boolean setLogradouro(String logradouro) {
        if (logradouro.trim().isEmpty()) {
            Flash.error("É obrigatório informar o LOGRADOURO.");
            return false;
        }
        return true;
    }

    public boolean setNumero(String numero) {
        if (numero.trim().isEmpty()) {
            Flash.error("É necessário informar o NÚMERO DA CASA.");
            return false;
        }
        if (Integer.valueOf(numero) < 0) {
            Flash.error("O NÚMERO DA CASA não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public boolean setBairro(String bairro) {
        if (bairro.trim().isEmpty()) {
            Flash.error("É obrigatório informar o BAIRRO.");
            return false;
        }
        return true;
    }

    public boolean setCidade(String cidade) {
        if (cidade.trim().isEmpty()) {
            Flash.error("É obrigatório informar o BAIRRO.");
            return false;
        }
        return true;
    }

    public boolean setEstado(String estado) {
        if (estado.trim().isEmpty()) {
            Flash.error("É obrigatório informar o BAIRRO.");
            return false;
        }
        return true;
    }

    public boolean setDataInicial(GregorianCalendar data_inicial) {
        if (data_inicial == null) {
            Flash.error("Informe sua data de nascimento");
            return false;
        }
        return true;
    }

    public boolean setDataFinal(GregorianCalendar data_final) {
        if (data_final == null) {
            Flash.error("Informe sua data de nascimento");
            return false;
        }
        return true;
    }

    public boolean setTipoCartao(boolean one, boolean two, boolean three, boolean four, boolean five) {
        if (one || two || three || four || five) {
            return true;
        }
        Flash.error("Selecione uma opção um TIPO DE CARTÃO.");
        return false;
    }

    public int getTipoCartao(boolean one, boolean two, boolean three, boolean four) {
        if (one) {
            return 1;
        }
        if (two) {
            return 2;
        }
        if (three) {
            return 3;
        }
        if (four) {
            return 4;
        }
        return 5;
    }

    public boolean setCartaoCredito(String cartao_credito) {
        if (cartao_credito.trim().equals("")) {
            Flash.error("Informe o número do CARTÃO DE CRÉDITO.");
            return false;
        }
        if (cartao_credito.trim().length() < 12) {
            Flash.error("O CARTÃO DE CRÉDITO possui três (12) dígitos.");
            return false;
        }
        return true;
    }

    public boolean setDataVencimento(String data_vencimento) {
        if (data_vencimento.trim().equals("")) {
            Flash.error("Informe a DATA DE VENCIMENTO do cartão de credito.");
            return false;
        }
        return true;
    }

    public boolean setCodigoSeguranca(String codigo_seguranca) {
        if (codigo_seguranca.trim().equals("")) {
            Flash.error("Informe o CÓDIGO DE SEGURANÇA do cartão de credito.");
            return false;
        }
        if (codigo_seguranca.trim().length() < 3) {
            Flash.error("O CÓDIGO DE SEGURANÇA possui três (3) dígitos.");
            return false;
        }
        return true;
    }

    public void loadWebService(JTextField[] fields, JLabel label) {
        if (fields[0].getText().trim().length() == 8) { // cep
            label.setText("Aguarde...");
            WebServiceCep cep = WebServiceCep.searchCep(fields[0].getText().trim());
            fields[1].setText(cep.getLogradouroFull()); // logradouro
            fields[2].setText(cep.getCidade()); // cidade
            fields[3].setText(cep.getUf()); // estado
            fields[4].setText(cep.getBairro()); // bairro
            label.setText("");
            //ajaxStatus.setText(cep.getResultText().substring(10, cep.getResultText().length()).toUpperCase());
        } else {
            label.setText("Digite o cep (somente números)");
            fields[1].setText("");
            fields[2].setText("");
            fields[3].setText("");
            fields[4].setText("");
        }
    }

    public void cardsRadioButtons(JRadioButton[] radio) {
        if (radio[0].isSelected()) { // AmericanExpress
            Helper.setBorderPainted(radio[0], true);   // AmericanExpress
            Helper.setBorderPainted(radio[1], false);  // DinersClub
            Helper.setBorderPainted(radio[2], false);  // Elo
            Helper.setBorderPainted(radio[3], false);  // Mastercard
            Helper.setBorderPainted(radio[4], false);  // Visa

        } else if (radio[1].isSelected()) { // DinersClub
            Helper.setBorderPainted(radio[0], false);
            Helper.setBorderPainted(radio[1], true);
            Helper.setBorderPainted(radio[2], false);
            Helper.setBorderPainted(radio[3], false);
            Helper.setBorderPainted(radio[4], false);

        } else if (radio[2].isSelected()) { // Elo
            Helper.setBorderPainted(radio[0], false);
            Helper.setBorderPainted(radio[1], false);
            Helper.setBorderPainted(radio[2], true);
            Helper.setBorderPainted(radio[3], false);
            Helper.setBorderPainted(radio[4], false);

        } else if (radio[3].isSelected()) { // Mastercard
            Helper.setBorderPainted(radio[0], false);
            Helper.setBorderPainted(radio[1], false);
            Helper.setBorderPainted(radio[2], false);
            Helper.setBorderPainted(radio[3], true);
            Helper.setBorderPainted(radio[4], false);

        } else if (radio[4].isSelected()) { // Mastercard
            Helper.setBorderPainted(radio[0], false);
            Helper.setBorderPainted(radio[1], false);
            Helper.setBorderPainted(radio[2], false);
            Helper.setBorderPainted(radio[3], false);
            Helper.setBorderPainted(radio[4], true);
        }
    }

}
