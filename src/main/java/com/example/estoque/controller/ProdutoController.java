package com.example.estoque.controller;

import com.example.estoque.entity.Produto;
import com.example.estoque.entity.TipoProduto;
import com.example.estoque.service.ProdutoService;
import com.example.estoque.service.TipoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @Autowired
    TipoProdutoService tipoProdutoService;

    @GetMapping("/addProduto")
    public String get(Model model) {
        List<String> listaTiposProduto = tipoProdutoService.findAll().stream().map(TipoProduto::getNome).collect(Collectors.toList());
        model.addAttribute("produto", new Produto());
        model.addAttribute("listaTiposProduto", listaTiposProduto);
        return "addProduto";
    }

    @PostMapping("/addProduto")
    public void save(@ModelAttribute Produto produto) {
        produtoService.create(produto.getNome(), produto.getTipoProduto(), produto.getQuantidade());
    }

    @GetMapping("/")
    private String index(Model model) {
        List<Produto> listaProdutos = produtoService.findAll();
        model.addAttribute("listaProdutos",listaProdutos);
        return "index";
    }

}
