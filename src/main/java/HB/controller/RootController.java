package HB.controller;

import HB.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView("/view/main.html");
        mav.addObject("products", productService.getAll());
        return mav;
    }


}


