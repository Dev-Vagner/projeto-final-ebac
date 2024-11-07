package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.Usuario;
import br.com.vbruno.memelandia.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoListarTodosUsuarios {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public List<Usuario> listar() {
        return repositorioUsuario.findAll();
    }
}
