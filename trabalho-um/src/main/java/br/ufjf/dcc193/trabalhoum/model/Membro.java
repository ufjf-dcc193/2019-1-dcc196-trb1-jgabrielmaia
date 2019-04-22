package br.ufjf.dcc193.trabalhoum.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Membro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "SedeMembroId", referencedColumnName="Id", insertable = false, updatable = false)
    private Sede IdSede;
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

    public Membro(Sede IdSede, String Nome, String Funcao, String Email, Date DataEntrada, Date DataSaida) {
        this.IdSede = IdSede;
        this.Nome = Nome;
        this.Funcao = Funcao;
        this.Email = Email;
        this.DataEntrada = DataEntrada;
        this.DataSaida = DataSaida;
    }


    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Sede getIdSede() {
        return this.IdSede;
    }

    public void setIdSede(Sede IdSede) {
        this.IdSede = IdSede;
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
            ", IdSede='" + getIdSede() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Funcao='" + getFuncao() + "'" +
            ", Email='" + getEmail() + "'" +
            ", DataEntrada='" + getDataEntrada() + "'" +
            ", DataSaida='" + getDataSaida() + "'" +
            "}";
    }
}