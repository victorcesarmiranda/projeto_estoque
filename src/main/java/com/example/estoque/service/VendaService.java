package com.example.estoque.service;

import com.example.estoque.entity.Venda;
import com.example.estoque.repoository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public Optional<Venda> findById(String id) {
        return vendaRepository.findById(id);
    }

}