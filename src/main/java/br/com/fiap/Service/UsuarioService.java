package br.com.fiap.Service;

import br.com.fiap.Model.UsuarioAplicacao;
import br.com.fiap.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public UsuarioAplicacao salvarUsuario(UsuarioAplicacao usuario) {
        return repository.save(usuario);
    }

    public List<UsuarioAplicacao> listarUsuarios() {
        return repository.findAll();
    }

    public UsuarioAplicacao buscarUsuarioPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public UsuarioAplicacao atualizarUsuario(Long id, UsuarioAplicacao usuarioAtualizado) {
        UsuarioAplicacao usuarioExistente = repository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioAtualizado.setIdUsuario(usuarioAtualizado.getIdUsuario());
            usuarioAtualizado.setSenha(usuarioExistente.getSenha());
            usuarioAtualizado.setTelefone(usuarioAtualizado.getTelefone());
            usuarioAtualizado.setEmail(usuarioAtualizado.getEmail());
            usuarioAtualizado.setNome(usuarioAtualizado.getNome());
            usuarioAtualizado.setTipoUsuario(usuarioAtualizado.getTipoUsuario());
            return repository.save(usuarioAtualizado);
        }
        return null; // ou lançar uma exceção
    }

    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }
}
