package com.kyee.chis.db_show.controller;


import com.kyee.chis.db_show.dao.entity.HisTables;
import com.kyee.chis.db_show.service.ShowTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/db")
public class DbShowController {

    @Autowired
    private ShowTableService showTableService;

    @RequestMapping("/hello")
    public ModelAndView getHello(){

        ModelAndView modelAndView = new ModelAndView("/hello");
        return modelAndView;
    }

    @RequestMapping("/getAllTables")
    public List<HisTables> getAllTables() {
        List<HisTables> hisTables = showTableService.getHisTables();

        return hisTables;
    }
}
