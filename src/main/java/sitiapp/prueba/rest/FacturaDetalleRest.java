package sitiapp.prueba.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sitiapp.prueba.model.FacturaDetalle;
import sitiapp.prueba.service.FacturaDetalleService;

@RestController
@RequestMapping ("/facturaDetalle/")
public class FacturaDetalleRest {
	@Autowired
	private FacturaDetalleService detalleService;
	
	@GetMapping
	private ResponseEntity<List<FacturaDetalle>> getFacturaDetalle(){
		return ResponseEntity.ok(detalleService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity< List<FacturaDetalle> > getAllproductoID(@PathVariable("id") long consecutivo){
		return ResponseEntity.ok(detalleService.findAlldetalleID(consecutivo)); 
	}
	
	@PostMapping
	private ResponseEntity<FacturaDetalle> saveFacturaDetalle (@RequestBody FacturaDetalle factura){
		try {
			
			FacturaDetalle facturaguardada = detalleService.save(factura);
			return ResponseEntity.created(new URI("/facturaDetalle/"+facturaguardada.getId())).body(facturaguardada);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteProducto ( @PathVariable("id") long id){
		detalleService.deleteById(id);
		return ResponseEntity.ok(!(detalleService.findById(id)!=null)); 
	}
	
	
}
