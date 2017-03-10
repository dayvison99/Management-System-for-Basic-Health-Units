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
public class ConsultaHistorico implements Entidade {
    private int id;
    private Medico Medico;
    private Paciente Paciente;
    private Date date;
    private String periodo;
    private String prescricaoMedica;
    private double pressaoArterial;
    private double peso;
    private double altura;

    public ConsultaHistorico() {
    }

    public ConsultaHistorico(int id, Medico Medico, Paciente Paciente, Date date, String periodo, String prescricaoMedica, double pressaoArterial, double peso, double altura) {
        this.id = id;
        this.Medico = Medico;
        this.Paciente = Paciente;
        this.date = date;
        this.periodo = periodo;
        this.prescricaoMedica = prescricaoMedica;
        this.pressaoArterial = pressaoArterial;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPrescricaoMedica() {
        return prescricaoMedica;
    }

    public void setPrescricaoMedica(String prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.Medico);
        hash = 67 * hash + Objects.hashCode(this.Paciente);
        hash = 67 * hash + Objects.hashCode(this.date);
        hash = 67 * hash + Objects.hashCode(this.periodo);
        hash = 67 * hash + Objects.hashCode(this.prescricaoMedica);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.pressaoArterial) ^ (Double.doubleToLongBits(this.pressaoArterial) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
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
        final ConsultaHistorico other = (ConsultaHistorico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.pressaoArterial) != Double.doubleToLongBits(other.pressaoArterial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (!Objects.equals(this.periodo, other.periodo)) {
            return false;
        }
        if (!Objects.equals(this.prescricaoMedica, other.prescricaoMedica)) {
            return false;
        }
        if (!Objects.equals(this.Medico, other.Medico)) {
            return false;
        }
        if (!Objects.equals(this.Paciente, other.Paciente)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConsultaHistorico{" + "id=" + id + ", Medico=" + Medico + ", Paciente=" + Paciente + ", date=" + date + ", periodo=" + periodo + ", prescricaoMedica=" + prescricaoMedica + ", pressaoArterial=" + pressaoArterial + ", peso=" + peso + ", altura=" + altura + '}';
    }

  
   
    
}
