package nl.tvz.autotool.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarInfo {

    @Id
    private String kenteken;

    private String automerk;

    private String model;

    private double motorinhoud;





}
