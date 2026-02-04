package com.grupo2.actividad2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JosepController {

    @GetMapping("/josep")
    public String vistaJosep() {
        return "vista-josep";
    }
}
