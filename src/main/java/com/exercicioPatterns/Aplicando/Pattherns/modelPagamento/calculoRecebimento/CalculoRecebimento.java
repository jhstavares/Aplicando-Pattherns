package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {
    public BigDecimal CalculoRecebimento(RecebimentoModel recebimentoModel);
}
