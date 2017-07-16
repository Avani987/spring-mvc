package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/")
public class StudentController extends MultiActionController {

    @RequestMapping("/jsp")
    protected ModelAndView actionforJspView(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("welcomeMessage","Hello from index.jsp");
        return modelAndView;
    }

    @RequestMapping("/httpresponse")
    protected void actionforHttpResponse(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("text/html");
        response.getWriter().print("Hello from HttpResponse Object");
    }

}

