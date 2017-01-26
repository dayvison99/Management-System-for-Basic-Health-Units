    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
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
public class DAOMedico extends DAOGenerico<Medico> implements MedicoRepositorio{
    
     public DAOMedico() {
        setConsultaAbrir("select idMedico,especialidade_idEspecialidade, nome, crm,rua,bairro,cidade,telefone,celular,observacoes from medico where idMedico = ?");
        setConsultaApagar("delete from medico where idMedico = ?");
            setConsultaInserir("insert into medico(especialidade_idEspecialidade, nome, crm,rua,bairro,cidade,telefone,celular,observacoes) values(?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("update medico set especialidade_idEspecialidade =?, nome=?, crm=?,rua=?,bairro=?,cidade=?,telefone=?,celular=?,observacoes=? where idMedico = ?");
         setConsultaBuscar("select idMedico,especialidade_idEspecialidade, nome, crm,rua,bairro,cidade,telefone,celular,observacoes from medico " );
    }

    @Override
    protected Medico preencheObjeto(ResultSet resultado) {
        try {
          Medico tmp = new Medico();
          tmp.setId(resultado.getInt(1));
          tmp.setNome(resultado.getString(2));
          tmp.setCrm(resultado.getString(3));
          tmp.setRua(resultado.getString(4));
          tmp.setBairro(resultado.getString(5));
          tmp.setCidade(resultado.getString(6));
          tmp.setTelefone(resultado.getInt(7));
          tmp.setCelular(resultado.getInt(8));
          tmp.setObservacoes(resultado.getString(9));
          return tmp;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
       return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Medico obj) {
       try{
       sql.setInt(1, obj.getIdEspecialidade());
       sql.setString(2, obj.getNome());
       sql.setString(3, obj.getCrm());
       sql.setString(4, obj.getRua());
       sql.setString(5, obj.getBairro());
       sql.setString(6, obj.getCidade());
       sql.setInt(7, obj.getTelefone());
       sql.setInt(8, obj.getCelular());
       sql.setString(9, obj.getObservacoes());
       } catch(SQLException ex){
         System.out.println(ex);
       }
    }

    @Override
    public Medico Abrir(String crm) {
        try{
        PreparedStatement sql=conn.prepareStatement("select idMedico, nome, crm from medico where crm=?");
        sql.setString(1, crm);
        ResultSet resultado=sql.executeQuery();
        if(resultado.next()) return preencheObjeto(resultado);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

   
    @Override
    protected void preencheFiltros(Medico filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCrm()!= null) adicionarFiltro("cpf", "=");
   
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Medico filtro) {
         try {
            int contador = 1;
            if(filtro.getId() > 0){ sql.setInt(contador, filtro.getId()); contador++; }
            if(filtro.getNome() != null ){ sql.setString(contador, filtro.getNome()+"%"); contador++; }
            if(filtro.getCrm()!= null){ sql.setString(contador, filtro.getCrm()); contador++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
        
   

