package com.exercicioPatterns.Aplicando.Pattherns.controllerpagamento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.PagamentoModel;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoPagamento.Calculo;
import com.exercicioPatterns.Aplicando.Pattherns.servicepagamento.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pagamentos")
public class ControllerPagamento {
    @Autowired
    public PagamentoService pagamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel pagamento(@RequestBody PagamentoModel pagamentoModel, Calculo calculo) {
        return pagamentoService.pagar(pagamentoModel, calculo);
    }

    @GetMapping
    public List<PagamentoModel> buscarTodos() {
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/{id}")
    public Optional<PagamentoModel> buscarId(@PathVariable Long id) {
        return pagamentoService.buscarId(id);
    }

    @PutMapping(path = "/{id}")
    public PagamentoModel alterar(@RequestBody PagamentoModel pagamentoModel, Calculo calculoPagamento) {
        return pagamentoService.alterar(pagamentoModel, calculoPagamento);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        pagamentoService.deletar(id);
    }
}
