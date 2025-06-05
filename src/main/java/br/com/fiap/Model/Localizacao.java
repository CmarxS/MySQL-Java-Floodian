package br.com.fiap.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "FLD_LOCALIZACAO")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOCALIZACAO")
    private Long id;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @Column(name = "TIPO_AREA", length = 50)
    private String tipoArea;

    @Column(name = "DESCRICAO", length = 200)
    private String descricao;

    public Localizacao() {
    }

    public Localizacao(String nome, Float latitude, Float longitude, String tipoArea, String descricao) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tipoArea = tipoArea;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
