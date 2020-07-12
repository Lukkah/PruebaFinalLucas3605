package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.entity.Persona;
import ar.edu.unju.fi.entity.RegistroTracking;
import ar.edu.unju.fi.entity.Validacion;
import ar.edu.unju.fi.service.IPersonaService;
import ar.edu.unju.fi.service.IRegistroService;
import ar.edu.unju.fi.service.IValidacionService;

@Controller
public class RegistroController {

	@Autowired
	private IValidacionService validacionService;
	
	@Autowired
	private IPersonaService personaService;
	
	@Autowired
	private IRegistroService registroService;

	@Autowired
	Persona persona;
	
	@Autowired
	Validacion validacion;
	
	@Autowired
	RegistroTracking registro;
	

	List<Validacion> validaciones = new ArrayList<Validacion>();
	
	
	@GetMapping("/createRegistro")
	public String crearValidacion(Model model) {
		model.addAttribute("persona",persona);
		model.addAttribute("validacion",validacion);
		model.addAttribute("registro",registro);
		return "RegistroForm";
	}

	@PostMapping("/saveValidacionRegistro")
	public String guardarValidacion(@ModelAttribute Validacion validacion) {
		validaciones.add(validacion);
		validacionService.guardarValidacion(validacion);
		System.out.println("Validacion guardada");
		return "redirect:/createRegistro";
	}
	
	
	@PostMapping("/getPersonaRegistro")
	public String getPersonaValidacion(@ModelAttribute Persona personaAux, Model model) {
		this.persona = new Persona();
		this.persona=personaService.getPersonaByDni(personaAux.getDocumento());
		this.validacion.setPersona(this.persona);
		model.addAttribute("validacion",validacion);
		model.addAttribute("registro",registro);
		//return "RegistroForm";
		return cargarPersonaEcontrada(model);
	}
	
	@GetMapping("/guardarValidacionRegistro")
	public String cargarPersonaEcontrada(Model model) {
		
		return "RegistroForm";
	}
	
	
	@PostMapping("/saveRegistro")
	public String guardarRegistro(@ModelAttribute RegistroTracking registro) {
		this.registro.setValidaciones(validaciones);
		registroService.guardarRegistro(registro);
		System.out.println("Registro guardado");
		return "redirect:/createRegistro";
	}
	
}
