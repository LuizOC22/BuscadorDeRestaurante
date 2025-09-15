package com.example.BuscadorDeRestaurantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class RestauranteController {

    // Rota simples de teste
    @GetMapping("/hello")
    public String hello() {
        return "Backend funcionando 🚀";
    }

    // Rota para listar restaurantes fictícios
    @GetMapping("/restaurantes")
    public List<String> listarRestaurantes() {
        return Arrays.asList(
                "🍣 Restaurante Japonês A",
                "🍔 Hamburgueria B",
                "🍕 Pizzaria C"
        );
    }
}
