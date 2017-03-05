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
        setConsultaAbrir("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 from agendamento where idAgendamento");
        setConsultaApagar("delete from agendamento where id = ?");
        setConsultaInserir("insert into agendamento(unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 values(?,?,?,?,?)");
        setConsultaAlterar("update agendamento set unidadeDeSaude = ?,medico\n" +
"        setConsultaInserir(\"insert into agendamento(unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 values(?,?,?,?,?)\");\n" +
"        setConsultaAlterar(\"o_idMedico = ?,paciente_idpaciente = ?,horario= ?,data_2= ? where idAgendamento=?");
        setConsultaBuscar("select idAgendamento,unidadeDeSaude_idUnidadeDeSaude,medico_idMedico,paciente_idpaciente,horario,data_2 from agendamento " );
        setConsultaUltimoId("select max(idAgendamento) from agendamento where  unidadeDeSaude_idUnidadeDeSaude = ? and medico_idMedico = ? and paciente_idpaciente = ? and horario = ? and data_2 = ?");
   
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
            tmp.setHorario(resultado.getTime(5));
            tmp.setData(resultado.getDate(6));
            
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
        sql.setTime(4, obj.getHorario());
        sql.setDate(5, (Date) obj.getData());
        
        if(obj.getId() > 0) sql.setInt(6, obj.getId());
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
        
