package rc.bootsecurity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import rc.bootsecurity.db.SciencePlanRepository;
import rc.bootsecurity.model.SciencePlan;

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

    }
