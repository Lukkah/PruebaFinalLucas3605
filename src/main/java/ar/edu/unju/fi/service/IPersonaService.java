package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Persona;

public interface IPersonaService {
	
	public void guardarPersona(Persona persona);
	
	List <Persona> listarPersonas();
	
	Persona getPersonaByDni(String dni);

}
