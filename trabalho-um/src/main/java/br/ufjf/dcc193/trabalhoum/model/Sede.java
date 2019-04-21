package br.ufjf.dcc193.trabalhoum.model;

import java.util.Objects;

public class Sede {
    private Integer Id;
    private String Nome;
    private String Cidade;
    private String Bairro;
    private String Telefone;
    private String Url;    

    public Sede(Integer Id, String Nome, String Cidade, String Bairro, String Telefone, String Url) {
        this.Id = Id;
        this.Nome = Nome;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Url = Url;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sede)) {
            return false;
        }
        Sede sede = (Sede) o;
        return Objects.equals(Id, sede.Id) && Objects.equals(Nome, sede.Nome) && Objects.equals(Cidade, sede.Cidade) && Objects.equals(Bairro, sede.Bairro) && Objects.equals(Telefone, sede.Telefone) && Objects.equals(Url, sede.Url);
    }
    
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
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