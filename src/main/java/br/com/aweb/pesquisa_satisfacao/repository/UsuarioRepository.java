package br.com.aweb.pesquisa_satisfacao.repository;

import br.com.aweb.pesquisa_satisfacao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
