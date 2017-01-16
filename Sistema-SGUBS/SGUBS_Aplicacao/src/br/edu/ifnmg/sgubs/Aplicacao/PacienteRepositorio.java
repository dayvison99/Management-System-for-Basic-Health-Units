/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

/**
 *
 * @author dayvison
 */
public interface PacienteRepositorio extends Repositorio<Paciente> {
    public Paciente Abrir (String cpf);
    
}
