package com.vendas.sistema.service;

import com.vendas.sistema.model.Produto;
import com.vendas.sistema.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica ao Spring que esta classe guarda a lógica de negócio do sistema
public class ProdutoService {

    @Autowired // Injeção de Dependência: o Spring gerencia e nos entrega o repositório pronto
    private ProdutoRepository produtoRepository;

    // Regra para listar todos os produtos cadastrados
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Regra para salvar um novo produto no banco de dados
    public Produto salvar(Produto produto) {
        // Exemplo de regra de negócio: garantir que o preço nunca seja negativo
        if (produto.getPreco() < 0) {
            throw new IllegalArgumentException("O preço do produto não pode ser menor que zero.");
        }
        return produtoRepository.save(produto);
    }
}
