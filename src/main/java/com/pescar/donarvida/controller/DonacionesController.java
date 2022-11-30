package com.pescar.donarvida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import com.pescar.donarvida.models.Donaciones;
import com.pescar.donarvida.services.DonacionesService;

@Controller
public class DonacionesController {

    @Autowired
    private DonacionesService donacionesService;

    @GetMapping("/donaciones")
	public String getDonaciones(Model model) {
        var donaciones = donacionesService.listarDonaciones();
		model.addAttribute("donaciones", donaciones);
		model.addAttribute("donacion", new Donaciones());
		return "donaciones/donaciones";
	}

/*     @GetMapping("donaciones/agregar")
	public String agregar(Donaciones donacion) {
		return "donaciones/donaciones";
	} */

    @PostMapping("donaciones/guardar")
	public String guardar(@ModelAttribute("donacion") Donaciones donacion, Errors errors, Model model) throws Exception {
		if (errors.hasErrors()) {
			return this.getDonaciones(model);
		}
		try {
			this.actualizarOGuardar(donacion);
		} catch (Exception e) {
			model.addAttribute("excepcion", e);
			return this.getDonaciones(model);
		}
		
		return "redirect:/donaciones";
		
	}

    private Donaciones actualizarOGuardar(Donaciones donacion) {
        if (donacionesService.existe(donacion)) {
			donacionesService.actualizar(donacion);
		} else {
			donacionesService.guardar(donacion);
		}
		return donacionesService.encontrarDonacion(donacion);
    }

}