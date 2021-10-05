package sitiapp.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sitiapp.prueba.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
