package com.example.estoque.repoository;

import com.example.estoque.entity.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
}
