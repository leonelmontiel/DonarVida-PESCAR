package com.pescar.donarvida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.pescar.donarvida.services.DonacionesService;

@Controller
public class DonacionesController {

    @Autowired
    private DonacionesService donacionesService;

    @GetMapping("/donaciones")
	public String getDonaciones(Model model) {
        var donaciones = donacionesService.listarDonaciones();
		model.addAttribute("donaciones", donaciones);
		return "donaciones/donaciones";
	}

}