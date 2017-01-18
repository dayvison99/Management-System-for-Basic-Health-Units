/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Agendamento;
import br.edu.ifnmg.sgubs.Aplicacao.AgendamentoRepositorio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dayvison
 */
public class DAOAgendamento extends DAOGenerico<Agendamento> implements AgendamentoRepositorio{
    
    public DAOAgendamento(){
        setConsultaAbrir("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 from agendamento where data_2");
        setConsultaApagar("delete from agendamento where id = ?");
        setConsultaInserir("insert into agendamento(unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 values(?,?,?,?,?)");
        setConsultaAlterar("update agendamento set unidadeDeSaude = ?,medico_idMedico = ?,paciente_idpaciente = ?,horario= ?,data_2= ? where id=?");
    }

    @Override
    protected Agendamento preencheObjeto(ResultSet resultado) {
      try {
            Agendamento tmp=new Agendamento();
            tmp.setId(resultado.getInt(1));
            tmp.setIdUnidadeSaude(resultado.getInt(2));
            tmp.setIdMedico(resultado.getInt(3));
            tmp.setIdPaciente(resultado.getInt(4));
            tmp.setHorario(resultado.getTime(5));
            tmp.setData(resultado.getDate(6));
        } catch (SQLException ex) {
            System.out.println(ex);
        }  
      return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Agendamento obj) {
        try{
        sql.setInt(1, obj.getIdUnidadeSaude());
        sql.setInt(2, obj.getIdMedico());
        sql.setInt(3, obj.getIdPaciente());
        sql.setTime(4, obj.getHorario());
        sql.setDate(5, (Date) obj.getData());
        }catch(SQLException ex){
            System.out.println();
        }
    }

    @Override
    public List<Agendamento> Buscar(Agendamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(Agendamento filtro) {
       // if(filtro.getId() > 0) adicionarFiltro("id", "=");
       // if(filtro.getIdUnidadeSaude() >0)adicionarFiltro(campo, operador)
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Agendamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
