package com.example.estoque.controller;

import com.example.estoque.entity.Compra;
import com.example.estoque.service.CompraService;
import com.example.estoque.service.FornecedorService;
import com.example.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

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
        model.addAttribute("compra", new Compra());
        model.addAttribute("listaFornecedores", fornecedorService.findAll());
        model.addAttribute("listaProdutos", produtoService.findAll());
        return "addCompra";
    }

    @PostMapping("/addCompra")
    public void save(@ModelAttribute Compra compra) {
        compraService.create(compra.getFornecedor(), compra.getProduto(), compra.getQuantidade(), LocalDate.now());
    }
}
