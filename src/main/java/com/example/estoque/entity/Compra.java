package com.example.estoque.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document
public class Compra {

    @Id
    private String id;

    private String fornecedor;

    private String produto;

    private Double quantidade;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;

    public Compra(String fornecedor, String produto, Double quantidade, LocalDate data) {
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

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
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
