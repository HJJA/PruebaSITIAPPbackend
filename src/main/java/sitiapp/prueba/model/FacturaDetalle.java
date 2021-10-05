package sitiapp.prueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "FacturaDetalle")
public class FacturaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	private long consecutivo;
	private long idproducto; 
	private long cantidad; 
	private long valorunitario;
	
	public FacturaDetalle() {
	}
	
	public FacturaDetalle(long consecutivo, long id_producto, long cantidad, long valorunitario) {
		super();
		this.consecutivo = consecutivo;
		this.idproducto = id_producto;
		this.cantidad = cantidad;
		this.valorunitario = valorunitario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(long consecutivo) {
		this.consecutivo = consecutivo;
	}

	public long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(long valorunitario) {
		this.valorunitario = valorunitario;
	}

	
	
	
	
	
	
	
}
