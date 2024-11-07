package br.com.vbruno.memelandia.controller;

import br.com.vbruno.memelandia.entity.CategoriaMeme;
import br.com.vbruno.memelandia.service.ServicoCadastrarCategoria;
import br.com.vbruno.memelandia.service.ServicoListarTodasCategorias;
import br.com.vbruno.memelandia.service.ServicoValidarCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class ControllerCategoriaMeme {

    @Autowired
    private ServicoListarTodasCategorias servicoListarTodasCategorias;

    @Autowired
    private ServicoCadastrarCategoria servicoCadastrarCategoria;

    @Autowired
    private ServicoValidarCategoria servicoValidarCategoria;

    @GetMapping
    public List<CategoriaMeme> listaTodasCategorias() {
        return servicoListarTodasCategorias.listar();
    }

    @PostMapping
    public CategoriaMeme cadastraCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoCadastrarCategoria.cadastrar(categoriaMeme);
    }

    @GetMapping("{id}/validacao")
    public boolean validaCategoria(@PathVariable Long id) {
        return servicoValidarCategoria.validar(id);
    }
}
