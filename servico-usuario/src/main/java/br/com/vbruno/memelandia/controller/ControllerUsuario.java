package br.com.vbruno.memelandia.controller;

import br.com.vbruno.memelandia.entity.Usuario;
import br.com.vbruno.memelandia.service.ServicoCadastrarUsuario;
import br.com.vbruno.memelandia.service.ServicoListarTodosUsuarios;
import br.com.vbruno.memelandia.service.ServicoValidarUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoListarTodosUsuarios servicoListarTodosUsuarios;

    @Autowired
    private ServicoCadastrarUsuario servicoCadastrarUsuario;

    @Autowired
    private ServicoValidarUsuario servicoValidarUsuario;

    @GetMapping
    public List<Usuario> listaTodosUsuarios() {
        return servicoListarTodosUsuarios.listar();
    }

    @PostMapping
    public Usuario cadastraUsuario(@RequestBody Usuario usuario) {
        return servicoCadastrarUsuario.cadastrar(usuario);
    }

    @GetMapping("{id}/validacao")
    public boolean validaUsuario(@PathVariable Long id) {
        return servicoValidarUsuario.validar(id);
    }
}
