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
    private int idMedicamento;
    private int idMedico;
    private int idPaciente;
    private Date date;
    private Time horario;
    private String prescricaoMedica;
    private double pressaoArterial;
    private double peso;
    private double altura;

    public ConsultaHistorico() {
    }

    public ConsultaHistorico(int id, int idMedicamento, int idMedico, int idPaciente, Date date, Time horario, String prescricaoMedica, double pressaoArterial, double peso, double altura) {
        this.id = id;
        this.idMedicamento = idMedicamento;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.date = date;
        this.horario = horario;
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

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
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
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.idMedicamento;
        hash = 97 * hash + this.idMedico;
        hash = 97 * hash + this.idPaciente;
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.horario);
        hash = 97 * hash + Objects.hashCode(this.prescricaoMedica);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.pressaoArterial) ^ (Double.doubleToLongBits(this.pressaoArterial) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
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
        if (this.idMedicamento != other.idMedicamento) {
            return false;
        }
        if (this.idMedico != other.idMedico) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
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
        if (!Objects.equals(this.prescricaoMedica, other.prescricaoMedica)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.horario, other.horario);
    }

    @Override
    public String toString() {
        return "ConsultaHistorico{" + "id=" + id + ", idMedicamento=" + idMedicamento + ", idMedico=" + idMedico + ", idPaciente=" + idPaciente + ", date=" + date + ", horario=" + horario + ", prescricaoMedica=" + prescricaoMedica + ", pressaoArterial=" + pressaoArterial + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
  
   
    
}
