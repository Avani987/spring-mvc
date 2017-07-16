package com.exercise.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @ResponseBody
    @RequestMapping(value="/student",method= RequestMethod.POST)
    public String method(Student student){

        return "Name is : "+student.getFname()+" "+student.getLname();

    }
}

