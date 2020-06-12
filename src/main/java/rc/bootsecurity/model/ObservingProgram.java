package rc.bootsecurity.model;

import edu.gemini.app.ocs.model.*;
import edu.gemini.app.ocs.*;
import jparsec.observer.LocationElement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity(name = "ObservingProgram")
public class ObservingProgram extends BaseObservingProgram {
    @Id
    @GeneratedValue(generator = "address_seq", strategy = GenerationType. SEQUENCE)
    private int id;
    private LocationElement loc;

    //lens
    private String lmake;
    private String lmodel;
    private String lmanufacturer;
    private String lyear;
    //filter
    private String fmake;
    private String fmanufacturer;
    private String fmodel;
    private int fyear;
    private double fsize;
    private double fweight;

    //exposure
    private Double exposures1;

    private boolean isLightDetectorOn;

    //specialEquipment
    private String equipmentName;
    private String ownerName;
    private Date installedDate;

//    private AstronomicalData astroData;
    private String notes;

    public ObservingProgram() {

    }

    public ObservingProgram(int id, LocationElement loc, String lmake, String lmodel,
            String lmanufacturer, String lyear, String fmake, String fmanufacturer, String fmodel, int fyear, double fsize, double fweight,
                                Double exposures1, boolean isLightDetectorOn, String equipmentName, String ownerName, Date installedDate ,String notes)
//                                AstronomicalData astroData)
                                {
        this.id = id;
        this.loc = loc;
        this.lmake = lmake;
        this.lmodel =lmodel;
        this.lmanufacturer = lmanufacturer;
        this.lyear = lyear;
        this.fmake = fmake;
        this.fmanufacturer = fmanufacturer;
        this.fmodel= fmodel;
        this.fyear = fyear;
        this.fsize = fsize;
        this.fweight = fweight;
        this.exposures1 = exposures1;
        this.isLightDetectorOn = isLightDetectorOn;
        this.equipmentName = equipmentName;
        this.ownerName = ownerName;
        this.installedDate = installedDate;
        this.notes = notes;
    }

    public Double getExposures1() {
        return exposures1;
    }

    public void setExposures(Double exposures1){
        this.exposures1 = this.exposures1;
    }
    public String getLmake() {
        return lmake;
    }

    public void setLmake(String lmake) {
        this.lmake = lmake;
    }

    public String getLmodel() {
        return lmodel;
    }

    public void setLmodel(String lmodel) {
        this.lmodel = lmodel;
    }

    public String getLmanufacturer() {
        return lmanufacturer;
    }

    public void setLmanufacturer(String lmanufacturer) {
        this.lmanufacturer = lmanufacturer;
    }

    public String getLyear() {
        return lyear;
    }

    public void setLyear(String lyear) {
        this.lyear = lyear;
    }

    public String getFmake() {
        return fmake;
    }

    public void setFmake(String fmake) {
        this.fmake = fmake;
    }

    public String getFmanufacturer() {
        return fmanufacturer;
    }

    public void setFmanufacturer(String fmanufacturer) {
        this.fmanufacturer = fmanufacturer;
    }

    public String getFmodel() {
        return fmodel;
    }

    public void setFmodel(String fmodel) {
        this.fmodel = fmodel;
    }

    public int getFyear() {
        return fyear;
    }

    public void setFyear(int fyear) {
        this.fyear = fyear;
    }

    public double getFsize() {
        return fsize;
    }

    public void setFsize(double fsize) {
        this.fsize = fsize;
    }

    public double getFweight() {
        return fweight;
    }

    public void setFweight(double fweight) {
        this.fweight = fweight;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getInstalledDate() {
        return installedDate;
    }

    public void setInstalledDate(Date installedDate) {
        this.installedDate = installedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocationElement getLoc() {
        return loc;
    }

    public void setLoc(LocationElement loc) {
        this.loc = loc;
    }

    public boolean isLightDetectorOn() {
        return isLightDetectorOn;
    }

    public void setLightDetectorOn(boolean lightDetectorOn) {
        isLightDetectorOn = lightDetectorOn;
    }


//    public AstronomicalData getAstroData() {
//        return astroData;

//    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

//    public void setAstroData(AstronomicalData astroData) {
//        this.astroData = astroData;
//    }
}
