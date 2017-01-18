package br.edu.ifnmg.sgubs.Apresentacao;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Persistencia.DAOMedico;
import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dayvison
 */
public class SGUBS_Apresentacao {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
           
       
    }
    
      
    public static void buscar() {
        Medico filtro = new Medico();
        
        MedicoRepositorio medicoBuscar = new DAOMedico();
        
        List<Medico> resultadobusca = medicoBuscar.Buscar(filtro);
        
        for(Medico m : resultadobusca)
            System.out.println(m);
        
    }
    
    
    public static void atualizar() {
        Medico m;
        
        MedicoRepositorio medicoAtualizar = new DAOMedico();
        
        
        m =medicoAtualizar.Abrir(1);
        
        m.setNome("Dayvison alterado");
        
        System.out.println(m);
        
        medicoAtualizar.Salvar(m);
        
    }
    
     public static void apagar() {
        Medico m;
        
        MedicoRepositorio medicoApagar = new DAOMedico();
        
        
        m = medicoApagar.Abrir(2);
        
        System.out.println(m);
        
        medicoApagar.Apagar(m);
        
    }
    
    public static void abrir() {
        Medico m;
        
        MedicoRepositorio medicoAbrir = new DAOMedico();
        
        m = medicoAbrir.Abrir(1);
        
        System.out.println(m);
        
    }
    
    public static void criar() {
        Medico m = new Medico();
       
        m.setNome("testemedico");
        m.setCrm("101000000");
        m.setRua("a");
        m.setBairro("centro");
        m.setCidade("Januaria");
        m.setTelefone(148511480);
        m.setCelular(9105149);
        m.setObservacoes("teste medico");
        MedicoRepositorio medicoCriar = new DAOMedico();
        medicoCriar.Salvar(m);
        System.out.println(m); 
    }
    
}
