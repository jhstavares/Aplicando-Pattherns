package com.exercicioPatterns.Aplicando.Pattherns.repositorypagamento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPagamento extends JpaRepository<PagamentoModel, Long> {

}
