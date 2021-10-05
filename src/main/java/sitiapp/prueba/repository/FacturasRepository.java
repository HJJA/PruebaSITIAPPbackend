package sitiapp.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sitiapp.prueba.model.Facturas;

public interface FacturasRepository extends JpaRepository<Facturas, Long>{

}
