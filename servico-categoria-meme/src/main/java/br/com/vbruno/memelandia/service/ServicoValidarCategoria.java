package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.repository.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoValidarCategoria {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public boolean validar(Long id) {
        return repositorioCategoriaMeme.existsById(id);
    }
}
