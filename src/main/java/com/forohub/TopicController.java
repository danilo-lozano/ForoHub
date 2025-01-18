package com.forohub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tópicos")
public class TopicController {

    @GetMapping
    public String obtenerTodosLosTopicos() {
        return "Listado de todos los tópicos";
    }
}


