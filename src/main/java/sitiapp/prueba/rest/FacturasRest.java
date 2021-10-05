package sitiapp.prueba.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sitiapp.prueba.model.Facturas;
import sitiapp.prueba.service.FacturasService;

@RestController
@RequestMapping ("/facturas/")
public class FacturasRest {
	
	@Autowired
	private FacturasService facturasService;
	
	@GetMapping
	private ResponseEntity<List<Facturas>> getFacturas(){
		return ResponseEntity.ok(facturasService.findAll()); 
	}
	
	@PostMapping
	private ResponseEntity<Facturas> saveFacturas (@RequestBody Facturas factura){
		try {
			
			Facturas facturaguardada = facturasService.save(factura);
			return ResponseEntity.created(new URI("/facturas/"+facturaguardada.getConsecutivo())).body(facturaguardada);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	

}
