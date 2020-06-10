package rc.bootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("scienceObserver")
public class ScienceObserverController {

    @GetMapping("index")
    public String index(){
        return "scienceObserver/index";
    }

    @GetMapping("validate")
    public String validate(){
        return "scienceObserver/validate";
    }

    @GetMapping("createObserving/select")
    public String selectObs(){
        return "scienceObserver/selectScienceplan";
    }

    @GetMapping("createObserving/create")
    public String createObs(){
        return "scienceObserver/observing";
    }


}




