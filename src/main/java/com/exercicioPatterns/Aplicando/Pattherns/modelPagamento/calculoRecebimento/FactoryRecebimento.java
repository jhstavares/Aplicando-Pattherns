package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.calculoRecebimento;

public class FactoryRecebimento {

    public static CalculoRecebimento getStatus(String status) {
        if (status.equalsIgnoreCase("dinheiro") || status.equalsIgnoreCase("pix") || status.equalsIgnoreCase("cheque")) {
            return new Dix_Pix_Cheque();
        } else if (status.equalsIgnoreCase("credito")) {
            return new Cartao_Credito();
        } else if (status.equalsIgnoreCase("debito")) {
            return new Cartao_Debito();
        } else if (status.equalsIgnoreCase("valeRefeicao")) {
            return new Valor_Refeicacao();
        } else {
            return null;
        }
    }

}
