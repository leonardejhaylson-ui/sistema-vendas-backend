package com.vendas.sistema.controller;

import com.vendas.sistema.model.Produto;
import com.vendas.sistema.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Diz ao Spring que esta classe é uma API REST que responde JSON
@RequestMapping("/api/produtos") // Define a URL base para todos os endpoints deste controlador
public class ProdutoController {

    @Autowired // Injeta a camada de negócio de forma automática
    private ProdutoService produtoService;

    // Endpoint para buscar todos os produtos: GET http://localhost:8080/api/produtos
    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarTodos();
    }

    // Endpoint para cadastrar um produto: POST http://localhost:8080/api/produtos
    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
}
