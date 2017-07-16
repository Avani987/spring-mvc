package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/index")
public class StudentController {

   /* @RequestMapping("/index")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    */
    @ResponseBody
    @RequestMapping("/hello")
    String Hello()
    {
        return "Hello world";
    }

    @RequestMapping("/hellomodel")
    ModelAndView helloModel(){
        ModelAndView model= new ModelAndView("index");
        model.addObject("msg","hello World");
        return model;
    }
}

