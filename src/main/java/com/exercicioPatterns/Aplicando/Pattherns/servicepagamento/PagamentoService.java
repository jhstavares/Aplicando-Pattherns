package com.exercicioPatterns.Aplicando.Pattherns.servicepagamento;


import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.PagamentoModel;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoPagamento.Calculo;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoPagamento.Factory;
import com.exercicioPatterns.Aplicando.Pattherns.repositorypagamento.RepositoryPagamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    public RepositoryPagamento repositoryPagamento;

    public PagamentoModel pagar(PagamentoModel pagamentoModel, Calculo calculo) {
        BigDecimal resultado = Factory.getStatus(pagamentoModel.getStatus()).factory(pagamentoModel);
        pagamentoModel.setValorPago(resultado);
        return repositoryPagamento.save(pagamentoModel);
    }

    public List<PagamentoModel> buscarTodos() {
        return repositoryPagamento.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long codigo) {
        return repositoryPagamento.findById(codigo);
    }

    public PagamentoModel alterar(PagamentoModel pagamentoModel, Calculo calculo) {

        BigDecimal resultado = Factory.getStatus(pagamentoModel.getStatus()).factory(pagamentoModel);
        pagamentoModel.setValorPago(resultado);
        return repositoryPagamento.save(pagamentoModel);
    }

    public void deletar(Long codigo) {
        repositoryPagamento.deleteById(codigo);
    }
}

