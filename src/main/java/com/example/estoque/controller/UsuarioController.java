package com.example.estoque.controller;

import com.example.estoque.entity.Usuario;
import com.example.estoque.repoository.UsuarioRepository;
import com.example.estoque.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/")
    public String login(Usuario usuario) {
        Optional<Usuario> usuarioBuscado = usuarioService.findByLoginAndSenha(usuario.getLogin(), usuario.getSenha());

        if (usuarioBuscado.isPresent()) {
            return "menu";
        }
        return "index";
    }

    @GetMapping("/")
    public String getUser(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "index";
    }
}
