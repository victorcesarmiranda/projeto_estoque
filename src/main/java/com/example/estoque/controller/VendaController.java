package com.example.estoque.controller;

import com.example.estoque.entity.Venda;
import com.example.estoque.service.ClienteService;
import com.example.estoque.service.ProdutoService;
import com.example.estoque.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class VendaController {

    @Autowired
    VendaService vendaService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/addVenda")
    public String get(Model model) {
        model.addAttribute("venda", new Venda());
        model.addAttribute("listaClientes", clienteService.findAll());
        model.addAttribute("listaProdutos", produtoService.findAll());
        return "addVenda";
    }

    @PostMapping("/addVenda")
    public void save(@ModelAttribute Venda venda) {
        vendaService.create(venda.getCliente(), venda.getProduto(), venda.getQuantidade(), venda.getData());
    }
}
