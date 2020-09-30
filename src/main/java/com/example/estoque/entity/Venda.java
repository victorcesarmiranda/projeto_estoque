package com.example.estoque.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Venda {

    @Id
    private String id;

    private Cliente cliente;

    private Produto produto;

    private Double quantidade;

    private LocalDate data;

    public Venda() {
    }

    public Venda(Cliente cliente, Produto produto, Double quantidade, LocalDate data) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
