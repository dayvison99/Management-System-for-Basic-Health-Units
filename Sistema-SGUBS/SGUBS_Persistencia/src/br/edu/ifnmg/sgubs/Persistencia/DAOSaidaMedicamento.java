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
        setConsultaAbrir("select idsaidaMedicamento,paciente_idpaciente,itens,data_2 from saidaMedicamento where idsaidaMedicamento=?");
        setConsultaAlterar("update saidaMedicamento set paciente_idpaciente = ?,itens = ?,data_2 = ? where idsaidaMedicamento = ?");
        setConsultaApagar("delete from saidaMedicamento where idsaidaMedicamento = ?");
        setConsultaInserir("insert into saidaMedicamento(idsaidaMedicamento,paciente_idpaciente,itens,data_2) values(?,?,?,?,?)");
        setConsultaBuscar("select idsaidaMedicamento,paciente_idpaciente,itens,data_2 from saidaMedicamento " );
        setConsultaUltimoId("select max(idsaidaMedicamento) from saidaMedicamento where  paciente_idpaciente = ? and itens = ? and data_2 = ?");
     pacientes = new DAOPaciente();
     medicamentos = new DAOMedicamento();
   
    }
   
       

    @Override
    protected SaidaMedicamento preencheObjeto(ResultSet resultado) {
        SaidaMedicamento tmp = new SaidaMedicamento();
        
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setPaciente(pacientes.Abrir( resultado.getInt(2)));
            tmp.setData( resultado.getDate(3)  );
            tmp.setItens(  carregaItens(tmp)  );
            
            return tmp;
        } catch (Exception e) {
        }
        return null;
    }

   
    @Override
    protected void preencheConsulta(PreparedStatement sql, SaidaMedicamento obj) {
        try {
            sql.setInt(1, obj.getPaciente().getId());
            sql.setDate(2, new java.sql.Date( obj.getData().getTime() ) );
           
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(DAOSaidaMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean Salvar(SaidaMedicamento obj){
        if(!super.Salvar(obj))
            return false;
        
        if(obj.getId() > 0 ){
            for(SaidaMedicamentosItens item : obj.getItens()){
                if(item.getId() == 0){
                    try {
                        String consulta = "insert into saidaMedicamentosItens(saidaMedicamento_idsaidaMedicamento, medicamento_idMedicamento,quantidade) values(?,?,?)";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, obj.getId());
                        sql.setInt(2, item.getMedicamento().getId());
                        sql.setInt(3, item.getQuantidade());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(DAOSaidaMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                        return false;
                    }
                } else {
                    try {
                        String consulta = "update saidaMedicamentositens set saidaMedicamento_idsaidaMedicamento = ?, medicamento_idMedicamento = ?,quantidade = ? where idsaidaMedicamentosItens = ?";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, obj.getId());
                        sql.setInt(2, item.getMedicamento().getId());
                        sql.setInt(3, item.getQuantidade());
                        sql.setInt(4, item.getId());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(DAOSaidaMedicamento.class.getName()).log(Level.SEVERE, null, ex);
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    

    @Override
    protected void preencheFiltros(SaidaMedicamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, SaidaMedicamento filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
     private List<SaidaMedicamentosItens> carregaItens(SaidaMedicamento obj){
        List<SaidaMedicamentosItens> ret = new ArrayList<>();
        String consulta = "select idsaidaMedicamentoIntens,medicamento_idMedicamento,paciente_idpaciente, quantidade from saidaMedicamentosItens where idsaidaMedicamentoIntens = ?";
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(consulta);
            
            sql.setInt(1, obj.getId());
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                SaidaMedicamentosItens item = new SaidaMedicamentosItens();
                
                item.setId(resultado.getInt(1));
                item.setSaida(obj);
                item.setMedicamento(medicamentos.Abrir( resultado.getInt(3)  )   );
                item.setQuantidade(  resultado.getInt(4)  );
                
                
                // Adiciona o objeto à lista
                ret.add(item);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }
    
}
    
