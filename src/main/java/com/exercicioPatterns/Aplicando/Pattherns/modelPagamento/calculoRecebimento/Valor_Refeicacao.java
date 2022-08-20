package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;

import java.math.BigDecimal;

public class Valor_Refeicacao implements CalculoRecebimento {
    public BigDecimal recebimentoFactory(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAReceber().multiply(new BigDecimal("0.042"));
    }

    @Override
    public BigDecimal CalculoRecebimento(RecebimentoModel recebimentoModel) {
        return null;
    }
}
