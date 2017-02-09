/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Especialidade;
import br.edu.ifnmg.sgubs.Aplicacao.EspecialidadeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayvison
 */
public class DAOEspecialidade extends DAOGenerico<Especialidade> implements EspecialidadeRepositorio{
    
    public DAOEspecialidade(){
        setConsultaAbrir("select idEspecialidade,especialidade from especialidade where idEspecialidade = ?");
        setConsultaApagar("delete from especialidade where idEspecialidade = ?");
        setConsultaInserir("insert into especialidade(especialidade) values(?)");
        setConsultaAlterar("update especialidade set especialidade = ? where idEspecialidade = ?");
        setConsultaBuscar("select idEspecialidade,especialidade from especialidade " );
        
        
    }

    @Override
    protected Especialidade preencheObjeto(ResultSet resultado) {
        try {
            Especialidade tmp = new Especialidade();
            tmp.setId(resultado.getInt(1));
            tmp.setEspecialidade(resultado.getString(2));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Especialidade obj) {
        try {
            
            sql.setString(1, obj.getEspecialidade());
            
            if(obj.getId()>0) sql.setInt(2,obj.getId());

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    protected void preencheFiltros(Especialidade filtro) {
        if(filtro.getId()>0) adicionarFiltro("idEspecialidade", "=");
        if(filtro.getEspecialidade() != null) adicionarFiltro("especialidade"," like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Especialidade filtro) {
        try {
            int contador = 1;
            if(filtro.getId()>0) { sql.setInt(contador, filtro.getId());contador++;}
            if(filtro.getEspecialidade() != null) { sql.setString(contador, filtro.getEspecialidade()+"%");contador++;}
        } catch (SQLException ex) {
            Logger.getLogger(DAOEspecialidade.class.getName()).log(Level.SEVERE, null ,ex);
            
        }
    }
    
}
