package ar.edu.unju.fi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="validaciones")
@Component
public class Validacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		

	private Boolean usaTapaboca;
	
	private Boolean cumpleTerminacionDni;
	
	private Boolean poseePermisoCirculacion;
	
	private Boolean estaAcompaniado;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="personas_id")
	private Persona persona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getUsaTapaboca() {
		return usaTapaboca;
	}

	public void setUsaTapaboca(Boolean usaTapaboca) {
		this.usaTapaboca = usaTapaboca;
	}

	public Boolean getCumpleTerminacionDni() {
		return cumpleTerminacionDni;
	}

	public void setCumpleTerminacionDni(Boolean cumpleTerminacionDni) {
		this.cumpleTerminacionDni = cumpleTerminacionDni;
	}

	public Boolean getPoseePermisoCirculacion() {
		return poseePermisoCirculacion;
	}

	public void setPoseePermisoCirculacion(Boolean poseePermisoCirculacion) {
		this.poseePermisoCirculacion = poseePermisoCirculacion;
	}

	public Boolean getEstaAcompaniado() {
		return estaAcompaniado;
	}

	public void setEstaAcompaniado(Boolean estaAcompaniado) {
		this.estaAcompaniado = estaAcompaniado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Validacion [id=" + id + ", usaTapaboca=" + usaTapaboca + ", cumpleTerminacionDni="
				+ cumpleTerminacionDni + ", poseePermisoCirculacion=" + poseePermisoCirculacion + ", estaAcompaniado="
				+ estaAcompaniado + ", persona=" + persona + "]";
	}

	

}
