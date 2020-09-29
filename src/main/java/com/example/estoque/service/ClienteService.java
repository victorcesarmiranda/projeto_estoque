package com.example.estoque.service;

import com.example.estoque.entity.Cliente;
import com.example.estoque.repoository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Optional<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }

}