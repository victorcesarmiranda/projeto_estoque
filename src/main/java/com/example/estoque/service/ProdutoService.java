package com.example.estoque.service;

import com.example.estoque.entity.Produto;
import com.example.estoque.entity.TipoProduto;
import com.example.estoque.repoository.ProdutoRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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

    public void setTipoProdutoNomeForList(List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (Objects.isNull(produto.getTipoProduto())) {
                produto.setTipoProdutoNome(Strings.EMPTY);
            } else {
                produto.setTipoProdutoNome(produto.getTipoProduto().getNome());
            }
        }
    }
}