/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamento;
import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamentoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dayvison
 */
public class DAOSaidaMedicamento extends DAOGenerico<SaidaMedicamento> implements SaidaMedicamentoRepositorio{
    
    public DAOSaidaMedicamento(){
        setConsultaAbrir("select idsaidaMedicamento,paciente_idpaciente,medicamento_idMedicamento,qtde,data_2 from saidaMedicamento where idsaidaMedicamento=?");
        setConsultaAlterar("update saidaMedicamento set paciente_idpaciente = ?,medicamento_idMedicamento= ?,qtde = ?,data_2 = ? where idsaidaMedicamento = ?");
        setConsultaApagar("delete from saidaMedicamento where idsaidaMedicamento = ?");
        setConsultaInserir("insert into saidaMedicamento(idsaidaMedicamento,paciente_idpaciente,medicamento_idMedicamento,qtde,data_2) values(?,?,?,?,?)");
        setConsultaBuscar("select idsaidaMedicamento,paciente_idpaciente,medicamento_idMedicamento,qtde,data_2 from saidaMedicamento " );
        setConsultaUltimoId("select max(idsaidaMedicamento) from saidaMedicamento where  paciente_idpaciente = ? and medicamento_idMedicamento= ? and qtde = ? and data_2 = ?");
    }

    @Override
    protected SaidaMedicamento preencheObjeto(ResultSet resultado) {
        SaidaMedicamento tmp = new SaidaMedicamento();
        
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setPaciente(resultado.getString(2));
        } catch (Exception e) {
        }
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, SaidaMedicamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
