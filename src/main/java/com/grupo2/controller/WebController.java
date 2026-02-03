package com.grupo2.actividad2grupo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Bienvenido a Motos Pro");
        model.addAttribute("descripcion", "La mejor selección de motos del país.");
        return "index";
    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        return index(model);
    }

    @GetMapping("/catalogo")
    public String catalogo() {
        return "motos";
    }
}