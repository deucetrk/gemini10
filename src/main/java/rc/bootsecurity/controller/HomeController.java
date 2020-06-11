package rc.bootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

//    @Autowired
//    private SciencePlanRepository sciencePlanRepository;
//
//    @GetMapping("create") // Map ONLY POST Requests
//    public @ResponseBody
//    String addSciencePlan (){
//        SciencePlan sp = new SciencePlan();
//        sp.setPlanNo(1);
//        sp.setPlanName("observe the Saturn");
//        sp.setCreator("Teerakarn Boriboonsub");
//
//        sciencePlanRepository.save(sp);
//        return "create SciencePlan successfully";
//    }
////    @RequestParam String description
}
