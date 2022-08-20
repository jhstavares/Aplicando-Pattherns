package com.exercicioPatterns.Aplicando.Pattherns.modelPagamento;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamento")
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPagamento;

    @Column(name = "Status", length = 50, nullable = false)
    private String status;

    @Column(name = "valor_A_Pagar", length = 50, nullable = false)
    private BigDecimal valorAPagar;

    @Column(name = "diferencavalor", length = 50, nullable = false)
    private BigDecimal diferencaValor;

    @Column(name = "valorpago")
    private BigDecimal valorPago;


}
