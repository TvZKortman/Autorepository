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


    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
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

    public double getMotorinhoud() {
        return motorinhoud;
    }

    public void setMotorinhoud(double motorinhoud) {
        this.motorinhoud = motorinhoud;
    }
}
