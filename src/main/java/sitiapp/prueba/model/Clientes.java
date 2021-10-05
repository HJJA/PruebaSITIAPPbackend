package sitiapp.prueba.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "Clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cliente; 	
	private long tiposidentificacion;
	@Column(unique = true)
	private String identificacion;
	private String razonsocial;
	@Temporal(TemporalType.DATE)
	private Date fecharegistro;
	private String estado;
	
	
	
	public Clientes() {
	}



	public Clientes(int tiposidentificacion, String identificacion, String razonsocial,
			Date fecharegistro, String estado) {
		super();
		this.tiposidentificacion = tiposidentificacion;
		this.identificacion = identificacion;
		this.razonsocial = razonsocial;
		this.fecharegistro = fecharegistro;
		this.estado = estado;
	}



	public long getCliente() {
		return cliente;
	}



	public void setCliente(long cliente) {
		this.cliente = cliente;
	}



	public long getTiposidentificacion() {
		return tiposidentificacion;
	}



	public void setTiposidentificacion(long tiposidentificacion) {
		this.tiposidentificacion = tiposidentificacion;
	}



	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	public String getRazonsocial() {
		return razonsocial;
	}



	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}



	public Date getFecharegistro() {
		return fecharegistro;
	}



	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
	
	
	
	
	
}
