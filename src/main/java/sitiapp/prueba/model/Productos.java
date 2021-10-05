package sitiapp.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private long codigo;
	private String nombre; 
	private String estado; 
	private long valorunitario;
	
	
	public Productos() {
	}
	
	public Productos(long codigo, String nombre, String estado, long valorunitario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.valorunitario = valorunitario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(long valorunitario) {
		this.valorunitario = valorunitario;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
