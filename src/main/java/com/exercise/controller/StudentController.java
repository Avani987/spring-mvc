package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class StudentController {

    @RequestMapping("/{firstName}/{lastName}")
    public ModelAndView method(@PathVariable("firstName") String fn, @PathVariable("lastName") String ln){

        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("msg","Hello "+fn+" "+ln);
        return modelAndView;
    }

}

