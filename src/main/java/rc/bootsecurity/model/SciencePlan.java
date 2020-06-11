package rc.bootsecurity.model;


import edu.gemini.app.ocs.model.BaseObservingProgram;
import edu.gemini.app.ocs.model.BaseSciencePlan;
import edu.gemini.app.ocs.model.DataProcRequirement;
import jparsec.ephem.Target;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.gemini.app.ocs.model.*;

@Entity(name = "SciencePlan")
public class SciencePlan extends BaseSciencePlan {
    @Id
    private int planNo;
    private String planName;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private Target.TARGET starSystem;
    private Date startDate;
    private Date endDate;
    private BaseSciencePlan.TELESCOPELOC telescopeLocation;
    private DataProcRequirement.TYPE fileType;
    private double fileQuality;
    private DataProcRequirement.COLOR_TYPE colorType;
    private double contrast;
    private double brightness;
    private double saturation;

    private BaseSciencePlan.STATUS status;

    public SciencePlan() {
    }

    public SciencePlan(String planName, String creator, String submitter, double fundingInUSD,
                       String objectives, Target.TARGET starSystem, Date startDate,
                       Date endDate, BaseSciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement.TYPE fileType,
                       double fileQuality, DataProcRequirement.COLOR_TYPE colorType, double contrast, double brightness,
                       double saturation
    ) {
        this.planName = planName;
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeLocation = telescopeLocation;
        this.setFileType(fileType);
        this.setFileQuality(fileQuality);
        this.setColorType(colorType);
        this.setContrast(contrast);
        this.setBrightness(brightness);
        this.setSaturation(saturation);
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public double getFundingInUSD() {
        return fundingInUSD;
    }

    public void setFundingInUSD(double fundingInUSD) {
        this.fundingInUSD = fundingInUSD;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public Target.TARGET getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(Target.TARGET starSystem) {
        this.starSystem = starSystem;
    }

    public String getStartDate() {
        return startDate.toString();
    }

    public void setStartDate(String startDate) {
        try {
            this.startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getEndDate() {
        return endDate.toString();
    }

    public void setEndDate(String endDate) {
        try {
            this.endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public BaseSciencePlan.TELESCOPELOC getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(BaseSciencePlan.TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }


    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BaseSciencePlan.STATUS getStatus() {
        return status;
    }

    public void setStatus(BaseSciencePlan.STATUS status) {
        this.status = status;
    }

    public DataProcRequirement.TYPE getFileType() {
        return fileType;
    }

    public void setFileType(DataProcRequirement.TYPE fileType) {
        this.fileType = fileType;
    }

    public double getFileQuality() {
        return fileQuality;
    }

    public void setFileQuality(double fileQuality) {
        this.fileQuality = fileQuality;
    }

    public DataProcRequirement.COLOR_TYPE getColorType() {
        return colorType;
    }

    public void setColorType(DataProcRequirement.COLOR_TYPE colorType) {
        this.colorType = colorType;
    }

    public double getContrast() {
        return contrast;
    }

    public void setContrast(double contrast) {
        this.contrast = contrast;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }


    //    @GeneratedValue(generator="system-uuid")
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
//    private String req;
//    private String creator;
//    private String submitter;


//    @Override
//    public String getCreator() {
//        return creator;
//    }
//
//    @Override
//    public void setCreator(String creator) {
//        this.creator = creator;
//    }
//
//    @Override
//    public String getSubmitter() {
//        return submitter;
//    }
//
//    @Override
//    public void setSubmitter(String submitter) {
//        this.submitter = submitter;
//    }

//    public String getReq() {
//        return req;
//    }
//
//    public void setReq(String req) {
//        this.req = req;
//    }


//    public String getId() {
//        return Id;
//    }
//
//    public void setId(String id) {
//        Id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }


}
