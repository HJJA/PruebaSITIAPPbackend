package sitiapp.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sitiapp.prueba.model.Perfil;
import sitiapp.prueba.service.PerfilService;

@RestController
@RequestMapping ("/perfil/")
public class PerfilRest {
	
	@Autowired
	private PerfilService perfilService;
	
	@GetMapping
	private ResponseEntity<List<Perfil>> getAllPerfil(){
		return ResponseEntity.ok(perfilService.findAll()); 
	}	 

}
