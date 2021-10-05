package sitiapp.prueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Perfil")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idperfil; 
	private String nombre;
	
	public Perfil() {
	}
	public Perfil(String nombre) {
		super();
		this.nombre = nombre;
	}
	public long getIdperfil() {
		return idperfil;
	}
	public void setId_perfil(long idperfil) {
		this.idperfil = idperfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	
	

}
