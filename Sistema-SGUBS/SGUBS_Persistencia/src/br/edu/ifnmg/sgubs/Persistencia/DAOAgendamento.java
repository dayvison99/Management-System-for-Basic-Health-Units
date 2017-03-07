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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayvison
 */
public class DAOAgendamento extends DAOGenerico<Agendamento> implements AgendamentoRepositorio{
    
    private DAOPaciente paciente;
    private DAOUnidadesDeSaude unidadeDeSaude;
    private DAOMedico medico;
    
    
    public DAOAgendamento(){
        setConsultaAbrir("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,turno,data_2,motivo from agendamento where idAgendamento");
        setConsultaApagar("delete from agendamento where id = ?");
        setConsultaInserir("insert into agendamento(unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,turno,data_2,motivo) values(?,?,?,?,?,?)");
        setConsultaAlterar("update agendamento set unidadeDeSaude_idUnidadeDeSaude = ?,medico_idMedico =?,paciente_idpaciente =?,turno =?,data_2=?,motivo =? where idAgendamento");
        setConsultaBuscar("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,turno,data_2,motivo from agendamento " );
        setConsultaUltimoId("select max(idAgendamento) from agendamento where  unidadeDeSaude_idUnidadeDeSaude = ? and medico_idMedico = ? and paciente_idpaciente = ? and turno = ? and data_2 = ? and motivo = ?");
   
        paciente = new DAOPaciente();
        unidadeDeSaude = new DAOUnidadesDeSaude();
        medico = new DAOMedico();
    }

    @Override
    protected Agendamento preencheObjeto(ResultSet resultado) {
        Agendamento tmp=new Agendamento();
        
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setUnidadeSaude( unidadeDeSaude.Abrir( resultado.getInt(2)));
            tmp.setMedico(medico.Abrir(resultado.getInt(3)));
            tmp.setPaciente(paciente.Abrir(resultado.getInt(4)));
            tmp.setTurno(resultado.getString(5));
            tmp.setData(resultado.getDate(6));
            tmp.setMotivo(resultado.getString(7));
            
            return tmp;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }  
      return null;
    }
    
    

    @Override
    protected void preencheConsulta(PreparedStatement sql, Agendamento obj) {
        try{
        sql.setInt(1, obj.getUnidadeSaude().getId());
        sql.setInt(2, obj.getMedico().getId());
        sql.setInt(3, obj.getPaciente().getId());
        sql.setString(4, obj.getTurno());
        sql.setDate(5,new java.sql.Date(obj.getData().getTime()));
        sql.setString(6, obj.getMotivo());
        
        if(obj.getId() > 0) sql.setInt(7, obj.getId());
        }catch(SQLException ex){
            System.out.println();
        }
    }

    

    @Override
    protected void preencheFiltros(Agendamento filtro) {
        if(filtro.getId() > 0) adicionarFiltro("idAgendamneto", "=");
        if(filtro.getUnidadeSaude()!=null)adicionarFiltro("unidadeDeSaude_idUnidadeDeSaude", "like");
        if(filtro.getMedico()!=null) adicionarFiltro("medico_idMedico", "like");
        if(filtro.getPaciente()!=null) adicionarFiltro("paciente_idpaciente", "like");
        
    }
    
 //  idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 

    @Override
    protected void preencheParametros(PreparedStatement sql, Agendamento filtro) {
        try {
        int contador=1;
        if(filtro.getId()>0){sql.setInt(contador, filtro.getId());
        contador++;}
        if(filtro.getUnidadeSaude()!=null){sql.setString(contador,filtro.getUnidadeSaude() +"%");
        contador++;}
        if(filtro.getPaciente() != null) {sql.setString(contador, filtro.getPaciente() + "%");
        contador++;}
        }
        
    catch (SQLException ex) {
        Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE,null,ex);
    }

}

  
}
        
