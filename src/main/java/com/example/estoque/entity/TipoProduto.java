package com.example.estoque.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TipoProduto {

    @Id
    private String id;

    private String nome;

    public TipoProduto(String nome) {
        this.nome = nome;
    }

    public TipoProduto() {
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
}
