package sitiapp.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idusuario; 
	private String nombre; 
	private String apellido;
	
	@Column(unique = true)
	private String usuario;
	private String contrasena;
	private long idperfil;
	
	public Usuario() {
	}
	public Usuario(String nombre, String apellido, String usuario, String contrasena, long idperfil) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.idperfil = idperfil;
	}

	

	public long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}
	public long getIdperfil() {
		return idperfil;
	}
	public void setIdperfil(long idperfil) {
		this.idperfil = idperfil;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public long getId_perfil() {
		return idperfil;
	}

	public void setId_perfil(long idperfil) {
		this.idperfil = idperfil;
	}
	
	
	
	
}
