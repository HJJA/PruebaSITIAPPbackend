package sitiapp.prueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TiposIdentificaciones")
public class TiposIdentificaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tipoid;
	private String abreviatura; 
	private String descripcion;
	
	public TiposIdentificaciones() {
	}
	public TiposIdentificaciones(String abreviatura, String descripcion) {
		super();
		this.abreviatura = abreviatura;
		this.descripcion = descripcion;
	}
	public long getTipoID() {
		return tipoid;
	}
	public void setTipo_identificacion(long tipoID) {
		this.tipoid = tipoID;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
