/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;


import br.edu.ifnmg.sgubs.Aplicacao.Entidade;
import br.edu.ifnmg.sgubs.Aplicacao.Repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dayvison
 * @param <T>
 */

public abstract class DAOGenerico<T extends Entidade> implements Repositorio<T>{
    
    protected Connection conn;
    
    private String consultaAbrir;
    private String consultaApagar;
    private String consultaInserir;
    private String consultaAlterar;
    private String consultaBusca;
    
    private String where = "";

    public DAOGenerico(){
    try {
            ConectarBD.Iniciar();
            conn = ConectarBD.criarConexao();
        } catch(ClassNotFoundException ex){ 
            System.out.println("Driver não encontrado!");
        } catch(SQLException ex){ 
            System.out.println("Usuário/senha errados!");
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    protected abstract T preencheObjeto(ResultSet resultado);
    protected abstract void preencheConsulta(PreparedStatement sql, T obj);
    protected abstract void preencheFiltros(T filtro);
    protected abstract void preencheParametros(PreparedStatement sql, T filtro);
    
    @Override
    public boolean Salvar(T obj) {
        try {
            if(obj.getId() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.prepareStatement(getConsultaInserir());
                // Passa os parâmetros para a consulta SQL
                
                preencheConsulta(sql, obj);              
                
                // Executa a consulta SQL
                sql.executeUpdate();
                
            } else {
                // Objeto já está no BD, atualizar
                
                // Cria a consulta sql
                PreparedStatement sql = conn.prepareStatement(getConsultaAlterar());
                
                preencheConsulta(sql, obj);
                
                // Executa a consulta SQL
                sql.executeUpdate();
   
            }
            return true;
        
        } catch(SQLException e){
            System.out.print(e);
            
        }
        return false;
    }

    @Override
    public boolean Apagar(T obj) {
        try {
            if(obj.getId() > 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.prepareStatement(getConsultaApagar());
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getId());
                                
                // Executa a consulta SQL
                sql.executeUpdate();
            
            }
            
            return true;
        
        } catch(SQLException e){
            System.out.print(e);
            
        }
        return false;
    }
    
    @Override
    public T Abrir(int id) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(getConsultaAbrir());
            
            // Passo os parâmentros para a consulta sql
            sql.setInt(1, id);
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
            
            // Verifica se algum registro foi retornado na consulta
            if(resultado.next()){
                
                // Retorna o objeto
                return preencheObjeto(resultado);
            }            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return null;
    }

    @Override
    public List<T> Buscar(T filtro) {
        List<T> ret = new ArrayList<>();
        
        preencheFiltros(filtro);
        
        if(where.length() > 0 )
            where = "WHERE " + where;
        
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(getConsultaBusca() + where);
            
            preencheParametros(sql,filtro);
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                
                T tmp = preencheObjeto(resultado);
                
                // Adiciona o objeto à lista
                ret.add(tmp);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }
    
    protected void adicionarFiltro(String campo, String operador){
        if(where.length() > 0)
            where = where + " and ";
        
        where = where + campo + " " + operador + " ?";
    }

    public String getConsultaAbrir() {
        return consultaAbrir;
    }

    public void setConsultaAbrir(String consultaAbrir) {
        this.consultaAbrir = consultaAbrir;
    }

    public String getConsultaApagar() {
        return consultaApagar;
    }

    public void setConsultaApagar(String consultaApagar) {
        this.consultaApagar = consultaApagar;
    }

    public String getConsultaInserir() {
        return consultaInserir;
    }

    public void setConsultaInserir(String consultaInserir) {
        this.consultaInserir = consultaInserir;
    }

    public String getConsultaAlterar() {
        return consultaAlterar;
    }

    public void setConsultaAlterar(String consultaAlterar) {
        this.consultaAlterar = consultaAlterar;
    }

    public String getConsultaBusca() {
        return consultaBusca;
    }

    public void setConsultaBusca(String consultaBusca) {
        this.consultaBusca = consultaBusca;
    }
    
    
}
