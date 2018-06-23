/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import config.Flash;
import vendor.eloquent.Model;

/**
 *
 * @author LEONARDO
 */
public class Sistema extends Model {

    public final static String table = "sistema";

    private int id;

    private int tarifacao;
    private double valor_tarifacao;
    private int babysitter_por_hora;
    private int babysitter_idade_min;
    private int babysitter_idade_max;

    public boolean setTarifacao(boolean yes, boolean no) {
        if (yes || no) {
            return true;
        }
        Flash.error("Selecione uma opção no item TARIFAÇÃO.");
        return false;
    }

    public boolean setValorTarifacao(String valor_tarifacao) {
        if(valor_tarifacao.equals("")){
            Flash.error("Campo VALOR DA TARIFAÇÃO é obrigatório.");
            return false;
        }
        if (Double.valueOf(valor_tarifacao) <= 0) {
            Flash.error("Campo VALOR DA TARIFAÇÃO não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public boolean setBabysitterPorHora(boolean yes, boolean no) {
        if (yes || no) {
            return true;
        }
        Flash.error("Selecione uma opção no item BABYSITTER POR HORA.");
        return false;
    }

    public boolean setBabysitterIdadeMin(String babysitter_idade_min) {
        if(babysitter_idade_min.equals("")){
            Flash.error("Campo BABYSITTER IDADE MINIMA é obrigatório.");
            return false;
        }
        if (Integer.valueOf(babysitter_idade_min) <= 0) {
            Flash.error("Campo BABYSITTER IDADE MINIMA não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public boolean setBabysitterIdadeMax(String babysitter_idade_max) {
        if(babysitter_idade_max.equals("")){
            Flash.error("Campo BABYSITTER IDADE MÁXIMA é obrigatório.");
            return false;
        }
        if (Integer.valueOf(babysitter_idade_max) <= 0) {
            Flash.error("Campo BABYSITTER IDADE MÁXIMA não pode ser negativo ou nulo.");
            return false;
        }
        return true;
    }

    public boolean setBabysitterIdades(int idade_min, int idade_max) {
        if(idade_min == idade_max){
            Flash.error("As idades não podem ser iguais.");
            return false;
        }
        if (idade_min > idade_max) {
            Flash.error("A IDADE MINIMA não pode ser maior que a IDADE MÁXIMA.");
            return false;
        }
        return true;
    }

}
