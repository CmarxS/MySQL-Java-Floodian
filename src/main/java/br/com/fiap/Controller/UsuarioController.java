package br.com.fiap.Controller;

import br.com.fiap.Model.UsuarioAplicacao;
import br.com.fiap.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuarioAplicacao criarUsuario(@RequestBody UsuarioAplicacao usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping
    public List<UsuarioAplicacao> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioAplicacao buscarUsuarioPorId(@PathVariable Long id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @PutMapping("/{id}")
    public UsuarioAplicacao atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioAplicacao usuarioAtualizado) {
        return usuarioService.atualizarUsuario(id, usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}
