package com.kyee.chis.db_show.controller;


import com.kyee.chis.db_show.dao.entity.HisTables;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/db")
public class DbShowController {

    @RequestMapping("/hello")
    public ModelAndView getHello(){

        ModelAndView modelAndView = new ModelAndView("/hello");
        return modelAndView;
    }
}
