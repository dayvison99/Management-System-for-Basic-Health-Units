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
public class Agendamento {
    private int id;
    private int idUnidadeSaude;
    private int idMedico;
    private int idPaciente;
    private Time horario;
    private Date data;

    public Agendamento() {
    }

    public Agendamento(int id, int idUnidadeSaude, int idMedico, int idPaciente, Time horario, Date data) {
        this.id = id;
        this.idUnidadeSaude = idUnidadeSaude;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.horario = horario;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUnidadeSaude() {
        return idUnidadeSaude;
    }

    public void setIdUnidadeSaude(int idUnidadeSaude) {
        this.idUnidadeSaude = idUnidadeSaude;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.idUnidadeSaude;
        hash = 29 * hash + this.idMedico;
        hash = 29 * hash + this.idPaciente;
        hash = 29 * hash + Objects.hashCode(this.horario);
        hash = 29 * hash + Objects.hashCode(this.data);
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
        final Agendamento other = (Agendamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUnidadeSaude != other.idUnidadeSaude) {
            return false;
        }
        if (this.idMedico != other.idMedico) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }
    
    
    
    

    
}
