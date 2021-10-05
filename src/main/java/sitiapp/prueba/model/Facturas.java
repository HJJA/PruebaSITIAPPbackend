package sitiapp.prueba.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "Facturas")
public class Facturas {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long consecutivo;
	private long cliente;
	@Temporal(TemporalType.DATE)
	private Date fecha;

	public Facturas() {
	}
	
	public Facturas(long cliente, Date fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}

	public long getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
		
}
