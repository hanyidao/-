package com.ftt.learn.dao;

import com.ftt.learn.pojo.Dept;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("one")
public interface DeptMapper {
    @GetMapping("my/showall")
    List<Dept> showall();
}
