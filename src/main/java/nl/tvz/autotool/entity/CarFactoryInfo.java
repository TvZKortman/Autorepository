package nl.tvz.autotool.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarFactoryInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String automerk;

    private String model;

    private String mileuklasse;

    private double brandstofVerbruikStad;

    private double brandstofVerbruikBuiten;

    private double brandstofVerbruikCombi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutomerk() {
        return automerk;
    }

    public void setAutomerk(String automerk) {
        this.automerk = automerk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileuklasse() {
        return mileuklasse;
    }

    public void setMileuklasse(String mileuklasse) {
        this.mileuklasse = mileuklasse;
    }

    public double getBrandstofVerbruikStad() {
        return brandstofVerbruikStad;
    }

    public void setBrandstofVerbruikStad(double brandstofVerbruikStad) {
        this.brandstofVerbruikStad = brandstofVerbruikStad;
    }

    public double getBrandstofVerbruikBuiten() {
        return brandstofVerbruikBuiten;
    }

    public void setBrandstofVerbruikBuiten(double brandstofVerbruikBuiten) {
        this.brandstofVerbruikBuiten = brandstofVerbruikBuiten;
    }

    public double getBrandstofVerbruikCombi() {
        return brandstofVerbruikCombi;
    }

    public void setBrandstofVerbruikCombi(double brandstofVerbruikCombi) {
        this.brandstofVerbruikCombi = brandstofVerbruikCombi;
    }
}
