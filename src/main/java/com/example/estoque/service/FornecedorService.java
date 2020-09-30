package com.example.estoque.service;

import com.example.estoque.entity.Fornecedor;
import com.example.estoque.repoository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public Optional<Fornecedor> findById(String id) {
        return fornecedorRepository.findById(id);
    }

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public void create(String nome) {
        Fornecedor fornecedor = new Fornecedor(nome);
        this.save(fornecedor);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

}