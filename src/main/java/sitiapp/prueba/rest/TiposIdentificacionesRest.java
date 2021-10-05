package sitiapp.prueba.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sitiapp.prueba.model.TiposIdentificaciones;
import sitiapp.prueba.service.TiposIdentificacionesService;

@RestController
@RequestMapping ("/tiposID/")
public class TiposIdentificacionesRest {
	
	@Autowired
	private TiposIdentificacionesService tiposIdentificacionesService;
	
	@GetMapping
	private ResponseEntity<List<TiposIdentificaciones>> getTiposID(){
		return ResponseEntity.ok(tiposIdentificacionesService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<TiposIdentificaciones> getAlltipoByPais (@PathVariable("id") long idtio){
		return ResponseEntity.ok(tiposIdentificacionesService.findAlltipoid(idtio));
		
	}
	
	

}
