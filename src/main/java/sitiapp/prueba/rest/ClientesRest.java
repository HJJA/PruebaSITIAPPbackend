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

import sitiapp.prueba.model.Clientes;
import sitiapp.prueba.service.ClientesService;

@RestController
@RequestMapping ("/clientes/")
public class ClientesRest {
	
	@Autowired
	private ClientesService clientesService;
	
	
	@GetMapping
	private ResponseEntity<List<Clientes>> getClientes(){
		return ResponseEntity.ok(clientesService.findAll()) ;
	}
	
	
	@PostMapping
	private ResponseEntity<Clientes> saveCliente (@RequestBody Clientes cliente){
		try {
			
			Clientes clienteguardado = clientesService.save(cliente); 
			return ResponseEntity.created(new URI("/clientes/"+clienteguardado.getCliente())).body(clienteguardado); 
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
		}
		
		
	}

}
