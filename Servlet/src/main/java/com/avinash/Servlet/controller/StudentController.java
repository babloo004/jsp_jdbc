package com.avinash.Servlet.controller;

import com.avinash.Servlet.dto.Repo;
import com.avinash.Servlet.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class StudentController {

    //Repository
    @Autowired
    Repo repo;

    @RequestMapping("/get")
    public ModelAndView getData(@RequestParam int sid, ModelAndView mv) throws SQLException, ClassNotFoundException {
        Student  student = repo.getData(sid);
        mv.addObject("student",student);
        mv.setViewName("index");
        return  mv;
    }

    @RequestMapping("/submit")
    public ModelAndView addData(@ModelAttribute Student student, ModelAndView mv) throws SQLException, ClassNotFoundException {
        String status = repo.addData(student);
        mv.addObject("status",status);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView add(ModelAndView mv){
        mv.setViewName("submit");
        return mv;
    }

    @RequestMapping("/")
    public ModelAndView home(ModelAndView mv){
        mv.setViewName("home");
        return mv;
    }
}
