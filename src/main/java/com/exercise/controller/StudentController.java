package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class StudentController {


    @RequestMapping("/{firstName}/{lastName}")
    @ResponseBody
    public String method(@PathVariable() Map<String,String> name){

        return "Hello "+name.get("firstName")+" "+name.get("lastName");
    }
}

