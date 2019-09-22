package com.naruto.springcloud.controller;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @RequestMapping("/getList")
    public List<Dept> getList(){
        return deptService.getList();
    }

    /**
     * 服务熔断：容易方法膨胀,耦合度太高
     * @param id
     * @return
     */
    @RequestMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept get(@PathVariable("id") int id){
        Dept dept=deptService.get(id);
        if(null == dept){
            throw new RuntimeException("该id:"+id +"没有对应的部门");
        }
        return dept;
    }

    public Dept processHystrix(@PathVariable("id") int id){
        Dept dept=new Dept();
        dept.setId(id);
        dept.setDeptName("没有对应的信息,null -- @HystrixCommand--服务熔断");
        dept.setDbSource("no data in mysql");
        return dept;
    }


    @RequestMapping("/add")
    public void add(Dept dept){
         deptService.add(dept);
    }

}
