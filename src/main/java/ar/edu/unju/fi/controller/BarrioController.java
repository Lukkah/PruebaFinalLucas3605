package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.entity.Barrio;
import ar.edu.unju.fi.service.IBarrioService;

/**
 * 
 * @author kry_m
 *ccm
 */
@Controller
@RequestMapping
public class BarrioController {

	@Autowired
	IBarrioService barrioService;
	
	@Autowired
	private Barrio barrio;
	
	@RequestMapping("/barrios")
	public String getBarrios (Model model) {
		return "Barrios";
	}
	
	@GetMapping("/AltaBarrios")
	public String agregar(Model model) {
		model.addAttribute("barrio",barrio);
		return "barrioForm";
	}
	
	@PostMapping("/saveBarrio")
	public String guardar (@Validated Barrio barrio , Model model) {
		barrioService.guardarBarrio(barrio);
		return "redirect:/barrios";
	}
	
	
}
