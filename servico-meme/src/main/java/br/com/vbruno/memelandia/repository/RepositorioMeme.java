package br.com.vbruno.memelandia.repository;

import br.com.vbruno.memelandia.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
