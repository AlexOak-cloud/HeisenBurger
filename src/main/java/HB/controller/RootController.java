package HB.controller;

import HB.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

    @GetMapping("/")
    public ModelAndView root(){
        return new ModelAndView("root.html");
    }
}
