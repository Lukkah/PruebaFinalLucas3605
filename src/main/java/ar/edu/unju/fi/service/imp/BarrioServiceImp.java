package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.Barrio;
import ar.edu.unju.fi.repository.IBarrioDAO;
import ar.edu.unju.fi.service.IBarrioService;
/**
 * 
 * @author kry_m
 *
 */
@Service
public class BarrioServiceImp implements IBarrioService{
	
	@Autowired
	private IBarrioDAO barrioDaoImp;

	@Override
	public void guardarBarrio(Barrio unBarrio) {
		barrioDaoImp.save(unBarrio);
		
	}

	@Override
	public Barrio obtenerBarrioNombre(String nombre) {
		// TODO Auto-generated method stub
		return barrioDaoImp.findByNombre(nombre);
	}

	@Override
	public List<Barrio> obtenerBarrios() {
		return barrioDaoImp.findAll();
	}

	

}
