package com.example.estoque.service;

import com.example.estoque.entity.Compra;
import com.example.estoque.repoository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    CompraRepository compraRepository;

    public Optional<Compra> findById(String id) {
        return compraRepository.findById(id);
    }
}
