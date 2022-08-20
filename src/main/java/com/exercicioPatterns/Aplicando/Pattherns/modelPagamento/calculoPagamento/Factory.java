package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoPagamento;

public class Factory {

    public static Calculo getStatus(String status) {
        if (status.equalsIgnoreCase("pagamento_atrasado")) {
            return new PagamentoAtrasado();
        } else if (status.equalsIgnoreCase("pagamento_em_dia")) {
            return new PagamentoEmDia();
        } else {
            return null;
        }
    }
}
