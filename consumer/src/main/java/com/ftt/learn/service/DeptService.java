//package com.ftt.learn.service;
//
//import com.ftt.learn.dao.DeptDao;
//import com.ftt.learn.pojo.Dept;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//public class DeptService {
//    @Autowired
//    DeptDao deptDao;
//
//    /** 调用查一方法返回大量数据 */
//    public List<Dept> findmany(List<Integer> deptnos){
//        List<Dept> list = new ArrayList<>();
//        for (Integer id : deptnos){
//            Dept dept = deptDao.findone(id);
//            list.add(dept);
//        }
//        return list;
//    }
//
//    /**
//     * 查所有
//     * @return
//     */
//    public List<Dept> showall(){
//        return deptDao.showall();
//    }
//}
//
