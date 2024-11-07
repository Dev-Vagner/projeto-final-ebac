package br.com.vbruno.memelandia.repository;

import br.com.vbruno.memelandia.entity.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
