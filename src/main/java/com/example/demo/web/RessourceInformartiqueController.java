package com.example.demo.web;

import com.example.demo.service.ServiceInformatque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RessourceInformartiqueController {

    @Autowired
    ServiceInformatque serviceInformatque;

    @GetMapping(value = "/ordinateurs")
    public String getStatistiques(@RequestBody ListerOrdinateurCommande listerOrdinateur) {
        return "Bonjour";
    }

    @PutMapping("/emprunter")
    public void emprunter(@RequestBody ReserverOrdinateurCommande reserverOrdinateur){
        serviceInformatque.emprunter(reserverOrdinateur);

    }

    @PutMapping("/ramener")
    public void ramener(@RequestBody RamenerOrdinateurCommande reserverOrdinateur){
        serviceInformatque.ramener(reserverOrdinateur);
    }

}
