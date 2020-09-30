package com.example.estoque.service;

import com.example.estoque.entity.Cliente;
import com.example.estoque.entity.Produto;
import com.example.estoque.entity.Venda;
import com.example.estoque.repoository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    @Autowired
    ProdutoService produtoService;

    public Optional<Venda> findById(String id) {
        return vendaRepository.findById(id);
    }

    public void create(Cliente cliente, Produto produto, Double quantidade, LocalDate data) {
        Venda venda = new Venda(cliente, produto, quantidade, data);
        this.save(venda);
        produto.setUltimaCompra(quantidade);
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        produtoService.save(produto);
    }

    public Venda save(Venda venda) {
        return vendaRepository.save(venda);
    }

}