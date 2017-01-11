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


/**
 *
 * @author dayvison
 */
public class DAOMedico extends DAOGenerico<Medico> implements MedicoRepositorio{
    
     public DAOMedico() {
        setConsultaAbrir("select idMedico, nome, crm from medico where id = ?");
        setConsultaApagar("delete from medico where id = ?");
        setConsultaInserir("insert into medico(especialidades_idespecialidade, nome, crm) values(?,?,?)");
        setConsultaAlterar("update medicos set nome = ?, crm = ? where id = ?");
        
    }

    @Override
    protected Medico preencheObjeto(ResultSet resultado) {
        try {
          Medico tmp = new Medico();
          tmp.setId(resultado.getInt(1));
          tmp.setNome(resultado.getString(2));
          tmp.setCrm(resultado.getString(3));
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
    public List<Medico> Buscar(Medico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
