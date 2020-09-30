package com.example.estoque.service;

import com.example.estoque.entity.Cliente;
import com.example.estoque.entity.Fornecedor;
import com.example.estoque.repoository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Optional<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public void create(String nome) {
        Cliente cliente = new Cliente(nome);
        this.save(cliente);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}