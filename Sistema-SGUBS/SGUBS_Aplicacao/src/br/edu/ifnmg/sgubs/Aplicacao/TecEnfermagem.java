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
public class TecEnfermagem implements Entidade{
    private int id;
    private String nome;
    private String coren;
    private String rua;
    private String bairro;
    private String cidade;
    private int telefone;
    private int celular;
    private String corem;

    

    public TecEnfermagem() {
    }

    public TecEnfermagem(int id, String nome, String corem, String rua, String bairro, String cidade, int telefone, int celular) {
        this.id = id;
        this.nome = nome;
        this.coren = corem;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
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

    public String getCoren() {
        return corem;
    }

    public void setCoren(String corem) {
        this.corem = corem;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.coren);
        hash = 43 * hash + Objects.hashCode(this.rua);
        hash = 43 * hash + Objects.hashCode(this.bairro);
        hash = 43 * hash + Objects.hashCode(this.cidade);
        hash = 43 * hash + this.telefone;
        hash = 43 * hash + this.celular;
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
        final TecEnfermagem other = (TecEnfermagem) obj;
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
        if (!Objects.equals(this.coren, other.coren)) {
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
        return true;
    }

    @Override
    public String toString() {
        return "TecEnfermagem{" + "id=" + id + ", nome=" + nome + ", coren=" + coren + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", telefone=" + telefone + ", celular=" + celular + '}';
    }
    

   
}
