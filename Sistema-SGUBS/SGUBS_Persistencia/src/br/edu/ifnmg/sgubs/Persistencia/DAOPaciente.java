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

/**
 *
 * @author dayvison
 */
public class DAOPaciente extends DAOGenerico<Paciente> implements PacienteRepositorio{
    
    public DAOPaciente(){
        setConsultaAbrir("select idpaciente,nome,cpf from paciente where id=?");
        setConsultaAlterar("update paciente set nome = ?,cpf= ? where id = ?");
        setConsultaApagar("delete from paciente where id = ?");
        setConsultaInserir("insert into paciente(especialidades_idespecialidade, nome, crm) values(?,?,?)");
    }

    @Override
    protected Paciente preencheObjeto(ResultSet resultado) {
        try {
           Paciente tmp=new Paciente(); 
           tmp.setId(resultado.getInt(1));
           tmp.setNome(resultado.getString(2));
           tmp.setCpf(resultado.getString(3));
           return tmp;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Paciente obj) {
        try {
            sql.setInt(1, obj.getId());
            sql.setString(2, obj.getNome());
            sql.setString(3, obj.getCpf());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Paciente> Buscar(Paciente filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente Abrir(String cpf) {
        try {
            PreparedStatement sql=conn.prepareStatement("select idpaciente, nome ,cpf for, paciente where cpf=?");
            sql.setString(1, cpf);
            ResultSet resultado=sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    
}
