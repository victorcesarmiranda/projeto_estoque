package com.example.estoque.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@Document
public class Fornecedor {

    @Id
    private String id;

    private String nome;

}
