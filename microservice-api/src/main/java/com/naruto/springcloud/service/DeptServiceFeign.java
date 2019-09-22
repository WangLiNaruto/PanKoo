package com.naruto.springcloud.service;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.config.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient("MICROSERVICEDEPTPROVIDER")
@FeignClient(value = "MICROSERVICEDEPTPROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptServiceFeign {

    @RequestMapping(value = "/add")
    public boolean add(Dept department);

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") int id);


    @RequestMapping(value = "/getList")
    public List<Dept> getList();
}
