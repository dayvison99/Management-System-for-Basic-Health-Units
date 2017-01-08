package br.edu.ifnmg.sgubs.Apresentacao;


import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Persistencia.DAOMedico;
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dayvison
 */
public class Teste {
    
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // DB.Iniciar();
       // DB.criarConexao();
       
       buscar();      
       
    }
    
    public static void buscar() {
        Medico filtro = new Medico();
        
        MedicoRepositorio SGUBS = new DAOMedico();
        
        List<Medico> resultadobusca = SGUBS.Buscar(filtro);
        
        resultadobusca.stream().forEach((m) -> {
            System.out.println(m);
        });
        
    }
    
    
    public static void atualizar() {
        Medico m;
        
        MedicoRepositorio SGUBS = new DAOMedico();
        
        
        m = SGUBS.Abrir(1);
        
        try {
            m.setNome("Petronio alterado");
        } catch(ErroValidacao e){
            
        }
        
        //System.out.println(c);
        
        SGUBS.Salvar(m);
        
    }
    
     public static void apagar() {
        Medico m;
        
        MedicoRepositorio SGUBS = new DAOMedico();
        
        
       m=SGUBS.Abrir(2);
        
        System.out.println(m);
        
        SGUBS.Apagar(m);
        
    }
    
    public static void abrir() {
        Medico m;
        
        MedicoRepositorio SGUBS = new DAOMedico();;
        
        
        m = SGUBS.Abrir(1);
        
        System.out.println(m);
        
    }
    
    public static void criar() {
        Medico m = new Medico();
       
       try {
           m.setNome("Yoshua");
           m.setCrm("101.000.000-00");
           //c.setDataNascimento(new Date());
           
           MedicoRepositorio SGUBS = new DAOMedico();
           
           SGUBS.Salvar(m);
           
           System.out.print(m);
       }
       catch(ErroValidacao ex) {
           System.out.println("Aconteceu um erro! :-(") ;
           System.out.println(ex);
       } 
    }
    
}