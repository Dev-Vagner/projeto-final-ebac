package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.CategoriaMeme;
import br.com.vbruno.memelandia.repository.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoListarTodasCategorias {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public List<CategoriaMeme> listar() {
        return repositorioCategoriaMeme.findAll();
    }
}
