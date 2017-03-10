/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.ConsultaHistorico;
import br.edu.ifnmg.sgubs.Aplicacao.ConsultaHistoricoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dayvison
 */
public class DAOConsultaHistorico extends DAOGenerico<ConsultaHistorico> implements ConsultaHistoricoRepositorio{

    
    private DAOPaciente paciente;
    private DAOMedico medico;
        
    public DAOConsultaHistorico(){
        setConsultaAbrir("select idpaciente,nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho from paciente where idpaciente=?");
        setConsultaAlterar("update paciente set nome = ?,cpf= ?,rua = ?,bairro = ?,cidade = ?,telefone = ?,celular = ?,tipoSanguineo = ?,localTrabalho =? where idpaciente = ?");
        setConsultaApagar("delete from paciente where idpaciente = ?");
        setConsultaInserir("insert into paciente(nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho) values(?,?,?,?,?,?,?,?,?)");
        setConsultaBuscar("select idpaciente,nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho from paciente " );
        setConsultaUltimoId("select max(idpaciente) from paciente where nome = ? and cpf= ? and rua = ? and bairro = ? and cidade = ? and telefone = ? and celular = ? and tipoSanguineo = ? and localTrabalho =?");
        
        paciente = new DAOPaciente();
        medico = new DAOMedico();
    }
    
      @Override
    protected ConsultaHistorico preencheObjeto(ResultSet resultado) {
         
        ConsultaHistorico tmp=new ConsultaHistorico(); 
        
         try {
           tmp.setId(resultado.getInt(1));
           tmp.setMedico(medico.Abrir(resultado.getInt(2)));
           tmp.setPaciente(paciente.Abrir(resultado.getInt(3)));
           tmp.setDate(resultado.getDate(4));
           tmp.setPeriodo(resultado.getString(5));
           tmp.setPrescricaoMedica(resultado.getString(6));
           tmp.setPressaoArterial(resultado.getFloat(7));
           tmp.setPeso(resultado.getFloat(8));
           tmp.setAltura(resultado.getFloat(9));
           return tmp;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return null;
    }
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, ConsultaHistorico obj) {
        try {
            sql.setInt(1, obj.getMedico().getId());
            sql.setInt(2, obj.getPaciente().getId());
            sql.setDate(3,new java.sql.Date(obj.getDate().getTime()));
            sql.setString(4, obj.getPeriodo());
            sql.setString(5, obj.getPrescricaoMedica());
            sql.setFloat(6, (float) obj.getPressaoArterial());
            sql.setFloat(7, (float) obj.getPeso());
            sql.setFloat(8, (float) obj.getAltura());
            
            
            if(obj.getId()>0) sql.setInt(9,obj.getId());

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
     
    
     protected void preencheFiltros(ConsultaHistorico filtro) {
        if(filtro.getId()>0) adicionarFiltro("idpaciente","=");
        
        
                }

    @Override
    protected void preencheParametros(PreparedStatement sql, ConsultaHistorico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
 
    
    
}
