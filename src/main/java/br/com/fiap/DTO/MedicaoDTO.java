package br.com.fiap.DTO;

import java.time.LocalDateTime;

public class MedicaoDTO {

    private Long id;
    private Long idSensor;
    private LocalDateTime dtMedicao;
    private Float valor;

    public MedicaoDTO() {
    }

    public MedicaoDTO(Long id, Long idSensor, LocalDateTime dtMedicao, Float valor) {
        this.id = id;
        this.idSensor = idSensor;
        this.dtMedicao = dtMedicao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public LocalDateTime getDtMedicao() {
        return dtMedicao;
    }

    public void setDtMedicao(LocalDateTime dtMedicao) {
        this.dtMedicao = dtMedicao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
