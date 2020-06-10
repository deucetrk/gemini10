package rc.bootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("observingProgram")
public class observingController {

    @GetMapping("index")
    public String index(){
        return "observingProgram/index";
    }
}