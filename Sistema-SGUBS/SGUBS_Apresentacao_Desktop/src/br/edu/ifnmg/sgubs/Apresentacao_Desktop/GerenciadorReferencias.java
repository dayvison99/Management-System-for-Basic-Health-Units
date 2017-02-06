/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.EspecialidadeRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Persistencia.DAOEspecialidade;
import br.edu.ifnmg.sgubs.Persistencia.DAOMedico;

/**
 *
 * @author dayvison
 */
public class GerenciadorReferencias {
    
    //medico
    
    private static MedicoRepositorio MedicoDao;

    public static MedicoRepositorio getMedico() {
       if(MedicoDao==null)
           MedicoDao =new DAOMedico();
        return MedicoDao;
    }
    
    //especialidade
    
    private static  EspecialidadeRepositorio EspecialidadeDao;
    
    
    public static EspecialidadeRepositorio getEspecialidade(){
        if(EspecialidadeDao == null )
            EspecialidadeDao = new DAOEspecialidade();
        return EspecialidadeDao;
    }
    
    
    
    
    
    
}
