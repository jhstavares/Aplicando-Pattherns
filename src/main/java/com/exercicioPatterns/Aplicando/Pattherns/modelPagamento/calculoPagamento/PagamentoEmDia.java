package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoPagamento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements Calculo {

    @Override
    public BigDecimal factory(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorAPagar().subtract(pagamentoModel.getDiferencaValor());
    }
}
