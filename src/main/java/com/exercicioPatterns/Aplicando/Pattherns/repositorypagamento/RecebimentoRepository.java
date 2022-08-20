package com.exercicioPatterns.Aplicando.Pattherns.repositorypagamento;

import com.exercicioPatterns.Aplicando.Pattherns.modelPagamento.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
