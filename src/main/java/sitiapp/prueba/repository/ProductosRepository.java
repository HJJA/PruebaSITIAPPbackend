package sitiapp.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sitiapp.prueba.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long>{

}
