package rc.bootsecurity.model;

import edu.gemini.app.ocs.model.AstronomicalData;
import edu.gemini.app.ocs.model.Filter;
import edu.gemini.app.ocs.model.Lens;
import edu.gemini.app.ocs.model.SpecialEquipment;
import jparsec.observer.LocationElement;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity(name = "ObservingProgram")
public class ObservingProgram {
    @Id
    private int id;
    private LocationElement loc;
    private Lens lens;
    private ArrayList<Filter> filters;
    private ArrayList<Double> exposures;
    private boolean isLightDetectorOn;
    private ArrayList<SpecialEquipment> specialEquipments;
    private AstronomicalData astroData;
    private String notes;

    public ObservingProgram() {

    }

    public ObservingProgram(int id, LocationElement loc, Lens lens, ArrayList<Filter> filters,
                                ArrayList<Double> exposures, boolean isLightDetectorOn,
                                ArrayList<SpecialEquipment> specialEquipments,
                                AstronomicalData astroData) {
        this.id = id;
        this.loc = loc;
        this.lens = lens;
        this.filters = filters;
        this.exposures = exposures;
        this.isLightDetectorOn = isLightDetectorOn;
        this.specialEquipments = specialEquipments;
        this.astroData = astroData;
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

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public ArrayList<Filter> getFilters() {
        return filters;
    }

    public void setFilters(ArrayList<Filter> filters) {
        this.filters = filters;
    }

    public ArrayList<Double> getExposures() {
        return exposures;
    }

    public void setExposures(ArrayList<Double> exposures) {
        this.exposures = exposures;
    }

    public boolean isLightDetectorOn() {
        return isLightDetectorOn;
    }

    public void setLightDetectorOn(boolean lightDetectorOn) {
        isLightDetectorOn = lightDetectorOn;
    }

    public ArrayList<SpecialEquipment> getSpecialEquipments() {
        return specialEquipments;
    }

    public void setSpecialEquipments(ArrayList<SpecialEquipment> specialEquipments) {
        this.specialEquipments = specialEquipments;
    }

    public AstronomicalData getAstroData() {
        return astroData;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAstroData(AstronomicalData astroData) {
        this.astroData = astroData;
    }
}
