package com.example.estoque.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Compra {

    @Id
    private String id;

    private Fornecedor fornecedor;

    private Produto produto;

    private Double quantidade;

    private LocalDate data;

    public Compra(Fornecedor fornecedor, Produto produto, Double quantidade, LocalDate data) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }

    public Compra() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
