package br.com.fiap.Controller;

import br.com.fiap.Model.Notificacao;
import br.com.fiap.Service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    @Autowired
    private NotificacaoService notificacaoService;

    @PostMapping
    public Notificacao criar(@RequestBody Notificacao notificacao) {
        return notificacaoService.salvar(notificacao);
    }

    @GetMapping
    public List<Notificacao> listar() {
        return notificacaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Notificacao buscarPorId(@PathVariable Long id) {
        return notificacaoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Notificacao atualizar(@PathVariable Long id, @RequestBody Notificacao notificacao) {
        return notificacaoService.atualizar(id, notificacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        notificacaoService.deletar(id);
    }
}
