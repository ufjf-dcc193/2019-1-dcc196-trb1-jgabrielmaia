package br.ufjf.dcc193.trabalhoum.model;

import java.util.Date;

public class Atividade {
    private Integer Id;
    private Integer IdSede;
    private String Titulo;
    private String Descricao;
    private Date DataInicio;
    private Date DataFim;
    private Integer HorasAssistenciais;
    private Integer HorasJuridicas;
    private Integer HorasFinanceiras;
    private Integer HorasAdministrativas;    

    public Atividade(Integer Id, Integer IdSede, String Titulo, String Descricao, Date DataInicio, Date DataFim, Integer HorasAssistenciais, Integer HorasJuridicas, Integer HorasFinanceiras, Integer HorasAdministrativas) {
        this.Id = Id;
        this.IdSede = IdSede;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.HorasAssistenciais = HorasAssistenciais;
        this.HorasJuridicas = HorasJuridicas;
        this.HorasFinanceiras = HorasFinanceiras;
        this.HorasAdministrativas = HorasAdministrativas;
    }


    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getIdSede() {
        return this.IdSede;
    }

    public void setIdSede(Integer IdSede) {
        this.IdSede = IdSede;
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

}
