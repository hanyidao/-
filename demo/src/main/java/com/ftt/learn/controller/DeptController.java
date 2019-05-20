package com.ftt.learn.controller;

import com.ftt.learn.pojo.Dept;
import com.ftt.learn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/my")
public class DeptController {

    @Autowired
    DeptService ds;

    @GetMapping("/showall")
    public List<Dept> showll(){
        return ds.showall();
    }

    @RequestMapping("/abc")
    public String abc(){
        return "success";
    }
}
