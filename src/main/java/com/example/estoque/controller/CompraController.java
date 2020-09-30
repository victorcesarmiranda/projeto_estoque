package com.example.estoque.controller;

import com.example.estoque.entity.Compra;
import com.example.estoque.entity.Fornecedor;
import com.example.estoque.entity.Produto;
import com.example.estoque.service.CompraService;
import com.example.estoque.service.FornecedorService;
import com.example.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CompraController {

    @Autowired
    CompraService compraService;

    @Autowired
    FornecedorService fornecedorService;

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/addCompra")
    public String get(Model model) {
        List<String> listaFornecedores = fornecedorService.findAll().stream().map(Fornecedor::getNome).collect(Collectors.toList());
        List<String> listaProdutos = produtoService.findAll().stream().map(Produto::getNome).collect(Collectors.toList());
        model.addAttribute("compra", new Compra());
        model.addAttribute("listaFornecedores", listaFornecedores);
        model.addAttribute("listaProdutos", listaProdutos);
        return "addCompra";
    }

    @PostMapping("/addCompra")
    public void save(@ModelAttribute Compra compra) {
        compraService.create(compra.getFornecedor(), compra.getProduto(), compra.getQuantidade(), compra.getData());
    }
}
