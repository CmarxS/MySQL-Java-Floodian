package br.com.fiap.DTO;

import java.util.Date;

public class SensorDTO {

    private Long id;
    private Long idLocalizacao;
    private Date dataInstalacao;
    private String status;
    private String numeroSerie;
    private Float limiteAlerta;
    private Integer intervaloHoras;

    public SensorDTO() {
    }

    public SensorDTO(Long id, Long idLocalizacao, Date dataInstalacao, String status, String numeroSerie, Float limiteAlerta, Integer intervaloHoras) {
        this.id = id;
        this.idLocalizacao = idLocalizacao;
        this.dataInstalacao = dataInstalacao;
        this.status = status;
        this.numeroSerie = numeroSerie;
        this.limiteAlerta = limiteAlerta;
        this.intervaloHoras = intervaloHoras;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Date getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(Date dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Float getLimiteAlerta() {
        return limiteAlerta;
    }

    public void setLimiteAlerta(Float limiteAlerta) {
        this.limiteAlerta = limiteAlerta;
    }

    public Integer getIntervaloHoras() {
        return intervaloHoras;
    }

    public void setIntervaloHoras(Integer intervaloHoras) {
        this.intervaloHoras = intervaloHoras;
    }
}
