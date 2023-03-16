package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class UtilisateurController {

    @GetMapping(value = "/ordinateurs")
    public String getStatistiques() {
        return "Bonjour";
    }

}
