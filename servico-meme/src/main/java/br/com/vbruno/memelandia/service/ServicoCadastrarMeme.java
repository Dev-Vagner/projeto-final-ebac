package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.Meme;
import br.com.vbruno.memelandia.repository.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCadastrarMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme cadastrar(Meme meme) {
        return repositorioMeme.save(meme);
    }
}
