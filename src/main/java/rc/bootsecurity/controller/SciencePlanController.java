package rc.bootsecurity.controller;

import ocs.model.BaseSciencePlan;
import ocs.model.DataProcRequirement;
import jparsec.ephem.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.db.SciencePlanRepository;
import rc.bootsecurity.model.SciencePlan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
    public
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
            case 1: sp.setStarSystem(Target.TARGET.MARS);break;
            case 2: sp.setStarSystem(Target.TARGET.NEPTUNE);break;
            case 3: sp.setStarSystem(Target.TARGET.URANUS);break;
            case 4: sp.setStarSystem(Target.TARGET.SATURN);break;
            default: break;
        }

        sciencePlanRepository.save(sp);
        return "astronomer/index";
    }

    @PutMapping("updateStatus")
    public @ResponseBody
    String updateSciencePlanStatus(@RequestParam int id, @RequestParam int status) {
        Optional<SciencePlan> newSc = sciencePlanRepository.findById(id);
        if(newSc.isPresent()) {
            SciencePlan sp = newSc.get();
            switch(status) {
                case 0: sp.setStatus(BaseSciencePlan.STATUS.COMPLETE); break;
                case 1: sp.setStatus(BaseSciencePlan.STATUS.RUNNING); break;
                case 2: sp.setStatus(BaseSciencePlan.STATUS.SUBMITTED); break;
                default: break;
            }
            sciencePlanRepository.save(sp);
        }
        return "Science Plan status is succesfully updated";
    }



    @PutMapping("update")
    public @ResponseBody
    String updateSciencePlan(@RequestParam int id,
                             @RequestParam String planName,
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
                             @RequestParam Integer starSystem) {
        Optional<SciencePlan> newSc = sciencePlanRepository.findById(id);
        if (newSc.isPresent()) {
            SciencePlan sp = newSc.get();
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
            switch (teleLoc) {
                case 1:
                    sp.setTelescopeLocation(BaseSciencePlan.TELESCOPELOC.HAWAII);
                    break;
                case 2:
                    sp.setTelescopeLocation(BaseSciencePlan.TELESCOPELOC.CHILE);
                    break;
                default:
                    break;
            }
            switch (fileType) {
                case 1:
                    sp.setFileType(DataProcRequirement.TYPE.RAW);
                    break;
                case 2:
                    sp.setFileType(DataProcRequirement.TYPE.PNG);
                    break;
                case 3:
                    sp.setFileType(DataProcRequirement.TYPE.JPEG);
                    break;
                case 4:
                    sp.setFileType(DataProcRequirement.TYPE.TIFF);
                    break;
                default:
                    break;
            }
            switch (colorType) {
                case 1:
                    sp.setColorType(DataProcRequirement.COLOR_TYPE.BW);
                    break;
                case 2:
                    sp.setColorType(DataProcRequirement.COLOR_TYPE.COLOR);
                    break;
                default:
                    break;
            }
            switch (starSystem) {
                case 1:
                    sp.setStarSystem(Target.TARGET.Dione);
                    break;
                case 2:
                    sp.setStarSystem(Target.TARGET.Atlas);
                    break;
                case 3:
                    sp.setStarSystem(Target.TARGET.Janus);
                    break;
                case 4:
                    sp.setStarSystem(Target.TARGET.Ananke);
                    break;
                default:
                    break;
            }

            sciencePlanRepository.save(sp);


        }

        return "updated";
    }

    @GetMapping("getplan")
    public @ResponseBody
    Iterable<SciencePlan> getAllSciencePlan() {
        return sciencePlanRepository.findAll();
    }

    @GetMapping("getplanByStatus")
    public @ResponseBody
    Iterable<SciencePlan> getSciencePlanByStatus(@RequestParam int status ){
        List<SciencePlan> sPlan = new ArrayList<>();
        BaseSciencePlan.STATUS temp;
        switch(status){
            case 0: temp = BaseSciencePlan.STATUS.COMPLETE;break;
            case 1: temp = BaseSciencePlan.STATUS.RUNNING;break;
            case 2: temp = BaseSciencePlan.STATUS.SUBMITTED;break;
            case 3: temp = null; break;
            default: temp = null;
        }

        for(SciencePlan sp : getAllSciencePlan()) {
            if (sp.getStatus() == temp) {
                sPlan.add(sp);
            }
        }
        return sPlan;
    }




//    @RequestMapping("selectScienceplan")
//    public String listSciencePlan(Model model){
//        model.addAttribute("selectScienceplan", sciencePlanRepository.listAllSciencePlan() );
//        return "scienceObserver/selectScienceplan" ;
//    }

    }
