package rc.bootsecurity.controller;

import edu.gemini.app.ocs.model.BaseObservingProgram;
import jparsec.ephem.Target;
import jparsec.observer.LocationElement;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.db.ObservingRepository;
import rc.bootsecurity.db.SciencePlanRepository;
import rc.bootsecurity.model.ObservingProgram;
import edu.gemini.app.ocs.model.*;
import edu.gemini.app.ocs.*;
import edu.gemini.app.ocs.OCS;
import rc.bootsecurity.model.SciencePlan;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/scienceObserver")
public class ScienceObserverController {

    @Autowired
    private ObservingRepository observingRepository;

    @Autowired
    private SciencePlanRepository sciencePlanRepository;

    @GetMapping("index")
    public String index(){
        return "scienceObserver/index";
    }

    @GetMapping("validate")
    public String validate(){
        return "scienceObserver/validate";
    }


    @GetMapping("create")
    public String createObserving(){return "scienceObserver/observing";}
    @PostMapping("observing")
    public
    String addObservingProgram(@RequestParam Integer sciId,
                               @RequestParam String lmake,
                               @RequestParam String lmodel,
                               @RequestParam String lmanufacturer,
                               @RequestParam String lyear,
                               @RequestParam String fmake,
                               @RequestParam String fmanufacturer,
                               @RequestParam String fmodel,
                               @RequestParam int fyear,
                               @RequestParam double fsize,
                               @RequestParam double fweight,
                               @RequestParam Double exposures1,
                               @RequestParam Integer isLightDetectorOn,
                               @RequestParam String equipmentName,
                               @RequestParam String ownerName,
                               @RequestParam Date installedDate ,
                               @RequestParam String notes
                               ){
        SciencePlan temp = sciencePlanRepository.findById(sciId).get();
        String[] date = temp.getStartDate().split("-");
        date[2] = date[2].substring(0,2);
        OCS ocs = new OCS();
        ObservingProgram o = new ObservingProgram();
        o.setLoc(ocs.getLocation(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]), temp.getStarSystem()));
        o.setLmake(lmake);
        o.setLmodel(lmodel);
        o.setLmanufacturer(lmanufacturer);
        o.setLyear(lyear);
        o.setFmake(fmake);
        o.setFmanufacturer(fmanufacturer);
        o.setFmodel(fmodel);
        o.setFyear(fyear);
        o.setFsize(fsize);
        o.setFweight(fweight);
        o.setExposures(exposures1);

        switch(isLightDetectorOn){
            case 1: o.setLightDetectorOn(true); break;
            case 0: o.setLightDetectorOn(false); break;
            default: break;
        }

        o.setEquipmentName(equipmentName);
        o.setOwnerName(ownerName);
        o.setInstalledDate(installedDate);
        o.setNotes(notes);
        observingRepository.save(o);
        return "scienceObserver/index";
    }

    @GetMapping("getprogram")
    public @ResponseBody
    Iterable<ObservingProgram> getAllObservingProgram() {
        return observingRepository.findAll();
    }

}




