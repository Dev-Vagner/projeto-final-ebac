package br.com.vbruno.memelandia.controller;

import br.com.vbruno.memelandia.entity.Meme;
import br.com.vbruno.memelandia.service.ServicoCadastrarMeme;
import br.com.vbruno.memelandia.service.ServicoListarTodosMemes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class ControllerMeme {

    @Autowired
    private ServicoListarTodosMemes servicoListarTodosMemes;

    @Autowired
    private ServicoCadastrarMeme servicoCadastrarMeme;

    @GetMapping
    public List<Meme> listaTodosMemes() {
        return servicoListarTodosMemes.listar();
    }

    @PostMapping
    public Meme cadastraMeme(@RequestBody Meme meme) {
        return servicoCadastrarMeme.cadastrar(meme);
    }
}
