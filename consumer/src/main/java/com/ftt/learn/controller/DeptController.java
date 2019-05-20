package com.ftt.learn.controller;

import com.ftt.learn.dao.DeptMapper;
import com.ftt.learn.pojo.Dept;
//import com.ftt.learn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/calldept")
public class DeptController {
//    @Autowired
//    DeptService deptService;
//
//    @GetMapping("/showall")
//    public List<Dept> showall(){
//        return deptService.showall();
//    }
//
//    //@RequestParam 前面说过，表示用request.getParameter("ids")  前台传递时采用 ?
//    @GetMapping("/findone")
//    public List<Dept> findAll(@RequestParam("ids") List<Integer> ids){
//        return deptService.findmany(ids);
//    }

    @Autowired
    DeptMapper dm;
    @GetMapping("/showall")
       public List<Dept> showall(){
        return dm.showall();
    }


}
