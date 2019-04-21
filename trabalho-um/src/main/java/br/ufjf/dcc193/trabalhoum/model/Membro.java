package br.ufjf.dcc193.trabalhoum.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Membro {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Integer IdSede;
    private String Nome;
    private String Funcao;
    private String Email;
    private Date DataEntrada;
    private Date DataSaida;

    public Membro(Long Id, Integer IdSede, String Nome, String Funcao, String Email, Date DataEntrada, Date DataSaida) {
        this.Id = Id;
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

    public Integer getIdSede() {
        return this.IdSede;
    }

    public void setIdSede(Integer IdSede) {
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

}