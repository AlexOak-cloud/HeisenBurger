package HB.controller;


import HB.service.BurgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @GetMapping("/menu")
    public ModelAndView menu(){
        ModelAndView mav = new ModelAndView("menu.html");
        mav.addObject("burgers", burgerService.getAll());
        return mav;
    }
}
