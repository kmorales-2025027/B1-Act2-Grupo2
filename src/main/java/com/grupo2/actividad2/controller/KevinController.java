package com.grupo2.actividad2.controller;

import com.grupo2.actividad2.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KevinController {
    @GetMapping("/kevin")
    public String paginaKevin(Model model) {
        Vehiculo vehiculo = new Vehiculo("P 246 JDT", "Honda", "Civic Si", 1991, "Rojo");

        model.addAttribute("vehiculo", vehiculo);
        return "KevinView"; //En este caso, la vista se llama perfil.html
    }
}
