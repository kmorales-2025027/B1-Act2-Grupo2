package com.grupo2.actividad2.controller;

import com.grupo2.actividad2.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EdderController {
    @GetMapping("/edder")
    public String edder(Model model) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca("P 256 HXZ");
        vehiculo.setMarca("Audi");
        vehiculo.setModelo("R8");
        vehiculo.setAnio(2017);
        vehiculo.setColor("Naranja");

        model.addAttribute("vehiculo", vehiculo);
        return "EdderView";
    }

}
