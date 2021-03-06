package com.example.estoque.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {

    @Id
    private String id;

    private String nome;

    private String tipoProduto;

    private Double quantidade;

    private Double ultimaCompra;

    private Double ultimaVenda;

    public Produto(String nome, String tipoProduto, Double quantidade) {
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

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Double ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    public Double getUltimaVenda() {
        return ultimaVenda;
    }

    public void setUltimaVenda(Double ultimaVenda) {
        this.ultimaVenda = ultimaVenda;
    }

}
