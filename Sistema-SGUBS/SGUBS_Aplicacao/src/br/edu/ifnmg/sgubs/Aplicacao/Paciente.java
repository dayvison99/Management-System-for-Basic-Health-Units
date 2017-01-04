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
public class Paciente implements Entidade{
    private int id;
    private String nome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private int telefone;
    private int celular;
    private String tipoSanguineo;
    private String localTrabalho;

    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf, String rua, String bairro, String cidade, int telefone, int celular, String tipoSanguineo, String localTrabalho) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.tipoSanguineo = tipoSanguineo;
        this.localTrabalho = localTrabalho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.cpf);
        hash = 71 * hash + Objects.hashCode(this.rua);
        hash = 71 * hash + Objects.hashCode(this.bairro);
        hash = 71 * hash + Objects.hashCode(this.cidade);
        hash = 71 * hash + this.telefone;
        hash = 71 * hash + this.celular;
        hash = 71 * hash + Objects.hashCode(this.tipoSanguineo);
        hash = 71 * hash + Objects.hashCode(this.localTrabalho);
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
        final Paciente other = (Paciente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (this.celular != other.celular) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.tipoSanguineo, other.tipoSanguineo)) {
            return false;
        }
        if (!Objects.equals(this.localTrabalho, other.localTrabalho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", telefone=" + telefone + ", celular=" + celular + ", tipoSanguineo=" + tipoSanguineo + ", localTrabalho=" + localTrabalho + '}';
    }
    
    
 
    
    
}
