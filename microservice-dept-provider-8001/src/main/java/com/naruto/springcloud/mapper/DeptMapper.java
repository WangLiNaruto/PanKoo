package com.naruto.springcloud.mapper;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

public interface DeptMapper {

    List<Dept> queryAllDept();

    Dept queryDept(int id);

    void saveDept(Dept dept);
}
