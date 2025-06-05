package br.com.fiap.Service;


import br.com.fiap.Model.Localizacao;
import br.com.fiap.Repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository repository;

    public Localizacao salvar(Localizacao localizacao) {
        return repository.save(localizacao);
    }

    public List<Localizacao> listarTodos() {
        return repository.findAll();
    }

    public Localizacao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Localizacao atualizar(Long id, Localizacao localizacaoAtualizada) {
        Localizacao existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setId(localizacaoAtualizada.getId());
            existente.setNome(localizacaoAtualizada.getNome());
            existente.setLatitude(localizacaoAtualizada.getLatitude());
            existente.setLongitude(localizacaoAtualizada.getLongitude());
            existente.setTipoArea(localizacaoAtualizada.getTipoArea());
            existente.setDescricao(localizacaoAtualizada.getDescricao());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
