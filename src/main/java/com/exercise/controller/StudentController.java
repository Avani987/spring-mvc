package com.exercise.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView getForm(){
        ModelAndView model1=new ModelAndView("form");
        return model1;
    }

    @ModelAttribute
    public void addString(Model model){

        model.addAttribute("headerMessage","Spring Mvc Demo");

    }
    @RequestMapping(value="/student",method= RequestMethod.POST)
    public ModelAndView method(@ModelAttribute("student") Student student){

        ModelAndView model2=new ModelAndView("formView");
        return model2;
    }
}

