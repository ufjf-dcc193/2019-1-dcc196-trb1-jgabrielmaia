package br.ufjf.dcc193.trabalhoum.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sede")
public class Sede {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String Nome;
    private String EstadoFederacao;
    private String Cidade;
    private String Bairro;
    private String Telefone;
    private String Url;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Atividade> Atividades;    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Membro> Membros;

    public Sede(){

    }

    public Sede(String Nome, String EstadoFederacao, String Cidade, String Bairro, String Telefone, String Url) {
        this.Nome = Nome;
        this.EstadoFederacao = EstadoFederacao;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Telefone = Telefone;
        this.Url = Url;
        this.Atividades = new HashSet<>();
        this.Membros = new HashSet<>();
    }

    public Sede(Long Id, String EstadoFederacao, String Nome, String Cidade, String Bairro, String Telefone, String Url) {
        this(Nome, EstadoFederacao, Cidade, Bairro, Telefone, Url);
        this.Id = Id;        
    }

    public Long getId() {
        return this.Id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEstadoFederacao() {
        return this.EstadoFederacao;
    }

    public void setEstadoFederacao(String EstadoFederacao) {
        this.EstadoFederacao = EstadoFederacao;
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

    public void addMembro(Membro membro){
        if(!Membros.contains(membro))
            Membros.add(membro);
    }

    public Collection<Atividade> getAtividades() {
        return this.Atividades;
    }

    public void setAtividades(Set<Atividade> Atividades) {
        this.Atividades = Atividades;
    }

    public void addAtividade(Atividade atividade){
        if(!Atividades.contains(atividade))
            Atividades.add(atividade);
    }


    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nome='" + getNome() + "'" +
            ", EstadoFederacao='" + getEstadoFederacao() + "'" +
            ", Cidade='" + getCidade() + "'" +
            ", Bairro='" + getBairro() + "'" +
            ", Telefone='" + getTelefone() + "'" +
            ", Url='" + getUrl() + "'" +
            ", Atividades='" + getAtividades() + "'" +
            ", Membros='" + getMembros() + "'" +
            "}";
    }     
}