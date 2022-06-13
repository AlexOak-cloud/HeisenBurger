package HB.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PizzaController {


    @GetMapping("/pizza")
    public ModelAndView pizza(){
        return new ModelAndView("pizza.html");
    }

}
