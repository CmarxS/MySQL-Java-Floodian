package br.com.fiap.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "FLD_MEDICAO")
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEDICAO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_SENSOR", nullable = false)
    private Sensor sensor;

    @Column(name = "DT_MEDICAO")
    private LocalDateTime momento;

    @Column(name = "VALOR")
    private Float valor;

    public Medicao() {
    }

    public Medicao(Sensor sensor, LocalDateTime momento, Float valor) {
        this.sensor = sensor;
        this.momento = momento;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
