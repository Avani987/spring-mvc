package com.exercise.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends AbstractController{

    protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception{

        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("welcomeMessage","Hello from index.jsp");
        return modelAndView;
    }


}
