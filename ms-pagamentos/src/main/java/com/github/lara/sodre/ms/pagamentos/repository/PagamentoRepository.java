package com.github.lara.sodre.ms.pagamentos.repository;

import com.github.lara.sodre.ms.pagamentos.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
