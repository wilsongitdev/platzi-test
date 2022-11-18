package com.example.platzitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaHumoController {

    @GetMapping("/hola")
    public String saludame(){
        return "nunca pares de aprender osharp";
    }
}
