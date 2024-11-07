package br.com.vbruno.memelandia.repository;

import br.com.vbruno.memelandia.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
