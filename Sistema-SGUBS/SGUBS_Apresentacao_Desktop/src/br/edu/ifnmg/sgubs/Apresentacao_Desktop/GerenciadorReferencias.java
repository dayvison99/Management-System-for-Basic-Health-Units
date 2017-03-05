/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.Agendamento;
import br.edu.ifnmg.sgubs.Aplicacao.AgendamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.EspecialidadeRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.MedicamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.PacienteRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.SaidaMedicamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.TecEnfermagemRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaudeRepositorio;
import br.edu.ifnmg.sgubs.Persistencia.DAOAgendamento;
import br.edu.ifnmg.sgubs.Persistencia.DAOEspecialidade;
import br.edu.ifnmg.sgubs.Persistencia.DAOFuncionario;
import br.edu.ifnmg.sgubs.Persistencia.DAOMedicamento;
import br.edu.ifnmg.sgubs.Persistencia.DAOMedico;
import br.edu.ifnmg.sgubs.Persistencia.DAOPaciente;
import br.edu.ifnmg.sgubs.Persistencia.DAOSaidaMedicamento;
import br.edu.ifnmg.sgubs.Persistencia.DAOTecEnfermagem;
import br.edu.ifnmg.sgubs.Persistencia.DAOUnidadesDeSaude;

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
    
    // paciente
    
    private static PacienteRepositorio PacienteDao;
    
    public static PacienteRepositorio getPaciente(){
        if(PacienteDao==null)
            PacienteDao = new DAOPaciente();
        return PacienteDao;
    }
    
    //Unidade de Saude
    
    private static UnidadesDeSaudeRepositorio UnidadeDeSaudeDao;
    
    public static UnidadesDeSaudeRepositorio getUnidadeDeSaude(){
        if(UnidadeDeSaudeDao == null)
            UnidadeDeSaudeDao = new DAOUnidadesDeSaude();
        return UnidadeDeSaudeDao;   
    }
    
    //Tec Enfermagem
    
    private static TecEnfermagemRepositorio TecEnfermagemDao;
    
    public static TecEnfermagemRepositorio getTecEnfermagem(){
        if(TecEnfermagemDao == null)
            TecEnfermagemDao = new DAOTecEnfermagem();
        return TecEnfermagemDao;
    }
    
    //Medicamentos
    
   
    private static MedicamentoRepositorio MedicamentosDao;
    
    public static MedicamentoRepositorio getMedicamentos(){
        if(MedicamentosDao == null)
            MedicamentosDao = new DAOMedicamento();
        return MedicamentosDao;
    }
    
    //Funcionario
    
    private static FuncionarioRepositorio FuncionarioDao;
    
    public static FuncionarioRepositorio getFuncionario(){
        if(FuncionarioDao == null)
            FuncionarioDao = new DAOFuncionario();
        return FuncionarioDao;
    }
    
    //Agendamento
    
    private static AgendamentoRepositorio AgendamentoDao;
    
    public static AgendamentoRepositorio getAgendamento(){
        if(AgendamentoDao == null)
            AgendamentoDao = new DAOAgendamento();
        return AgendamentoDao;
    }
    
    //Saida Medicamento
    
    private static SaidaMedicamentoRepositorio SaidaMedicamentoDao;
    
    public static  SaidaMedicamentoRepositorio getSaidaMedicamanto(){
        if(SaidaMedicamentoDao == null)
            SaidaMedicamentoDao = new DAOSaidaMedicamento();
        return SaidaMedicamentoDao;
    }
    
    
    
}
