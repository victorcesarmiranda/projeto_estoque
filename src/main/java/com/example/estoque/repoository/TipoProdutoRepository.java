package com.example.estoque.repoository;

import com.example.estoque.entity.TipoProduto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoProdutoRepository extends MongoRepository<TipoProduto, String> {
}
