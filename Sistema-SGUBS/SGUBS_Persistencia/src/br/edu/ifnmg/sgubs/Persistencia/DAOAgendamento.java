/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Agendamento;
import br.edu.ifnmg.sgubs.Aplicacao.AgendamentoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author dayvison
 */
public class DAOAgendamento extends DAOGenerico<Agendamento> implements AgendamentoRepositorio{
    
    public DAOAgendamento(){
        setConsultaAbrir("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente");
        setConsultaApagar("delete from agendamento where id = ?");
        setConsultaInserir("insert into agendamento(unidadeDeSaude_idUnidadeDeSaude)");
        setConsultaAlterar("update agendamento set unidadeDeSaude = ?,medico_idMedico = ?,paciente_idpaciente = ? where id=?");
    }

    @Override
    protected Agendamento preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Agendamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Agendamento> Buscar(Agendamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
