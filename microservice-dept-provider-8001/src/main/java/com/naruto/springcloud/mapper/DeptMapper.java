package com.naruto.springcloud.mapper;

import com.naruto.springcloud.bean.Dept;

import java.util.List;

public interface DeptMapper {

    List<Dept> getList();

    Dept get(int id);

    void add(Dept dept);
}
