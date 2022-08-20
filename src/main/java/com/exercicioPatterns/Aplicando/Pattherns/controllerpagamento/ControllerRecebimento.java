package com.exercicioPatterns.Aplicando.Pattherns.controllerpagamento;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class ControllerRecebimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "valor_a_pagar", nullable = false)
    private BigDecimal valorAReceber;
    @Column(name = "valorRecebido")
    private BigDecimal descontoDoCartao;
    @Column(name = "valorFinal")
    private BigDecimal valorFinal;
}
