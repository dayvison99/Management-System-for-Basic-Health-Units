/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaude;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaudeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author dayvison
 */
public class DAOUnidadesDeSaude extends DAOGenerico<UnidadesDeSaude> implements UnidadesDeSaudeRepositorio{
    public DAOUnidadesDeSaude(){
        setConsultaAbrir("select idUnidadeDeSaude,nome,rua,bairro from unidadeDeSaude where idUnidadeDeSaude=?");
        setConsultaAlterar("update unidadeDeSaude set nome = ?,rua = ?,bairro = ? where idUnidadeDeSaude = ?");
        setConsultaApagar("delete from unidadeDeSaude where idUnidadeDeSaude = ?");
        setConsultaInserir("insert into unidadeDeSaude(nome,rua,bairro) values(?,?,?)");
        setConsultaBuscar("select idUnidadeDeSaude,nome,rua,bairro from unidadeDeSaude " );
    }

    @Override
    protected UnidadesDeSaude preencheObjeto(ResultSet resultado) {
        try {
            UnidadesDeSaude tmp = new UnidadesDeSaude();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setRua(resultado.getString(3));
            tmp.setBairro(resultado.getString(4));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, UnidadesDeSaude obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getRua());
            sql.setString(3, obj.getBairro());
            
            if(obj.getId()>0) sql.setInt(4, obj.getId());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
   
    }

    @Override
    protected void preencheFiltros(UnidadesDeSaude filtro) {
        if(filtro.getId()>0) adicionarFiltro("idUnidadeDeSaude", "=");
        if(filtro.getNome()!=null) adicionarFiltro("nome", "like");
        
    }

    @Override
   protected void preencheParametros(PreparedStatement sql, UnidadesDeSaude filtro) {
         try {
            int contador = 1;
            if(filtro.getId() > 0){ sql.setInt(contador, filtro.getId()); contador++; }
            if(filtro.getNome() != null ){ sql.setString(contador, filtro.getNome()+"%"); contador++; }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUnidadesDeSaude.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    
}
