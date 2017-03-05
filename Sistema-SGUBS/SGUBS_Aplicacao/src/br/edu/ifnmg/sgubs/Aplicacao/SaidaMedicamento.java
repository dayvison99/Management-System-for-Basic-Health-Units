/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author dayvison
 */
public class SaidaMedicamento implements Entidade{
    private int id;
    private Paciente paciente;
    private Medicamento medicamento;
    private int qtde;
    private Date data;

    public SaidaMedicamento() {
    }

    public SaidaMedicamento(int id, Paciente paciente, Medicamento medicamento, int qtde, Date data) {
        this.id = id;
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.qtde = qtde;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.paciente);
        hash = 17 * hash + Objects.hashCode(this.medicamento);
        hash = 17 * hash + this.qtde;
        hash = 17 * hash + Objects.hashCode(this.data);
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
        final SaidaMedicamento other = (SaidaMedicamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.qtde != other.qtde) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.medicamento, other.medicamento)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaidaMedicamento{" + "id=" + id + ", paciente=" + paciente + ", medicamento=" + medicamento + ", qtde=" + qtde + ", data=" + data + '}';
    }
    
    
    
    
    
    
}
