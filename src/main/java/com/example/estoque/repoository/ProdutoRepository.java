package com.example.estoque.repoository;

import com.example.estoque.entity.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository  extends MongoRepository<Produto, String> {

    Produto findByNome(String nome);
}
