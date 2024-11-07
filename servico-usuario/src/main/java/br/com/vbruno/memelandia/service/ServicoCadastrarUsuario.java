package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.Usuario;
import br.com.vbruno.memelandia.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCadastrarUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario cadastrar(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
}
