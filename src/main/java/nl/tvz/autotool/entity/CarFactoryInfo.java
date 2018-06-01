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


}
