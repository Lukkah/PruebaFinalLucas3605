package ar.edu.unju.fi.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.RegistroTracking;
import ar.edu.unju.fi.repository.RegistroRepository;
import ar.edu.unju.fi.service.IRegistroService;

@Service
public class RegistroServiceImp implements IRegistroService {

	@Autowired
	private RegistroRepository registroRepository;
	
	@Override
	public void guardarRegistro(RegistroTracking registro) {
		registroRepository.save(registro);

	}

}
