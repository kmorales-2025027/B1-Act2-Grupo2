package com.grupo2.actividad2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

    @GetMapping("/vista-david")
    public String vistaDavid(Model model) {
        // Simulando datos de productos de baseball
        List<Producto> productos = Arrays.asList(
                new Producto("Bate de Aluminio Pro", 150.00,
                        "https://images.unsplash.com/photo-1593787483323-28952403914e?q=80&w=400"),
                new Producto("Guante de Cuero", 85.50,
                        "https://images.unsplash.com/photo-1516731415730-0c641909a83a?q=80&w=400"),
                new Producto("Pelota Oficial MLB", 12.00,
                        "https://images.unsplash.com/photo-1530915534664-4ac6423816b7?q=80&w=400"),
                new Producto("Casco de Protección", 45.00,
                        "https://images.unsplash.com/photo-1628126235206-5260b9ea6441?q=80&w=400"));

        model.addAttribute("productos", productos);
        return "VistaDavid";
    }

    @GetMapping("/datos-david")
    public String datosDavid() {
        return "DatosDavid";
    }

    // Clase interna simple para manejar los datos
    public static class Producto {
        private String nombre;
        private double precio;
        private String imagen;

        public Producto(String nombre, double precio, String imagen) {
            this.nombre = nombre;
            this.precio = precio;
            this.imagen = imagen;
        }

        // Getters necesarios para Thymeleaf
        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getImagen() {
            return imagen;
        }
    }
}