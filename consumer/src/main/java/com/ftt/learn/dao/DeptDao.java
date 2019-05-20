//package com.ftt.learn.dao;
//
//import com.ftt.learn.pojo.Dept;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Repository
//public class DeptDao {
//
//    @Autowired
//    private RestTemplate restTemplate = null;
//    //远程主类
//    private String url = "http://localhost:9090/my";
//
//    /** 远程调用查一功能 */
//    public Dept findone(int id){
//        return restTemplate.getForObject(url + "/findone/"+id,Dept.class);
//    }
//
//    /** 远程调用查所有功能 */
//    public List<Dept> showall(){
//        return restTemplate.getForObject(url + "/showall",List.class);
//    }
//}