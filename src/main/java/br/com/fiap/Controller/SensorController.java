package br.com.fiap.Controller;

import br.com.fiap.Model.Sensor;
import br.com.fiap.Service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return sensorService.salvar(sensor);
    }

    @GetMapping
    public List<Sensor> listar() {
        return sensorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return sensorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Sensor atualizar(@PathVariable Long id, @RequestBody Sensor sensor) {
        return sensorService.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        sensorService.deletar(id);
    }
}
