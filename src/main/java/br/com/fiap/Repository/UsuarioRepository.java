package br.com.fiap.Repository;

import br.com.fiap.Model.UsuarioAplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioAplicacao, Long> {
}
