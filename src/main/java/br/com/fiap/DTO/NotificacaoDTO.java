package br.com.fiap.DTO;

import java.time.LocalDateTime;

public class NotificacaoDTO {

    private Long id;
    private Long idUsuario;
    private Long idSensor;
    private LocalDateTime dtEnvio;
    private String metodo;
    private String status;
    private String mensagem;

    public NotificacaoDTO() {
    }

    public NotificacaoDTO(Long id, Long idUsuario, Long idSensor, LocalDateTime dtEnvio, String metodo, String status, String mensagem) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idSensor = idSensor;
        this.dtEnvio = dtEnvio;
        this.metodo = metodo;
        this.status = status;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public LocalDateTime getDtEnvio() {
        return dtEnvio;
    }

    public void setDtEnvio(LocalDateTime dtEnvio) {
        this.dtEnvio = dtEnvio;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
