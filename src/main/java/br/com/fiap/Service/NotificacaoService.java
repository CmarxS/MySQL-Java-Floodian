package br.com.fiap.Service;

import br.com.fiap.Model.Notificacao;
import br.com.fiap.Repository.NotificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoService {

    @Autowired
    private NotificacaoRepository repository;

    public Notificacao salvar(Notificacao notificacao) {
        return repository.save(notificacao);
    }

    public List<Notificacao> listarTodos() {
        return repository.findAll();
    }

    public Notificacao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Notificacao atualizar(Long id, Notificacao notificacaoAtualizada) {
        Notificacao existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setId(notificacaoAtualizada.getId());
            existente.setUsuario(notificacaoAtualizada.getUsuario());
            existente.setSensor(notificacaoAtualizada.getSensor());
            existente.setEnviadoEm(notificacaoAtualizada.getEnviadoEm());
            existente.setMetodo(notificacaoAtualizada.getMetodo());
            existente.setStatus(notificacaoAtualizada.getStatus());
            existente.setMensagem(notificacaoAtualizada.getMensagem());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
