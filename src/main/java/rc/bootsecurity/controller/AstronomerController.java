package rc.bootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("astronomer")
public class AstronomerController {

    @GetMapping("index")
    public String index(){
        return "astronomer/index";
    }

    @GetMapping("create")
    public String create(){
        return "astronomer/create";
    }

    @GetMapping("submit")
    public String submit(){
        return "astronomer/submit";
    }

    @GetMapping("test")
    public String test() { return "astronomer/test"; }

}
