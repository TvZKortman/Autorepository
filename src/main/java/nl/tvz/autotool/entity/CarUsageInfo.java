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

}
