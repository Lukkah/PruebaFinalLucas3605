package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Validacion;

public interface IValidacionService {
	
	public List<Validacion> listarValidaciones();
	
	public void guardarValidacion(Validacion validacion);
	
	public Validacion buscarPorId(Long id);
	
	public void eliminar(Long id);
	
}
