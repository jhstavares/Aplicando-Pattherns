package com.exercicioPatterns.Aplicando.Pattherns.servicepagamento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento.CalculoRecebimento;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento.CalculoValorFinal;
import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento.FactoryRecebimento;
import com.exercicioPatterns.Aplicando.Pattherns.repositorypagamento.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class RecebimentoService {
    @Autowired
    public RecebimentoRepository recebimentoRepository;

    public RecebimentoModel receber(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        BigDecimal resultado = FactoryRecebimento.getStatus(RecebimentoModel)
        recebimentoModel.setDescontoDoCartao(resultado);
        BigDecimal resultadoFinal = CalculoValorFinal.valorFinal(recebimentoModel.getValorAReceber(), recebimentoModel.getDescontoDoCartao());
        recebimentoModel.setValorFinal(resultadoFinal);

        return recebimentoRepository.save(recebimentoModel);
    }

    public List<RecebimentoModel> buscarTodos() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarId(Long codigo) {
        return recebimentoRepository.findById(codigo);
    }

    public RecebimentoModel alterar(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        BigDecimal resultado = FactoryRecebimento.getStatus(recebimentoModel.getStatus()).recebimentoFactory(recebimentoModel);
        recebimentoModel.setDescontoDoCartao(resultado);
        BigDecimal resultadoFinal = CalculoValorFinal.valorFinal(recebimentoModel.getValorAReceber(), recebimentoModel.getDescontoDoCartao());
        recebimentoModel.setValorFinal(resultadoFinal);

        return recebimentoRepository.save(recebimentoModel);
    }

    public void deletar(Long codigo) {
        recebimentoRepository.deleteById(codigo);
    }
}
