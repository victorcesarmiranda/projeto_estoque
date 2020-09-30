package com.example.estoque.service;

import com.example.estoque.entity.Usuario;
import com.example.estoque.repoository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> findById(String id) {
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> findByLoginAndSenha(String login, String senha) {
        return usuarioRepository.findByLoginAndSenha(login, senha);
    }

}