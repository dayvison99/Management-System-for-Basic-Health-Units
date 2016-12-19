/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author dayvison
 */
public class EntradaMedicamento {
    private int id;
    private int idMedicamento;
    private int numeroNota;
    private Date dataEntrada;
    private Time horario;

    public EntradaMedicamento() {
    }

    public EntradaMedicamento(int id, int idMedicamento, int numeroNota, Date dataEntrada, Time horario) {
        this.id = id;
        this.idMedicamento = idMedicamento;
        this.numeroNota = numeroNota;
        this.dataEntrada = dataEntrada;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        hash = 89 * hash + this.idMedicamento;
        hash = 89 * hash + this.numeroNota;
        hash = 89 * hash + Objects.hashCode(this.dataEntrada);
        hash = 89 * hash + Objects.hashCode(this.horario);
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
        final EntradaMedicamento other = (EntradaMedicamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idMedicamento != other.idMedicamento) {
            return false;
        }
        if (this.numeroNota != other.numeroNota) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
