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
public class Funcionario implements Entidade{
    private int id;
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    private int celular;
    private int telefone;
    private String funcao;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String rua, String bairro, String cidade, int celular, int telefone, String funcao, String cpf) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.celular = celular;
        this.telefone = telefone;
        this.funcao = funcao;
        this.cpf = cpf;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.rua);
        hash = 17 * hash + Objects.hashCode(this.bairro);
        hash = 17 * hash + Objects.hashCode(this.cidade);
        hash = 17 * hash + this.celular;
        hash = 17 * hash + this.telefone;
        hash = 17 * hash + Objects.hashCode(this.funcao);
        hash = 17 * hash + Objects.hashCode(this.cpf);
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.celular != other.celular) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
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
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", celular=" + celular + ", telefone=" + telefone + ", funcao=" + funcao + ", cpf=" + cpf + '}';
    }

    
    
}
