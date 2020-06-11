package rc.bootsecurity.controller;

import edu.gemini.app.ocs.model.BaseSciencePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rc.bootsecurity.db.SciencePlanRepository;
import rc.bootsecurity.model.SciencePlan;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @Autowired
    private SciencePlanRepository sciencePlanRepository;

    @GetMapping("create") // Map ONLY POST Requests
    public @ResponseBody
    String addSciencePlan (){
        SciencePlan sp = new SciencePlan();
        sp.setPlanNo(1);
        sp.setPlanName("observe the Saturn");
        sp.setCreator("Teerakarn Boriboonsub");

        sciencePlanRepository.save(sp);
        return "create SciencePlan successfully";
    }
//    @RequestParam String description
}
