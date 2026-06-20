package com.vendas.sistema.repository;

import com.vendas.sistema.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Define que esta interface gerencia o acesso aos dados SQL
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Herdando de JpaRepository, o Spring Boot nos dá métodos automáticos como:
    // save(), findById(), findAll() e deleteById() sem precisar digitar SQL manual
}
