/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dayvison
 */
public class SaidaMedicamento implements Entidade{
    private int id;
    private Paciente paciente;
    private Medicamento medicamento;
    private Date data;
    private List<SaidaMedicamentosItens> itens;

    public SaidaMedicamento() {
    }

    public SaidaMedicamento(int id, Paciente paciente, Medicamento medicamento, Date data, List<SaidaMedicamentosItens> itens) {
        this.id = id;
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.data = data;
        this.itens = itens;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<SaidaMedicamentosItens> getItens() {
        return itens;
    }

    public void setItens(List<SaidaMedicamentosItens> itens) {
        this.itens = itens;
    }
    
    public void addItem(SaidaMedicamentosItens item){
        if(!itens.contains(item)) {
            itens.add(item);
              
        }
    }
    
    public void removeItem(SaidaMedicamentosItens item){
        if(itens.contains(item)){
            itens.remove(item);
        
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.paciente);
        hash = 83 * hash + Objects.hashCode(this.medicamento);
        hash = 83 * hash + Objects.hashCode(this.data);
        hash = 83 * hash + Objects.hashCode(this.itens);
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
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.medicamento, other.medicamento)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.itens, other.itens)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaidaMedicamento{" + "id=" + id + ", paciente=" + paciente + ", medicamento=" + medicamento + ", data=" + data + ", itens=" + itens + '}';
    }

       
    
    
}
