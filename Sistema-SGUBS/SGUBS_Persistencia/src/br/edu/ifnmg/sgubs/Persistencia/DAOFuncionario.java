/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Funcionario;
import br.edu.ifnmg.sgubs.Aplicacao.FuncionarioRepositorio;
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
public class DAOFuncionario extends DAOGenerico<Funcionario> implements FuncionarioRepositorio{
    public DAOFuncionario(){
        setConsultaAbrir("select idfuncionario,nome,cpf,endereco,telefone,funcao from funcionario where id=?");
        setConsultaAlterar("update funcionario set nome = ?,cpf = ?,endereco= ?,telefone = ?,funcao = ? where id = ?");
        setConsultaApagar("delete from funcionario where id = ?");
        setConsultaInserir("insert into funcionario(nome,cpf,endereco,telefone,funcao) values(?,?,?,?,?)");
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        try {
            Funcionario tmp=new Funcionario();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
            tmp.setEndereco(resultado.getString(4));
            tmp.setTelefone(resultado.getInt(5));
            tmp.setFuncao(resultado.getString(6));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario obj) {
        try {
        sql.setString(1, obj.getNome());
        sql.setString(2, obj.getCpf());
        sql.setString(3, obj.getEndereco());
        sql.setInt(4, obj.getTelefone());
        sql.setString(5, obj.getFuncao());
         } catch (SQLException ex) {
             System.out.println(ex);
         }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCpf() != null) adicionarFiltro("cpf", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        try {
            int contador = 1;
            if(filtro.getId() > 0){ sql.setInt(contador, filtro.getId()); contador++; }
            if(filtro.getNome() != null ){ sql.setString(contador, filtro.getNome()); contador++; }
            if(filtro.getCpf() != null){ sql.setString(contador, filtro.getCpf()); contador++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Funcionario> Buscar(Funcionario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario Abrir(String cpf) {
          try {
            PreparedStatement sql = conn.prepareStatement("select id,nome,cpf from funcionario where cpf = ?");
            sql.setString(1, cpf);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){   
                return preencheObjeto(resultado);
            }            
        }  catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
}
