package br.com.vbruno.memelandia.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "categoria", url = "http://localhost:8082")
public interface ClienteFeignCategoria {

    @RequestMapping(method = RequestMethod.GET, path="/categorias/{id}/validacao")
    boolean validaCategoria(@PathVariable Long id);
}
