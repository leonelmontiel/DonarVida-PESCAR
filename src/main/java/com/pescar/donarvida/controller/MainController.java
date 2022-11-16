package com.pescar.donarvida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
	public String getSolicitudes(Model model) {
		return "index";
	}

}