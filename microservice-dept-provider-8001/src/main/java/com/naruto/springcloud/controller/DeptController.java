package com.naruto.springcloud.controller;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/queryAllDept")
    public List<Dept> queryAllDept(){
        return deptService.queryAllDept();
    }

    @RequestMapping("/queryDept/{id}")
    public Dept queryDept(@PathVariable("id") int id){
        return deptService.queryDept(id);
    }

    @RequestMapping("/saveDept")
    public void saveDept(Dept dept){
         deptService.saveDept(dept);
    }

}
