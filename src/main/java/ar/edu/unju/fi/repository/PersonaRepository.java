package ar.edu.unju.fi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.entity.Persona;

public interface PersonaRepository extends CrudRepository<Persona,Long>{
	
	 @Query("select p from Persona p where p.documento = :dni ")
	  Persona findByDNI(String dni);
	 
	 Persona findByDocumento(String documento);
	 
	  

}
