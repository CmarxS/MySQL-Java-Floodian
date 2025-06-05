package br.com.fiap.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "FLD_USUARIO_APLICACAO")
public class UsuarioAplicacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "EMAIL", length = 150, unique = true)
    private String email;

    @Column(name ="TELEFONE", length = 20)
    private String telefone;

    @Column(name = "TP_USUARIO", length = 30)
    private String tipoUsuario;

    @Column(name = "SENHA", length = 100)
    private String senha;

    public UsuarioAplicacao() {
    }

    public UsuarioAplicacao(Long idUsuario, String senha, String telefone, String email, String nome, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
