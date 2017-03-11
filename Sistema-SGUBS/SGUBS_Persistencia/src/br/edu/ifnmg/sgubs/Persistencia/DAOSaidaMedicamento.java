/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Paciente;
import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamento;
import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamentosItens;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayvison
 */
public class DAOSaidaMedicamento extends DAOGenerico<SaidaMedicamento> implements SaidaMedicamentoRepositorio{
    
    private DAOPaciente pacientes;
    private DAOMedicamento medicamentos;
    
    public DAOSaidaMedicamento(){
        setConsultaAbrir("select idsaidaMedicamento,paciente_idpaciente,medicamento_idMedicamento,quantidade,prescricao,data_2 from saidaMedicamento where idsaidaMedicamento=?");
        setConsultaAlterar("update saidaMedicamento set paciente_idpaciente = ?,medicamento_idMedicamento = ?,quantidade = ?,prescricao = ?,data_2 = ? where idsaidaMedicamento = ?");
        setConsultaApagar("delete from saidaMedicamento where idsaidaMedicamento = ?");
        setConsultaInserir("insert into saidaMedicamento(paciente_idpaciente,medicamento_idMedicamento,quantidade,prescricao,data_2) values(?,?,?,?,?)");
        setConsultaBuscar("select idsaidaMedicamento,paciente_idpaciente,medicamento_idMedicamento,quantidade,prescricao,data_2 from saidaMedicamento " );
        setConsultaUltimoId("select max(idsaidaMedicamento) from saidaMedicamento where  paciente_idpaciente = ? and medicamento_idMedicamento = ? and quantidade = ? and prescricao =? and data_2 = ?");
     pacientes = new DAOPaciente();
     medicamentos = new DAOMedicamento();
   
    }
   
       

    @Override
    protected SaidaMedicamento preencheObjeto(ResultSet resultado) {
        SaidaMedicamento tmp = new SaidaMedicamento();
        
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setPaciente(pacientes.Abrir( resultado.getInt(2)));
            tmp.setMedicamento(medicamentos.Abrir( resultado.getInt(3)));
            tmp.setQuantidade(resultado.getInt(4));
            tmp.setPrescricao(resultado.getString(5));
            tmp.setData(resultado.getDate(6));
          
            
            return tmp;
        } catch (Exception e) {
        }
        return null;
    }

   
    @Override
    protected void preencheConsulta(PreparedStatement sql, SaidaMedicamento obj) {
        try {
            sql.setInt(1, obj.getPaciente().getId());
            sql.setInt(2, obj.getMedicamento().getId());
            sql.setInt(3, obj.getQuantidade());
            sql.setString(4, obj.getPrescricao());
            sql.setDate(5, new java.sql.Date( obj.getData().getTime()));
           
            if(obj.getId() > 0) sql.setInt(6, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(DAOSaidaMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(SaidaMedicamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, SaidaMedicamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
    
