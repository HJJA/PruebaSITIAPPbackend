package sitiapp.prueba.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sitiapp.prueba.model.Productos;
import sitiapp.prueba.service.ProductosService;

@RestController
@RequestMapping ("/productos/")
public class ProductosRest {
	@Autowired
	private ProductosService productosService; 
	
	@GetMapping
	private ResponseEntity<List<Productos>> getProductos(){
		return ResponseEntity.ok(productosService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<Productos> getAllproductoID(@PathVariable("id") long idproducto){
		return ResponseEntity.ok(productosService.findAllidproducto(idproducto)); 
	}
	
	@PostMapping
	private ResponseEntity<Productos> saveProductos (@RequestBody Productos productos){
		try {
			
			Productos productosguardados = productosService.save(productos);
			return ResponseEntity.created(new URI("/productos/"+productosguardados.getId())).body(productosguardados);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
	}
	
}
