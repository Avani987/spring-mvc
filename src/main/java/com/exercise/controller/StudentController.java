package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {


    @RequestMapping(value="/student",method= RequestMethod.POST)
    public ModelAndView method(@RequestParam("fname") String fn,@RequestParam("lname") String ln){

        ModelAndView modelAndView= new ModelAndView("formView");
        modelAndView.addObject("msg","Values recieved from the form are "+fn+" "+ln);
        return modelAndView;
    }
}

