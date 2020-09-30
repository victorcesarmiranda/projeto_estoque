package com.example.estoque.repoository;

import com.example.estoque.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Optional<Usuario> findByLoginAndSenha(String login, String senha);
}
