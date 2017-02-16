/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Paciente;
import br.edu.ifnmg.sgubs.Aplicacao.PacienteRepositorio;
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
public class DAOPaciente extends DAOGenerico<Paciente> implements PacienteRepositorio{
    
    public DAOPaciente(){
        setConsultaAbrir("select idpaciente,nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho from paciente where idpaciente=?");
        setConsultaAlterar("update paciente set nome = ?,cpf= ?,rua = ?,bairro = ?,cidade = ?,telefone = ?,celular = ?,tipoSanguineo = ?,localTrabalho =? where idpaciente = ?");
        setConsultaApagar("delete from paciente where idpaciente = ?");
        setConsultaInserir("insert into paciente(nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho) values(?,?,?,?,?,?,?,?,?)");
        setConsultaBuscar("select idpaciente,nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho from paciente " );
        setConsultaUltimoId("select max(idpaciente) from paciente where nome = ? and cpf= ? and rua = ? and bairro = ? and cidade = ? and telefone = ? and celular = ? and tipoSanguineo = ? and localTrabalho =?");
    }

    @Override
    protected Paciente preencheObjeto(ResultSet resultado) {
         
        Paciente tmp=new Paciente(); 
        
         try {
           tmp.setId(resultado.getInt(1));
           tmp.setNome(resultado.getString(2));
           tmp.setCpf(resultado.getString(3));
           tmp.setRua(resultado.getString(4));
           tmp.setBairro(resultado.getString(5));
           tmp.setCidade(resultado.getString(6));
           tmp.setTelefone(resultado.getInt(7));
           tmp.setCelular(resultado.getInt(8));
           tmp.setTipoSanguineo(resultado.getString(9));
           tmp.setLocalTrabalho(resultado.getString(10));
           return tmp;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Paciente obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCpf());
            sql.setString(3, obj.getRua());
            sql.setString(4, obj.getBairro());
            sql.setString(5, obj.getCidade());
            sql.setInt(6, obj.getTelefone());
            sql.setInt(7, obj.getCelular());
            sql.setString(8, obj.getTipoSanguineo());
            sql.setString(9, obj.getLocalTrabalho());
            
            if(obj.getId()>0) sql.setInt(10,obj.getId());

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

   
    @Override
    public Paciente Abrir(String cpf) {
        try {
            PreparedStatement sql=conn.prepareStatement("select idpaciente,nome,cpf,rua,bairro,cidade,telefone,celular,tipoSanguineo,localTrabalho from paciente where cpf=?");
            sql.setString(1, cpf);
            ResultSet resultado=sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Paciente filtro) {
        if(filtro.getId()>0) adicionarFiltro("idpaciente","=");
        if(filtro.getNome()!=null)adicionarFiltro("nome","like");
        if(filtro.getCpf()!=null)adicionarFiltro("cpf", "=");
        if(filtro.getRua()!=null)adicionarFiltro("rua", "=");
        if(filtro.getBairro()!=null)adicionarFiltro("bairro", "=");
        if(filtro.getCidade()!=null)adicionarFiltro("cidade", "=");
        if(filtro.getTelefone()>0)adicionarFiltro("telefone", "=");
        if(filtro.getCelular()>0)adicionarFiltro("celular", "=");
        if(filtro.getTipoSanguineo()!=null)adicionarFiltro("tipoSanguineo", "=");
        if(filtro.getLocalTrabalho()!=null)adicionarFiltro("localTrabalho", "=");
        
                }

    @Override
    protected void preencheParametros(PreparedStatement sql, Paciente filtro) {
        try {
        int contador=1;
        if(filtro.getId()>0){sql.setInt(contador, filtro.getId());
        contador++;}
        if(filtro.getNome()!=null){sql.setString(contador,filtro.getNome() +"%");
        contador++;}
        if(filtro.getCpf()!=null){sql.setString(contador,filtro.getCpf());
        contador++;}
        if(filtro.getRua()!=null){sql.setString(contador, filtro.getRua());
        contador++;}
        if(filtro.getBairro()!=null){sql.setString(contador, filtro.getBairro());
        contador++;}
        if(filtro.getCidade()!=null){sql.setString(contador, filtro.getCidade());
        contador++;}
        if(filtro.getTelefone()>0){sql.setInt(contador, filtro.getTelefone());
        contador++;}
        if(filtro.getCelular()>0){sql.setInt(contador, filtro.getCelular());
        contador++;}
        if(filtro.getTipoSanguineo()!=null){sql.setString(contador, filtro.getTipoSanguineo());
        contador++;}
        if(filtro.getLocalTrabalho()!=null){sql.setString(contador, filtro.getTipoSanguineo());
        contador++;}
                
        }
        
    catch (SQLException ex) {
        Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE,null,ex);
    }
    }

   

    
}
