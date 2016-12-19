/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

import java.util.Objects;

/**
 *
 * @author dayvison
 */
public class ControleUsuario {
    private int id;
    private int idMedico;
    private int idFuncionario;
    private int idTecenfermagem;
    private String senha;
    private String nomeUsuario;

    public ControleUsuario() {
    }

    public ControleUsuario(int id, int idMedico, int idFuncionario, int idTecenfermagem, String senha, String nomeUsuario) {
        this.id = id;
        this.idMedico = idMedico;
        this.idFuncionario = idFuncionario;
        this.idTecenfermagem = idTecenfermagem;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdTecenfermagem() {
        return idTecenfermagem;
    }

    public void setIdTecenfermagem(int idTecenfermagem) {
        this.idTecenfermagem = idTecenfermagem;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.idMedico;
        hash = 67 * hash + this.idFuncionario;
        hash = 67 * hash + this.idTecenfermagem;
        hash = 67 * hash + Objects.hashCode(this.senha);
        hash = 67 * hash + Objects.hashCode(this.nomeUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControleUsuario other = (ControleUsuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idMedico != other.idMedico) {
            return false;
        }
        if (this.idFuncionario != other.idFuncionario) {
            return false;
        }
        if (this.idTecenfermagem != other.idTecenfermagem) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nomeUsuario, other.nomeUsuario)) {
            return false;
        }
        return true;
    }
    
    
   
    
}
