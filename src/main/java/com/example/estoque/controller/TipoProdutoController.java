package com.example.estoque.controller;

import com.example.estoque.entity.TipoProduto;
import com.example.estoque.service.TipoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TipoProdutoController {

    @Autowired
    TipoProdutoService tipoProdutoService;

    @GetMapping("/addTipoProduto")
    public String getTipoProduto(Model model) {
        model.addAttribute("tipoProduto", new TipoProduto());
        return "addTipoProduto";
    }

    @PostMapping("/addTipoProduto")
    public String tipoProdutoSave(@ModelAttribute TipoProduto tipoProduto) {
        tipoProdutoService.create(tipoProduto.getNome());
        return "tipoProdutoDetail";
    }
}
