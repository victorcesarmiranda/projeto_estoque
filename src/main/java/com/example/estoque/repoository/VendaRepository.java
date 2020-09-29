package com.example.estoque.repoository;

import com.example.estoque.entity.Fornecedor;
import com.example.estoque.entity.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendaRepository  extends MongoRepository<Venda, String> {
}
