package com.example.BuscadorDeRestaurantes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestauranteController {

    // Rota simples de teste
    @GetMapping("/hello")
    public String hello() {
        return "Backend funcionando 🚀";
    }

}
