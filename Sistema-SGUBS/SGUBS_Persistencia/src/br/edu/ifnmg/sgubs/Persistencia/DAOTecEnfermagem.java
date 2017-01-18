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

/**
 *
 * @author dayvison
 */
public class DAOTecEnfermagem extends DAOGenerico<TecEnfermagem> implements TecEnfermagemRepositorio{
    
    public DAOTecEnfermagem(){
        setConsultaAbrir("select idTecEnfermagem, nome, coren, rua,bairro,cidade,telefone,celular from tecEnfermagem where id = ?");
        setConsultaApagar("delete from tecEnfermagem where id = ?");
        setConsultaInserir("insert into tecEnfermagem(nome, coren, rua,bairro,cidade,telefone,celular) values(?,?,?,?,?,?,?)");
        setConsultaAlterar("update tecEnfermagem set nome=?, coren=?,rua=?,bairro=?,cidade=?,telefone=?,celular=? where id = ?");
     
    }

    @Override
    protected TecEnfermagem preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, TecEnfermagem obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(TecEnfermagem filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, TecEnfermagem filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
