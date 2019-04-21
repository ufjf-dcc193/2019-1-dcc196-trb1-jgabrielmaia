package br.ufjf.dcc193.trabalhoum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Sede {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Nome;
    private String Cidade;
    private String Bairro;
    private String Telefone;
    private String Url;    

    public Sede(Long Id, String Nome, String Cidade, String Bairro, String Telefone, String Url) {
        this.Id = Id;
        this.Nome = Nome;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Url = Url;
    }
    
    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCidade() {
        return this.Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return this.Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getUrl() {
        return this.Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
}