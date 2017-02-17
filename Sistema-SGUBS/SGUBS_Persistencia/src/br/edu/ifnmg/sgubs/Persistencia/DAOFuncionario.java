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
        setConsultaAbrir("select idfuncionario,nome,cpf,rua,bairro,cidade,telefone,celular,funcao from funcionario where id=?");
        setConsultaAlterar("update funcionario set nome = ?,cpf = ?,rua= ?,bairro=?,cidade=?,telefone = ?,funcao = ? where id = ?");
        setConsultaApagar("delete from funcionario where id = ?");
        setConsultaInserir("insert into funcionario(nome,cpf,rua,bairro,cidade,telefone,celular,funcao) values(?,?,?,?,?,?,?,?)");
        setConsultaBuscar("select idfuncionario,nome,cpf,rua,bairro,cidade,telefone,celular,funcao from funcionario " );
        setConsultaUltimoId("select max(idFuncionario) from funcionario where nome = ? and cpf= ? and rua = ? and bairro = ? and cidade = ? and telefone = ? and celular = ? and funcao = ? ");
    
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        try {
            Funcionario tmp=new Funcionario();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
            tmp.setRua(resultado.getString(4));
            tmp.setBairro(resultado.getString(5));
            tmp.setCidade(resultado.getString(6));
            tmp.setTelefone(resultado.getInt(7));
            tmp.setCelular(resultado.getInt(8));
            tmp.setFuncao(resultado.getString(9));
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
        sql.setString(3, obj.getRua());
        sql.setString(4, obj.getBairro());
        sql.setString(5, obj.getCidade());
        sql.setInt(6, obj.getTelefone());
        sql.setInt(7, obj.getCelular());
        sql.setString(8, obj.getFuncao());
        
        if(obj.getId()>0) sql.setInt(9,obj.getId());
         } catch (SQLException ex) {
             System.out.println(ex);
         }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getId() > 0) adicionarFiltro("idFuncionario", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCpf() != null) adicionarFiltro("cpf", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        try {
            int contador = 1;
            if(filtro.getId() > 0){ sql.setInt(contador, filtro.getId()); contador++; }
            if(filtro.getNome() != null ){ sql.setString(contador, filtro.getNome()+"%"); contador++; }
            if(filtro.getCpf() != null){ sql.setString(contador, filtro.getCpf()); contador++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Funcionario Abrir(String cpf) {
          try {
            PreparedStatement sql = conn.prepareStatement("select idFuncionario,nome,cpf from funcionario where cpf = ?");
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
