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
    private String turno;
    private Date data;
    private String motivo;

    public Agendamento() {
    }

    public Agendamento(int id, UnidadesDeSaude UnidadeSaude, Medico Medico, Paciente Paciente, String turno, Date data, String motivo) {
        this.id = id;
        this.UnidadeSaude = UnidadeSaude;
        this.Medico = Medico;
        this.Paciente = Paciente;
        this.turno = turno;
        this.data = data;
        this.motivo = motivo;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.UnidadeSaude);
        hash = 79 * hash + Objects.hashCode(this.Medico);
        hash = 79 * hash + Objects.hashCode(this.Paciente);
        hash = 79 * hash + Objects.hashCode(this.turno);
        hash = 79 * hash + Objects.hashCode(this.data);
        hash = 79 * hash + Objects.hashCode(this.motivo);
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
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        if (!Objects.equals(this.motivo, other.motivo)) {
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
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", UnidadeSaude=" + UnidadeSaude + ", Medico=" + Medico + ", Paciente=" + Paciente + ", turno=" + turno + ", data=" + data + ", motivo=" + motivo + '}';
    }

   
}
