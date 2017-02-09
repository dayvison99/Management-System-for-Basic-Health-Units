/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.TecEnfermagem;
import br.edu.ifnmg.sgubs.Aplicacao.TecEnfermagemRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayvison
 */
public class DAOTecEnfermagem extends DAOGenerico<TecEnfermagem> implements TecEnfermagemRepositorio{
    
    public DAOTecEnfermagem(){
        setConsultaAbrir("select idTecEnfermagem, nome, coren, rua,bairro,cidade,telefone,celular from tecEnfermagem where idTecEnfermagem = ?");
        setConsultaApagar("delete from tecEnfermagem where idTecEnfermagem = ?");
        setConsultaInserir("insert into tecEnfermagem(nome, coren, rua,bairro,cidade,telefone,celular) values(?,?,?,?,?,?,?)");
        setConsultaAlterar("update tecEnfermagem set nome=?, coren=?,rua=?,bairro=?,cidade=?,telefone=?,celular=? where idTecEnfermagem = ?");
        setConsultaBuscar("select idTecEnfermagem, nome, coren, rua,bairro,cidade,telefone,celular from tecEnfermagem " );
    }

    @Override
    protected TecEnfermagem preencheObjeto(ResultSet resultado) {
        
        TecEnfermagem tmp = new TecEnfermagem();
         
        try {
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCoren(resultado.getString(3));
            tmp.setRua(resultado.getString(4));
            tmp.setBairro(resultado.getString(5));
            tmp.setCidade(resultado.getString(6));
            tmp.setTelefone(resultado.getInt(7));
            tmp.setCelular(resultado.getInt(8));
            return tmp;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, TecEnfermagem obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCoren());
            sql.setString(3, obj.getRua());
            sql.setString(4, obj.getBairro());
            sql.setString(5, obj.getCidade());
            sql.setInt(6, obj.getTelefone());
            sql.setInt(7, obj.getCelular());
            
            if(obj.getId()>0) sql.setInt(8, obj.getId());
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    protected void preencheFiltros(TecEnfermagem filtro) {
        if(filtro.getId()>0) adicionarFiltro("idTecEnfermagem","=");
        if(filtro.getNome() != null) adicionarFiltro("nome","like");
        if(filtro.getCoren()!=null) adicionarFiltro("coren","=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, TecEnfermagem filtro) {
        try {
            int contador = 1;
            if(filtro.getId()>0){sql.setInt(contador, filtro.getId()); contador++;}
            if(filtro.getNome() != null ) { sql.setString(contador, filtro.getNome()+"%");contador++;}
            if(filtro.getCoren() != null ) {sql.setString(contador, filtro.getCoren());contador++;}
            
        } catch (SQLException ex) {
                Logger.getLogger(DAOTecEnfermagem.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
  
    @Override
    public TecEnfermagem Abrir(String corem) {
        try {
            PreparedStatement sql=conn.prepareStatement("select idTecEnfermagem, nome ,coren from tecEnfermagem from tecEnfermagem where coren=?");
            sql.setString(1, corem);
            ResultSet resultado=sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}
