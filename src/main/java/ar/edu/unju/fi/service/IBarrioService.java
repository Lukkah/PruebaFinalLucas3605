package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Barrio;
/**
 * 
 * @author kry_m
 *
 */
public interface IBarrioService {
	public void guardarBarrio(Barrio barrio);
	public Barrio obtenerBarrioNombre(String nombre);
	
	public List<Barrio> obtenerBarrios();
}
