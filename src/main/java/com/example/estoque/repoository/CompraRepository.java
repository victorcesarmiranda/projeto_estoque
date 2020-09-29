package com.example.estoque.repoository;

import com.example.estoque.entity.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompraRepository  extends MongoRepository<Compra, String> {
}
