package com.naruto.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

@RestController
public class DeptConsumerController {

    private static final String RIBBON_MICRO_SERVICE_PEPT_URL="MICROSERVICEDEPTPROVIDER";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/saveDept")
    public boolean add(Dept department){
        return restTemplate.postForObject(RIBBON_MICRO_SERVICE_PEPT_URL+"/saveDept",department,Boolean.class);
    }

    @RequestMapping(value = "/queryDept/{id}")
    public Dept get(@PathVariable("id") int id){
        return restTemplate.getForObject(RIBBON_MICRO_SERVICE_PEPT_URL+"/queryDept/"+id,Dept.class);
    }

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/queryAllDept")
    public List<Dept> get(){
        return restTemplate.getForObject(RIBBON_MICRO_SERVICE_PEPT_URL+"/queryAllDept", List.class);
    }
	
}
