package br.com.fiap.Service;

import br.com.fiap.Model.Sensor;
import br.com.fiap.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Sensor atualizar(Long id, Sensor sensorAtualizado) {
        Sensor existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setId(sensorAtualizado.getId());
            existente.setLocalizacao(sensorAtualizado.getLocalizacao());
            existente.setDataInstalacao(sensorAtualizado.getDataInstalacao());
            existente.setStatus(sensorAtualizado.getStatus());
            existente.setNumeroSerie(sensorAtualizado.getNumeroSerie());
            existente.setLimiteAlerta(sensorAtualizado.getLimiteAlerta());
            existente.setIntervaloHoras(sensorAtualizado.getIntervaloHoras());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

