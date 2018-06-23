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
public class Usuario extends Model {

    public final static String table = "usuario";

    private int id;

    private String nome;
    private String usuario;
    private String senha;
    private int nivel_acesso;
    private int ativo;

    public boolean setNome(String nome) {
        if (nome.trim().equals("")) {
            Flash.error("Campo NOME é obrigatório.");
            return false;
        }
        if (nome.trim().length() >= 100) {
            Flash.error("Limite máximo de 100 caracteres para o NOME.");
            return false;
        }
        return true;
    }

    public boolean setUsuario(String usuario) {
        if (usuario.trim().equals("")) {
            Flash.error("Campo USUÁRIO é obrigatório.");
            return false;
        }
        if (usuario.trim().length() >= 50) {
            Flash.error("Limite máximo de 50 caracteres para o USUÁRIO.");
            return false;
        }
        return true;
    }

    public boolean setSenha(String senha) {
        if (senha.trim().equals("")) {
            Flash.error("Campo SENHA é obrigatório.");
            return false;
        }
        return true;
    }
    
    public boolean haveAny(String usuario) throws Exception {
        try {
            if (this.hasOne(Usuario.table, "usuario", usuario)) {
                Flash.error("Nome de usuário já cadastrado");
                return false;
            }else{    
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new Exception("Ocorreu um erro na consulta com o banco de dados: function haveAny() --- ", ex);
        }
    }


}
