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

import sitiapp.prueba.model.Usuario;
import sitiapp.prueba.service.UsuarioService;

@RestController
@RequestMapping ("/usuarios/")
public class UsuarioRest {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll()); 
	}
	
	
	@PostMapping
	private ResponseEntity<Usuario> saveUsuario (@RequestBody Usuario usuario){
		try {
			
			Usuario usuarioguardado = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/usuarios/"+usuarioguardado.getIdusuario())).body(usuarioguardado);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
