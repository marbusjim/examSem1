package com.umss.diplomado.examen1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "Hola";
    }

    @RequestMapping("/saludo2")
    public String saludo1() {
        return "Hola soy el saludo2";
    }

    @RequestMapping("/saludo3")
    public String saludo3() {
        return "Hola soy el saludo3";
    }
}
