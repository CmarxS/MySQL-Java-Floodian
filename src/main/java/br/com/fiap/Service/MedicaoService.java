package br.com.fiap.Service;

import br.com.fiap.Model.Medicao;
import br.com.fiap.Repository.MedicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicaoService {

    @Autowired
    private MedicaoRepository repository;

    public Medicao salvar(Medicao medicao) {
        return repository.save(medicao);
    }

    public List<Medicao> listarTodos() {
        return repository.findAll();
    }

    public Medicao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Medicao atualizar(Long id, Medicao medicaoAtualizada) {
        Medicao existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setId(medicaoAtualizada.getId());
            existente.setSensor(medicaoAtualizada.getSensor());
            existente.setMomento(medicaoAtualizada.getMomento());
            existente.setValor(medicaoAtualizada.getValor());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
