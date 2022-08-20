package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

import java.math.BigDecimal;

public class CalculoValorFinal {
    public static BigDecimal valorFinal(BigDecimal valorAPagar, BigDecimal valorDesconto) {
        return valorAPagar.subtract(valorDesconto);
    }
}
