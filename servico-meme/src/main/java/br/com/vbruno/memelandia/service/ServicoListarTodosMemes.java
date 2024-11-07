package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.Meme;
import br.com.vbruno.memelandia.repository.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoListarTodosMemes {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public List<Meme> listar() {
        return repositorioMeme.findAll();
    }
}
