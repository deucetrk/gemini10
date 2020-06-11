package rc.bootsecurity.controller;

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
                           @RequestParam double saturation
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
        sciencePlanRepository.save(sp);
        return "Create SciencePlan successfully";
    }




    }
