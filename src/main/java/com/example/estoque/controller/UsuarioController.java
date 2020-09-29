package com.example.estoque.controller;

import com.example.estoque.entity.Usuario;
import com.example.estoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public String getUser(Model model, @PathVariable String id) {
        model.addAttribute("usuario", usuarioService.findById(id));
        return "detalheUsuario";
    }
}
