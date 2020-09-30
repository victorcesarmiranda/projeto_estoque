package com.example.estoque.service;

import com.example.estoque.entity.Fornecedor;
import com.example.estoque.entity.Produto;
import com.example.estoque.entity.TipoProduto;
import com.example.estoque.repoository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public void create(String nome, TipoProduto tipoProduto, Double quantidade) {
        Produto produto = new Produto(nome, tipoProduto, quantidade);
        this.save(produto);
    }

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
}