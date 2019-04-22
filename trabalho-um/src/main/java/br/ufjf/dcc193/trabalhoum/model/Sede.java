package br.ufjf.dcc193.trabalhoum.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Set;

@Entity
public class Sede {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Nome;
    private String Cidade;
    private String Bairro;
    private String Telefone;
    private String Url;    
    @OneToMany(mappedBy = "IdSede", cascade = CascadeType.PERSIST, targetEntity = Membro.class, fetch = FetchType.EAGER)
    private Set<Membro> Membros;
    @OneToMany(mappedBy = "IdSede", cascade = CascadeType.PERSIST, targetEntity = Atividade.class, fetch = FetchType.EAGER)
    private Set<Atividade> Atividades;

    public Sede(){

    }

    public Sede(String Nome, String Cidade, String Bairro, String Telefone, String Url) {
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

    public Set<Membro> getMembros() {
        return this.Membros;
    }

    public void setMembros(Set<Membro> Membros) {
        this.Membros = Membros;
    }

    public Set<Atividade> getAtividades() {
        return this.Atividades;
    }

    public void setAtividades(Set<Atividade> Atividades) {
        this.Atividades = Atividades;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Cidade='" + getCidade() + "'" +
            ", Bairro='" + getBairro() + "'" +
            ", Telefone='" + getTelefone() + "'" +
            ", Url='" + getUrl() + "'" +
            ", Membros='" + getMembros() + "'" +
            ", Atividades='" + getAtividades() + "'" +
            "}";
    }

}