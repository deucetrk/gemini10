package rc.bootsecurity.controller;

import edu.gemini.app.ocs.model.BaseSciencePlan;
import edu.gemini.app.ocs.model.DataProcRequirement;
import jparsec.ephem.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.db.SciencePlanRepository;
import rc.bootsecurity.model.SciencePlan;


@Controller
@RequestMapping("/sciencePlan")
public class SciencePlanController {

//    @Autowired
//    private SciencePlanRepository sciencePlanRepository;
//
//    @GetMapping("/add") // Map ONLY POST Requests
//    public @ResponseBody
//    String addNewUser (@RequestParam String description){
//        SciencePlan sp = new SciencePlan();
//        sp.setDescription(description);
//        sciencePlanRepository.save(sp);
//        return "Saved";
//    }

//    @GetMapping("/all")
//    public @ResponseBody Iterable<SciencePlan findAllSciencePlan(){
//        // This returns a JSON or XML with the users
//        return userRepository.findAll();
//    }


    @GetMapping("testSci")
    public @ResponseBody String testSci(){return "Test access to scienceplan end point";}

    @Autowired
    private SciencePlanRepository sciencePlanRepository;

    @PostMapping("create") // Map ONLY POST Requests
    public @ResponseBody
    String addSciencePlan (@RequestParam String planName,
                           @RequestParam String creator,
                           @RequestParam String submitter,
                           @RequestParam double fundingInUSD,
                           @RequestParam String objectives,
                           @RequestParam String startDate,
                           @RequestParam String endDate,
                           @RequestParam double fileQuality,
                           @RequestParam double contrast,
                           @RequestParam double brightness,
                           @RequestParam double saturation,
                           @RequestParam Integer teleLoc,
                           @RequestParam Integer fileType,
                           @RequestParam Integer colorType,
                           @RequestParam Integer starSystem
                           ){
        SciencePlan sp = new SciencePlan();
        sp.setPlanName(planName);
        sp.setCreator(creator);
        sp.setSubmitter(submitter);
        sp.setFundingInUSD(fundingInUSD);
        sp.setObjectives(objectives);
        sp.setStartDate(startDate);
        sp.setEndDate(endDate);
        sp.setFileQuality(fileQuality);
        sp.setContrast(contrast);
        sp.setBrightness(brightness);
        sp.setSaturation(saturation);
        switch(teleLoc){
            case 1: sp.setTelescopeLocation(BaseSciencePlan.TELESCOPELOC.HAWAII); break;
            case 2: sp.setTelescopeLocation(BaseSciencePlan.TELESCOPELOC.CHILE); break;
            default: break;
        }
        switch(fileType){
            case 1: sp.setFileType(DataProcRequirement.TYPE.RAW); break;
            case 2: sp.setFileType(DataProcRequirement.TYPE.PNG); break;
            case 3: sp.setFileType(DataProcRequirement.TYPE.JPEG); break;
            case 4: sp.setFileType(DataProcRequirement.TYPE.TIFF); break;
            default: break;
        }
        switch(colorType){
            case 1: sp.setColorType(DataProcRequirement.COLOR_TYPE.BW); break;
            case 2: sp.setColorType(DataProcRequirement.COLOR_TYPE.COLOR); break;
            default: break;
        }
        switch(starSystem){
            case 1: sp.setStarSystem(Target.TARGET.Dione);break;
            case 2: sp.setStarSystem(Target.TARGET.Atlas);break;
            case 3: sp.setStarSystem(Target.TARGET.Janus);break;
            case 4: sp.setStarSystem(Target.TARGET.Ananke);break;
            default: break;
        }

        sciencePlanRepository.save(sp);
        return "Create SciencePlan Successfully";
    }




    }
