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
    private Paciente paciente;
    private int quantidade;

    public SaidaMedicamentosItens() {
    }

    public SaidaMedicamentosItens(Medicamento medicamento, Paciente paciente, int quantidade) {
        this.medicamento = medicamento;
        this.paciente = paciente;
        this.quantidade = quantidade;
    }
    
    

    
    public SaidaMedicamentosItens(int id, Medicamento medicamento, Paciente paciente, int quantidade) {
        this.id = id;
        this.medicamento = medicamento;
        this.paciente = paciente;
        this.quantidade = quantidade;
    }

    public SaidaMedicamentosItens(SaidaMedicamento entidade, Medicamento medicamento, int parseInt) {
        this.medicamento = medicamento;
        this.paciente = paciente;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.medicamento);
        hash = 89 * hash + Objects.hashCode(this.paciente);
        hash = 89 * hash + this.quantidade;
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
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MedicamentosItens{" + "id=" + id + ", medicamento=" + medicamento + ", paciente=" + paciente + ", quantidade=" + quantidade + '}';
    }
    
    
    
}

