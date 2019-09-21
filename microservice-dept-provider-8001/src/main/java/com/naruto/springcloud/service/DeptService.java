package com.naruto.springcloud.service;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> getList();

    Dept get(int id);

    void add(Dept dept);
}
