package com.example.demo.service;

import com.example.demo.data.Exemplaire;
import com.example.demo.data.ExemplaireRepository;
import com.example.demo.web.RamenerOrdinateurCommande;
import com.example.demo.web.ReserverOrdinateurCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ServiceInformatque {

    @Autowired
    ExemplaireRepository exemplaireRepository;

    public void emprunter(ReserverOrdinateurCommande reserverOrdinateur){
        Iterable<Exemplaire> exemplaires = exemplaireRepository.findAll();
    }


    public void ramener(RamenerOrdinateurCommande reserverOrdinateur){

    }


}
