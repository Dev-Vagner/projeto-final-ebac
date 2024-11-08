package br.com.vbruno.memelandia.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "usuario", url = "http://localhost:8081")
public interface ClienteFeignUsuario {

    @RequestMapping(method = RequestMethod.GET, path="/usuarios/{id}/validacao")
    boolean validaUsuario(@PathVariable Long id);
}
