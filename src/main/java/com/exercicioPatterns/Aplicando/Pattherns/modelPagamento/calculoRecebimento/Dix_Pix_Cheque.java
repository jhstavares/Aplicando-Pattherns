package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;

import java.math.BigDecimal;

public class Dix_Pix_Cheque implements CalculoRecebimento {

    @Override
    public BigDecimal CalculoRecebimento(RecebimentoModel recebimentoModel) {
        return BigDecimal.valueOf(0);
    }
}
