package com.example.estoque.controller;

import com.example.estoque.entity.Cliente;
import com.example.estoque.entity.Fornecedor;
import com.example.estoque.entity.Produto;
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

import java.util.List;
import java.util.stream.Collectors;

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
        List<String> listaClientes = clienteService.findAll().stream().map(Cliente::getNome).collect(Collectors.toList());
        List<String> listaProdutos = produtoService.findAll().stream().map(Produto::getNome).collect(Collectors.toList());
        model.addAttribute("venda", new Venda());
        model.addAttribute("listaClientes", listaClientes);
        model.addAttribute("listaProdutos", listaProdutos);
        return "addVenda";
    }

    @GetMapping("/venda")
    public String lista(Model model) {
        model.addAttribute("listaVendas", vendaService.findAll());
        return "venda";
    }

    @PostMapping("/addVenda")
    public String save(@ModelAttribute Venda venda) {
        vendaService.create(venda.getCliente(), venda.getProduto(), venda.getQuantidade(), venda.getData());
        return "redirect:venda";
    }
}
