package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@Entity
@Table(name = "recebimento")
public class RecebimentoModel {

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

    @Column(name = "valor_a_pagar", length = 100, nullable = false)
    private BigDecimal valorAPagar;

}
