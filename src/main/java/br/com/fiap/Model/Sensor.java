package br.com.fiap.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "FLD_SENSOR")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SENSOR")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_LOCALIZACAO", nullable = false)
    private Localizacao localizacao;


    @Column(name = "DATA_INSTALACAO")
    @Temporal(TemporalType.DATE)
    private Date dataInstalacao;

    @Column(name = "STATUS", length = 20)
    private String status;

    @Column(name = "NUMERO_SERIE", length = 50, unique = true)
    private String numeroSerie;

    @Column(name = "LIMITE_ALERTA")
    private Float limiteAlerta;

    @Column(name = "INTERVALO_HORAS")
    private Integer intervaloHoras;

    public Sensor() {
    }

    public Sensor(Localizacao localizacao, Date dataInstalacao, String status, String numeroSerie, Float limiteAlerta, Integer intervaloHoras) {
        this.localizacao = localizacao;
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

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
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