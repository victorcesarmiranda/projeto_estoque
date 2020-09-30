package com.example.estoque.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {

    @Id
    private String id;

    private String nome;

    private TipoProduto tipoProduto;

    private Double quantidade;

    public Produto(String nome, TipoProduto tipoProduto, Double quantidade) {
        this.nome = nome;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
