package ar.edu.unju.fi.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Clase Barrio
 * @author Fernando
 *editado por  kry_m
 */
@Component
@Entity
@Table(name="barrios")
public class Barrio implements Serializable {
	 

	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 @Column(name = "ID") 
	 private long id;
	 
	//Variables miembro
	 @Column(name = "NOMBREBARRIO" , length = 100 , nullable = true)
	 private String nombre;
	 
	 @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
	 private List<RegistroTracking> registros = new ArrayList<RegistroTracking>();
	
	
	//Constructores---------------------------------------------------------------
	
	/**
	 * Constructor por defecto
	 */
	public Barrio() {
	}
	
	

	public Barrio(String nombre) {
		super();
		this.nombre = nombre;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	

}