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
    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }

    @Override
    public Dept queryDept(int id) {
        return deptMapper.queryDept(id);
    }

    @Override
    public void saveDept(Dept dept) {
        deptMapper.saveDept(dept);
    }
}
