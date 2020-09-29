package com.example.estoque.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Document
public class Venda {

    @Id
    private String id;

    private Cliente cliente;

    private Produto produto;

    private Double quantidade;

    private LocalDate data;

}
