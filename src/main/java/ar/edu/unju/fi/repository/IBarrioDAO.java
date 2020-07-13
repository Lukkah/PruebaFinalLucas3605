package ar.edu.unju.fi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.entity.Barrio;
/**
 * 
 * @author kry_m
 *
 */
public interface IBarrioDAO extends JpaRepository<Barrio, Long>{
	public Barrio findByNombre(String nombre); 
}
