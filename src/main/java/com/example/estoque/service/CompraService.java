package com.example.estoque.service;

import com.example.estoque.entity.Compra;
import com.example.estoque.entity.Fornecedor;
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

    public void create(Fornecedor fornecedor, Produto produto, Double quantidade, LocalDate data) {
        Compra compra = new Compra(fornecedor, produto, quantidade, data);
        this.save(compra);
        produto.setUltimaCompra(quantidade);
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        produtoService.save(produto);
    }

    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }
}
