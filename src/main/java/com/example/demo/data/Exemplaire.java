package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exemplaire {

    int id;
    Ordinateur ordinateur;
    Personnel personnel;

    void emprunter(int idPersonnel){

    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }
}
