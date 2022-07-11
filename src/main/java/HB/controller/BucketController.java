package HB.controller;

import HB.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BucketController {


    @Autowired
    private OrderService orderService;


    @GetMapping("/order")
    public ModelAndView get(){
       return new ModelAndView();
    }



}
