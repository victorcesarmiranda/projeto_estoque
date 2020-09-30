package com.example.estoque.controller;

import com.example.estoque.entity.Fornecedor;
import com.example.estoque.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @GetMapping("/addFornecedor")
    public String get(Model model) {
        model.addAttribute("fornecedor", new Fornecedor());
        return "addFornecedor";
    }

    @GetMapping("/fornecedor")
    public String lista(Model model) {
        model.addAttribute("listaFornecedores", fornecedorService.findAll());
        return "fornecedor";
    }

    @PostMapping("/addFornecedor")
    public String save(@ModelAttribute Fornecedor fornecedor) {
        fornecedorService.create(fornecedor.getNome());
        return "redirect:fornecedor";
    }
}
