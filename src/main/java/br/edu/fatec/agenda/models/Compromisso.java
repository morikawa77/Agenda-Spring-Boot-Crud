package br.edu.fatec.agenda.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compromissos")
public class Compromisso {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int codigo;
  private String compromisso;
  private Date data;
  private String status;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getCompromisso() {
    return compromisso;
  }

  public void setCompromisso(String compromisso) {
    this.compromisso = compromisso;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
