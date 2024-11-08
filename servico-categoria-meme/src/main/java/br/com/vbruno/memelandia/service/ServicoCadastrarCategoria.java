package br.com.vbruno.memelandia.service;

import br.com.vbruno.memelandia.entity.CategoriaMeme;
import br.com.vbruno.memelandia.feign.ClienteFeignUsuario;
import br.com.vbruno.memelandia.repository.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoCadastrarCategoria {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    @Autowired
    private ClienteFeignUsuario clienteFeignUsuario;

    public CategoriaMeme cadastrar(CategoriaMeme categoriaMeme) {
        boolean usuarioValido = clienteFeignUsuario.validaUsuario(categoriaMeme.getIdUsuario());

        if(!usuarioValido) throw new RuntimeException("Usuário inválido!");

        return repositorioCategoriaMeme.save(categoriaMeme);
    }
}
