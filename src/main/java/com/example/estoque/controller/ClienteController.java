package com.example.estoque.controller;

import com.example.estoque.entity.Cliente;
import com.example.estoque.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/addCliente")
    public String get(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "addCliente";
    }

    @GetMapping("/cliente")
    public String lista(Model model) {
        model.addAttribute("listaClientes", clienteService.findAll());
        return "cliente";
    }

    @PostMapping("/addCliente")
    public String save(@ModelAttribute Cliente cliente) {
        clienteService.create(cliente.getNome());
        return "redirect:cliente";
    }
}
