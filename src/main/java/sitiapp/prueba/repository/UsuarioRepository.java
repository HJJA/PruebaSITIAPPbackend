package sitiapp.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sitiapp.prueba.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
