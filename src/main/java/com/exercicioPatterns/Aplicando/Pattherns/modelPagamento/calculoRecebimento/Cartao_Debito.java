package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;

import java.math.BigDecimal;

public class Cartao_Debito implements CalculoRecebimento {

    @Override
    public BigDecimal CalculoRecebimento(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber().multiply(new BigDecimal("0.025"));

    }
}
