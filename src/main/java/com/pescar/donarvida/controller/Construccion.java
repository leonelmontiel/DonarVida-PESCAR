package com.pescar.donarvida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Construccion {
    @GetMapping("/construccion")
	public String getConstruccion(Model model) {
		return "construccion/construccion";
	}
}
