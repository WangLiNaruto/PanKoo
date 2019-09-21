package com.naruto.springcloud.controller;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.service.DeptServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerFeignController {

    @Autowired
    private DeptServiceFeign deptServiceFeign;

    @RequestMapping(value = "/add")
    public boolean add(Dept department){
        return this.deptServiceFeign.add(department);
    }

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") int id){
        return this.deptServiceFeign.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/getList")
    public List<Dept> getList(){
        return this.deptServiceFeign.getList();
    }






}
