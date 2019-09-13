package com.naruto.springcloud.service;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> queryAllDept();

    Dept queryDept(int id);

    void saveDept(Dept dept);
}
