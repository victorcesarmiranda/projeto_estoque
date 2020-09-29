package com.example.estoque.service;

import com.example.estoque.entity.Produto;
import com.example.estoque.repoository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Optional<Produto> findById(String id) {
        return produtoRepository.findById(id);
    }

}