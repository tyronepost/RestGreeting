package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tyronepost on 2/5/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
