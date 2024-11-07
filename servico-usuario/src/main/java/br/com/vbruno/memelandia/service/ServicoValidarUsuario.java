package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoValidarUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public boolean validar(Long id) {
        return repositorioUsuario.existsById(id);
    }
}
