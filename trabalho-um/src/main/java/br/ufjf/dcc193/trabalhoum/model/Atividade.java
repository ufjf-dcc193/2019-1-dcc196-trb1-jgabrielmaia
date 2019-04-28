package br.ufjf.dcc193.trabalhoum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Sede Sede;
    private String Titulo;
    private String Descricao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date DataInicio;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date DataFim;
    private Integer HorasAssistenciais;
    private Integer HorasJuridicas;
    private Integer HorasFinanceiras;
    private Integer HorasAdministrativas;    

    public Atividade(){

    }

    public Atividade(Long Id, Sede Sede, String Titulo, String Descricao, Date DataInicio, Date DataFim, Integer HorasAssistenciais, Integer HorasJuridicas, Integer HorasFinanceiras, Integer HorasAdministrativas) {
        this(Sede, Titulo, Descricao, DataInicio, DataFim, HorasAssistenciais, HorasJuridicas, HorasFinanceiras, HorasAdministrativas);
        this.Id = Id;   

    }

    public Atividade(Sede Sede, String Titulo, String Descricao, Date DataInicio, Date DataFim, Integer HorasAssistenciais, Integer HorasJuridicas, Integer HorasFinanceiras, Integer HorasAdministrativas) {
        this.Sede = Sede;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.HorasAssistenciais = HorasAssistenciais;
        this.HorasJuridicas = HorasJuridicas;
        this.HorasFinanceiras = HorasFinanceiras;
        this.HorasAdministrativas = HorasAdministrativas;
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

    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getDataInicio() {
        return this.DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataFim() {
        return this.DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }

    public Integer getHorasAssistenciais() {
        return this.HorasAssistenciais;
    }

    public void setHorasAssistenciais(Integer HorasAssistenciais) {
        this.HorasAssistenciais = HorasAssistenciais;
    }

    public Integer getHorasJuridicas() {
        return this.HorasJuridicas;
    }

    public void setHorasJuridicas(Integer HorasJuridicas) {
        this.HorasJuridicas = HorasJuridicas;
    }

    public Integer getHorasFinanceiras() {
        return this.HorasFinanceiras;
    }

    public void setHorasFinanceiras(Integer HorasFinanceiras) {
        this.HorasFinanceiras = HorasFinanceiras;
    }

    public Integer getHorasAdministrativas() {
        return this.HorasAdministrativas;
    }

    public void setHorasAdministrativas(Integer HorasAdministrativas) {
        this.HorasAdministrativas = HorasAdministrativas;
    }  

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", IdSede='" + getSede().getId() + "'" +
            ", Titulo='" + getTitulo() + "'" +
            ", Descricao='" + getDescricao() + "'" +
            ", DataInicio='" + getDataInicio() + "'" +
            ", DataFim='" + getDataFim() + "'" +
            ", HorasAssistenciais='" + getHorasAssistenciais() + "'" +
            ", HorasJuridicas='" + getHorasJuridicas() + "'" +
            ", HorasFinanceiras='" + getHorasFinanceiras() + "'" +
            ", HorasAdministrativas='" + getHorasAdministrativas() + "'" +
            "}";
    }

}
