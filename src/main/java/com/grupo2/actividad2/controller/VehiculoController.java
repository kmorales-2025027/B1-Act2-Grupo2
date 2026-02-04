package com.grupo2.actividad2.controller;

import com.grupo2.actividad2.model.Vehiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {
    // Jan Carlo Ramos
    @GetMapping("/vehiculo")
    public String vehiculo(Model model) {
        Vehiculo v = new Vehiculo("P123ABC", "Toyota", "Corolla", 2022, "Rojo");
        model.addAttribute("vehiculo", v);
        return "vista-josep";
    }

    //Angel Muñoz
    @GetMapping("/vehiculos")
    public String mostrarVehiculos(Model model) {
        List<Vehiculo> lista = new ArrayList<>();
        Vehiculo v1 = new Vehiculo("P 067 EFN", "Honda", "Civic", 1992, "Negro");
        lista.add(v1);

        model.addAttribute("vehiculos", lista);
        return "vehiculos";
    }

    // Vista de datos personales
    @GetMapping("/datosPersonales")
    public String datosPersonales() {
        return "datosPersonales";
    }

    @GetMapping("/angel")
    public String angel() {
        return "DatosAngel";
    }
}
