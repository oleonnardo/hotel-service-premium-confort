package app.controllers;

import vendor.interfaces.Controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import config.Flash;
import app.models.TipoServico;

/**
 *
 * @author leonardo
 */
public class TipoServicoController implements Controller {

    TipoServico tiposervico;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    public TipoServicoController(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }

    @Override
    public ResultSet index() {
        try {
            return this.tiposervico.all();            
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao buscar todos os registros.");
        }
        return null;
    }

    @Override
    public ResultSet store(Object[] request) {
        try {
            this.resultSet = this.tiposervico.create(request);
            if( this.resultSet.next() ){
                Flash.success("Tipo Serviço cadastrado.");
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
            this.resultSet = this.tiposervico.find(id);
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
            this.resultSet = this.tiposervico.update(request,id);
            if( this.resultSet.next() ){
                Flash.success("Tipo Serviço modificado.");
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
            this.resultSet = this.tiposervico.delete(id);
            if( this.resultSet.next() ){
                Flash.success("Tipo Serviço removido.");
                return this.index();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            Flash.error("Ocorreu ao remover o registro.");
        }
        return null;
    }
    
}
