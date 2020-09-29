package com.example.estoque.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Document
public class Compra {

    @Id
    private String id;

    private Fornecedor fornecedor;

    private Produto produto;

    private Double quantidade;

    private LocalDate data;
}
