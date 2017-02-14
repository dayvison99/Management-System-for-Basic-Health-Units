/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Medicamento;
import br.edu.ifnmg.sgubs.Aplicacao.MedicamentoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayvison
 */
public class DAOMedicamento extends DAOGenerico<Medicamento> implements MedicamentoRepositorio{
    
    
    public DAOMedicamento(){
        setConsultaAbrir("select idMedicamento, nome, descricao, quantidade from medicamento where idMedicamento = ?");
        setConsultaApagar("delete from medicamento where idMedicamento = ?");
        setConsultaInserir("insert into medicamento(nome, descricao, quantidade) values(?,?,?)");
        setConsultaAlterar("update medicamento set nome=?, descricao=?, quantidade=? where idMedicamento = ?");
        setConsultaBuscar("select idMedicamento, nome, descricao, quantidade from medicamento " );
        setConsultaUltimoId("select max(idMedicamento) from medicamento where nome = ? and descricao= ? and quantidade= ? ");
     }

   
    @Override
    protected Medicamento preencheObjeto(ResultSet resultado) {
             
        Medicamento tmp = new Medicamento();
        
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setDescricao(resultado.getString(3));
            tmp.setQuantidade(resultado.getInt(4));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Medicamento obj) {
        try{
            sql.setString(1, obj.getNome());
            sql.setString(2,obj.getDescricao());
            sql.setInt(3, obj.getQuantidade());
            
            if(obj.getId()>0) sql.setInt(4,obj.getId());
        }catch(SQLException ex){
            System.out.println();
        }
    }

    @Override
    protected void preencheFiltros(Medicamento filtro) {
        if(filtro.getId()> 0) adicionarFiltro("idMedicamento", "=");
        if(filtro.getNome()!=null)adicionarFiltro("nome", "like");
        if(filtro.getDescricao()!=null)adicionarFiltro("descricao", "=");
        if(filtro.getQuantidade()> 0)adicionarFiltro("quantidade", "=");
        
       
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Medicamento filtro) {
        try {
            int contador = 1;
            if(filtro.getId()>0){ sql.setInt(contador, filtro.getId());contador++;}
            if(filtro.getNome() != null){sql.setString(contador, filtro.getNome()+"%");contador++;}
       
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
