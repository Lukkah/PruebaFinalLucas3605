package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.Validacion;
import ar.edu.unju.fi.repository.ValidacionRepository;
import ar.edu.unju.fi.service.IValidacionService;

@Service
public class ValidacionServiceImp implements IValidacionService {
	
	@Autowired
	private ValidacionRepository validacionRepository;

	@Override
	public List<Validacion> listarValidaciones() {
		return (List<Validacion>) validacionRepository.findAll();
	}

	@Override
	public void guardarValidacion(Validacion validacion) {
		validacionRepository.save(validacion);
	}

	@Override
	public Validacion buscarPorId(Long id) {
		return validacionRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		validacionRepository.deleteById(id);
	}

}
