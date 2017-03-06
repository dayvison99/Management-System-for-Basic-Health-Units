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
public class SaidaMedicamentosItens implements Entidade{
    
    private int id;
    private Medicamento medicamento;
    private SaidaMedicamento saida;
    private int quantidade;

    public SaidaMedicamentosItens() {
    }

    public SaidaMedicamentosItens(int id, Medicamento medicamento, SaidaMedicamento saida, int quantidade) {
        this.id = id;
        this.medicamento = medicamento;
        this.saida = saida;
        this.quantidade = quantidade;
    }

    public SaidaMedicamentosItens(SaidaMedicamento entidade, Medicamento medicamento, int parseInt) {
        this.medicamento = medicamento;
        this.saida = saida;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public SaidaMedicamento getSaida() {
        return saida;
    }

    public void setSaida(SaidaMedicamento saida) {
        this.saida = saida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.medicamento);
        hash = 11 * hash + Objects.hashCode(this.saida);
        hash = 11 * hash + this.quantidade;
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
        final SaidaMedicamentosItens other = (SaidaMedicamentosItens) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.medicamento, other.medicamento)) {
            return false;
        }
        if (!Objects.equals(this.saida, other.saida)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaidaMedicamentosItens{" + "id=" + id + ", medicamento=" + medicamento + ", saida=" + saida + ", quantidade=" + quantidade + '}';
    }
    
    
}

    
    
    

    
   