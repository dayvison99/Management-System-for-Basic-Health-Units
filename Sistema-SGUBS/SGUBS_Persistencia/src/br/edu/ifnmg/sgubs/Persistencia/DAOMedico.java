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


/**
 *
 * @author dayvison
 */
public class DAOMedico extends DAOGenerico<Medico> implements MedicoRepositorio{
    
     public DAOMedico() {
        consultaAbrir("select idMedico,especialidades_idespecialidade, nome, crm from medico where id = ?");
        consultaApagar("delete from medico where id = ?");
        consultaInserir("insert into medico(especialidades_idespecialidade, nome, crm) values(?,?)");
        consultaAlterar("update medicos set nome = ?, crm = ? where id = ?");
        consultaBusca("select idMedico, nome, crm from medico ");
    }

    @Override
    protected Medico preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Medico obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(Medico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Medico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaAbrir(String select_idMedicoespecialidades_idespeciali) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaApagar(String delete_from_medico_where_id__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaInserir(String insert_into_medicoespecialidades_idespeci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaAlterar(String update_medicos_set_nome___crm___where_id_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaBusca(String select_idMedico_nome_crm_from_medico_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
