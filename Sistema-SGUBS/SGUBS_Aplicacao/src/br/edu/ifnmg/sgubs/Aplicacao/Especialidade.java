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
public class Especialidade implements Entidade{
    private int id;
    private String especialidade;

    public Especialidade() {
    }

    public Especialidade(int id, String especialidade) {
        this.id = id;
        this.especialidade = especialidade;
    }

    public Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.especialidade);
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
        final Especialidade other = (Especialidade) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidade{" + "id=" + id + ", especialidade=" + especialidade + '}';
    }
    
    
    
    
}
