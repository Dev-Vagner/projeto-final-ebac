package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.Meme;
import br.com.vbruno.memelandia.feign.ClienteFeignCategoria;
import br.com.vbruno.memelandia.feign.ClienteFeignUsuario;
import br.com.vbruno.memelandia.repository.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCadastrarMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    @Autowired
    private ClienteFeignUsuario clienteFeignUsuario;

    @Autowired
    private ClienteFeignCategoria clienteFeignCategoria;

    public Meme cadastrar(Meme meme) {
        boolean usuarioValido = clienteFeignUsuario.validaUsuario(meme.getIdUsuario());

        if(!usuarioValido) throw new RuntimeException("Usuário inválido!");

        boolean categoriaValida = clienteFeignCategoria.validaCategoria(meme.getIdCategoriaMeme());

        if(!categoriaValida) throw new RuntimeException("Categoria inválida!");

        return repositorioMeme.save(meme);
    }
}
