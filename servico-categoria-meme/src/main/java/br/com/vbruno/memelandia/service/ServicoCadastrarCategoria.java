package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.CategoriaMeme;
import br.com.vbruno.memelandia.repository.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCadastrarCategoria {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public CategoriaMeme cadastrar(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }
}
