package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.entity.Persona;
import ar.edu.unju.fi.entity.Validacion;
import ar.edu.unju.fi.service.IPersonaService;
import ar.edu.unju.fi.service.IValidacionService;

@Controller
@RequestMapping
public class ValidacionController {
	
	@Autowired
	private IValidacionService validacionService;
	
	@Autowired
	private IPersonaService personaService;

	@Autowired
	Persona persona;
	
	@Autowired
	Validacion validacion;
	
	@GetMapping("/create")
	public String crearValidacion(Model model) {
		model.addAttribute("persona",persona);
		model.addAttribute("validacion",validacion);
		return "ValidacionForm";
	}

	@PostMapping("/save")
	public String guardarValidacion(@ModelAttribute Validacion validacion) {
		validacionService.guardarValidacion(validacion);
		System.out.println("Validacion guardad");
		return "redirect:/create";
	}
	
	
	@PostMapping("/getPersonaValidacion")
	public String getPersonaValidacion(@ModelAttribute Persona personaAux, Model model) {
		this.persona = new Persona();
		this.persona=personaService.getPersonaByDni(personaAux.getDocumento());
		this.validacion.setPersona(this.persona);
		model.addAttribute("validacion",validacion);
		return cargarPersonaEcontrada(model);
	}
	
	@GetMapping("/guardarValidacion")
	public String cargarPersonaEcontrada(Model model) {
		
		return "ValidacionForm";
	}
	
}
