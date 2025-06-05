package br.com.fiap.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "FLD_NOTIFICACAO")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOTIFICACAO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioAplicacao usuario;

    @ManyToOne
    @JoinColumn(name = "ID_SENSOR")
    private Sensor sensor;

    @Column(name = "DT_ENVIO")
    private LocalDateTime enviadoEm;

    @Column(name = "METODO", length = 20)
    private String metodo;

    @Column(name = "STATUS", length = 20)
    private String status;

    @Column(name = "MENSAGEM", length = 4000)
    private String mensagem;


    public Notificacao() {
    }

    public Notificacao(UsuarioAplicacao usuario, Sensor sensor, LocalDateTime enviadoEm, String metodo, String status, String mensagem) {
        this.usuario = usuario;
        this.sensor = sensor;
        this.enviadoEm = enviadoEm;
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

    public UsuarioAplicacao getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioAplicacao usuario) {
        this.usuario = usuario;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public LocalDateTime getEnviadoEm() {
        return enviadoEm;
    }

    public void setEnviadoEm(LocalDateTime enviadoEm) {
        this.enviadoEm = enviadoEm;
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
