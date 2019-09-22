package com.naruto.springcloud.config;

import com.naruto.springcloud.bean.Dept;
import com.naruto.springcloud.service.DeptServiceFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务降级
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptServiceFeign> {
    @Override
    public DeptServiceFeign create(Throwable throwable) {
        return new DeptServiceFeign() {
                @Override
                public boolean add(Dept department) {
                    return false;
                }

            @Override
            public Dept get(int id) {
                Dept dept=new Dept();
                dept.setId(id);
                dept.setDeptName("没有对应的信息,null -- @HystrixCommand--服务降级");
                dept.setDbSource("no data in mysql");
                return dept;
            }

            @Override
            public List<Dept> getList() {
                return null;
            }
        };
    }
}
