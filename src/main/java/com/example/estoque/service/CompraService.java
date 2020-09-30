package com.example.estoque.service;

import com.example.estoque.entity.Compra;
import com.example.estoque.entity.Produto;
import com.example.estoque.repoository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;

    @Autowired
    ProdutoService produtoService;

    public Optional<Compra> findById(String id) {
        return compraRepository.findById(id);
    }

    public void create(String fornecedor, String produto, Double quantidade, LocalDate data) {
        Compra compra = new Compra(fornecedor, produto, quantidade, data);
        this.save(compra);
        Produto produtoComprado = produtoService.findByNome(produto);
        produtoComprado.setUltimaCompra(quantidade);
        produtoComprado.setQuantidade(produtoComprado.getQuantidade() + quantidade);
        produtoService.save(produtoComprado);
    }

    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }
}
