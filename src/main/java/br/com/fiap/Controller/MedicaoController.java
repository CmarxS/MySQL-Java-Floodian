package br.com.fiap.Controller;

import br.com.fiap.Model.Medicao;
import br.com.fiap.Service.MedicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicoes")
public class MedicaoController {

    @Autowired
    private MedicaoService medicaoService;

    @PostMapping
    public Medicao criar(@RequestBody Medicao medicao) {
        return medicaoService.salvar(medicao);
    }

    @GetMapping
    public List<Medicao> listar() {
        return medicaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Medicao buscarPorId(@PathVariable Long id) {
        return medicaoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Medicao atualizar(@PathVariable Long id, @RequestBody Medicao medicao) {
        return medicaoService.atualizar(id, medicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        medicaoService.deletar(id);
    }
}