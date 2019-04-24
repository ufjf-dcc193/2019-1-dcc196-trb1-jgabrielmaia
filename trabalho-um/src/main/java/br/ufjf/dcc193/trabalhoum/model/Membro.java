package br.ufjf.dcc193.trabalhoum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Membro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false) 
    private Sede Sede;
    private String Nome;
    private String Funcao;
    @Email
    private String Email;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date DataEntrada;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date DataSaida;

    public Membro(){

    }

    public Membro(String Nome, String Funcao, String Email, Date DataEntrada, Date DataSaida) {
        this.Nome = Nome;
        this.Funcao = Funcao;
        this.Email = Email;
        this.DataEntrada = DataEntrada;
        this.DataSaida = DataSaida;
    }

    public Membro(Sede Sede, String Nome, String Funcao, String Email, Date DataEntrada, Date DataSaida) {
        this(Nome, Funcao, Email, DataEntrada, DataSaida);
        this.Sede = Sede;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Sede getSede() {
        return this.Sede;
    }

    public void setSede(Sede Sede) {
        this.Sede = Sede;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFuncao() {
        return this.Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDataEntrada() {
        return this.DataEntrada;
    }

    public void setDataEntrada(Date DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public Date getDataSaida() {
        return this.DataSaida;
    }

    public void setDataSaida(Date DataSaida) {
        this.DataSaida = DataSaida;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", IdSede='" + getSede().getId() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Funcao='" + getFuncao() + "'" +
            ", Email='" + getEmail() + "'" +
            ", DataEntrada='" + getDataEntrada() + "'" +
            ", DataSaida='" + getDataSaida() + "'" +
            "}";
    }
}