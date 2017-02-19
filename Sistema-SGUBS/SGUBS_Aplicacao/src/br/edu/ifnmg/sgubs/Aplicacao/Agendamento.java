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
public class Agendamento implements Entidade{
    private int id;
    private UnidadesDeSaude UnidadeSaude;
    private Medico Medico;
    private Paciente Paciente;
    private Time horario;
    private Date data;

    public Agendamento() {
    }

    public Agendamento(int id, UnidadesDeSaude UnidadeSaude, Medico Medico, Paciente Paciente, Time horario, Date data) {
        this.id = id;
        this.UnidadeSaude = UnidadeSaude;
        this.Medico = Medico;
        this.Paciente = Paciente;
        this.horario = horario;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UnidadesDeSaude getUnidadeSaude() {
        return UnidadeSaude;
    }

    public void setUnidadeSaude(UnidadesDeSaude UnidadeSaude) {
        this.UnidadeSaude = UnidadeSaude;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico Medico) {
        this.Medico = Medico;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
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
        int hash = 3;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.UnidadeSaude);
        hash = 41 * hash + Objects.hashCode(this.Medico);
        hash = 41 * hash + Objects.hashCode(this.Paciente);
        hash = 41 * hash + Objects.hashCode(this.horario);
        hash = 41 * hash + Objects.hashCode(this.data);
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
        if (!Objects.equals(this.UnidadeSaude, other.UnidadeSaude)) {
            return false;
        }
        if (!Objects.equals(this.Medico, other.Medico)) {
            return false;
        }
        if (!Objects.equals(this.Paciente, other.Paciente)) {
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

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", UnidadeSaude=" + UnidadeSaude + ", Medico=" + Medico + ", Paciente=" + Paciente + ", horario=" + horario + ", data=" + data + '}';
    }

    
    
    
    

    
}
