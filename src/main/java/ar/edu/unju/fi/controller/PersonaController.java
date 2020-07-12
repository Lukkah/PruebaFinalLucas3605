package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.entity.Persona;
import ar.edu.unju.fi.service.IPersonaService;

@Controller
@RequestMapping
public class PersonaController {
	
	@Autowired
	IPersonaService personaService;

	@Autowired
	private Persona persona;
	@Autowired
	private Persona personaAux;
	
	@RequestMapping("/personas")
	public String getPersonas(Model model) {
		return "Personas";
	}
	
	@GetMapping("/AltaPersona")
	public String agregar(Model model) {
		model.addAttribute("persona",persona);
		model.addAttribute("personaAux",personaAux);
		model.addAttribute("personas",personaService.listarPersonas());
		return "pruebaAlta";
	}
	
	@PostMapping("/savePersona")
	public String guardar(@ModelAttribute Persona persona, Model model) {
		personaService.guardarPersona(persona);
		return "pruebaAlta";
	}
	
	
	@PostMapping("/getPersona")
	public String getPersona(@ModelAttribute Persona personaAux, Model model) {

		this.persona=personaService.getPersonaByDni(personaAux.getDocumento());
		return "redirect:/AltaPersona";
	}

	
}
