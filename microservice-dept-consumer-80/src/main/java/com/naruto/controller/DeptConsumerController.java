package com.naruto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

/**
 * 服务消费者
 * @author naruto
 * @name ${FILE_NAME}
 * @create 2018-09-19 23:40
 */
@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/saveDept")
    public boolean add(Dept department){
        return restTemplate.postForObject(REST_URL_PREFIX+"/saveDept",department,Boolean.class);
    }

    @RequestMapping(value = "/queryDept/{id}")
    public Dept get(@PathVariable("id") int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryDept/"+id,Dept.class);
    }

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/queryAllDept")
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/queryAllDept", List.class);
    }
	
}
