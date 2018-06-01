package nl.tvz.autotool.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CarUsageInfo {

    @Id
    private String kenteken;
    private Date tankDatum;
    private double standKenteken;
    private double prijsPerLiter;
    private double totaalTankbeurt;


    public String getKenteken() {
        return kenteken;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public Date getTankDatum() {
        return tankDatum;
    }

    public void setTankDatum(Date tankDatum) {
        this.tankDatum = tankDatum;
    }

    public double getStandKenteken() {
        return standKenteken;
    }

    public void setStandKenteken(double standKenteken) {
        this.standKenteken = standKenteken;
    }

    public double getPrijsPerLiter() {
        return prijsPerLiter;
    }

    public void setPrijsPerLiter(double prijsPerLiter) {
        this.prijsPerLiter = prijsPerLiter;
    }

    public double getTotaalTankbeurt() {
        return totaalTankbeurt;
    }

    public void setTotaalTankbeurt(double totaalTankbeurt) {
        this.totaalTankbeurt = totaalTankbeurt;
    }
}
