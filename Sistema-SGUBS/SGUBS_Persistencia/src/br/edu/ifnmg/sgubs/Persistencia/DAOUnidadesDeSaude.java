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
import java.util.List;

/**
 *
 * @author dayvison
 */
public class DAOUnidadesDeSaude extends DAOGenerico<UnidadesDeSaude> implements UnidadesDeSaudeRepositorio{
    public DAOUnidadesDeSaude(){
        setConsultaAbrir("select idUnidadeDeSaude,nome,rua,bairro from unidadeDeSaude where id=?");
        setConsultaAlterar("update unidadeDeSaude set nome = ?,rua = ?,bairro = ? where id = ?");
        setConsultaApagar("delete from unidadeDeSaude where id = ?");
        setConsultaInserir("insert into unidadeDeSaude(nome,rua,bairro) values(?,?,?)");
    }

    @Override
    protected UnidadesDeSaude preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, UnidadesDeSaude obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(UnidadesDeSaude filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, UnidadesDeSaude filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UnidadesDeSaude> Buscar(UnidadesDeSaude filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
