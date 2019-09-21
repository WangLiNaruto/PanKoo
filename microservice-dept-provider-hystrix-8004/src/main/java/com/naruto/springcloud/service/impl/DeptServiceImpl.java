package com.naruto.springcloud.service.impl;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.mapper.DeptMapper;
import com.naruto.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getList() {
        return deptMapper.getList();
    }

    @Override
    public Dept get(int id) {
        return deptMapper.get(id);
    }

    @Override
    public void add(Dept dept) {
        deptMapper.add(dept);
    }
}
