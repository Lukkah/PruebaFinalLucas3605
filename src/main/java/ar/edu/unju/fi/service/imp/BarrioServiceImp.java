package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.Barrio;
import ar.edu.unju.fi.repository.BarrioRepository;
import ar.edu.unju.fi.service.IBarrioService;

@Service
public class BarrioServiceImp implements IBarrioService {

	@Autowired
	private BarrioRepository barrioRepository;
	
	@Override
	public void guardarBarrio(Barrio barrio) {
		barrioRepository.save(barrio);

	}

}
