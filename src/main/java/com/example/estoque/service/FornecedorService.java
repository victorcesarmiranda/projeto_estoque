package com.example.estoque.service;

import com.example.estoque.entity.Fornecedor;
import com.example.estoque.repoository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public Optional<Fornecedor> findById(String id) {
        return fornecedorRepository.findById(id);
    }

}