package com.ftt.learn.service;

import com.ftt.learn.mapper.DeptMapper;
import com.ftt.learn.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DeptMapper dm;
    public List<Dept> showall(){
        return dm.showall();
    }
}
