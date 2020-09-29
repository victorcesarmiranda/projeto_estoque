package com.example.estoque.service;

import com.example.estoque.entity.TipoProduto;
import com.example.estoque.repoository.TipoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoProdutoService {

    @Autowired
    TipoProdutoRepository tipoProdutoRepository;

    public Optional<TipoProduto> findById(String id) {
        return tipoProdutoRepository.findById(id);
    }

    public TipoProduto create(String nome) {
        TipoProduto tipoProduto = new TipoProduto(nome);
        return this.save(tipoProduto);
    }

    public TipoProduto save(TipoProduto tipoProduto) {
        return tipoProdutoRepository.save(tipoProduto);
    }

}