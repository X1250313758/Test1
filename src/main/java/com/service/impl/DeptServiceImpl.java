package com.service.impl;

import com.dao.impl.DeptDaoImpl;
import com.entity.Dept;
import com.service.DeptService;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    DeptDaoImpl deptDao=new DeptDaoImpl();
    @Override
    public List<Dept> findAll(Dept entity) throws Exception {
        return deptDao.findAll(entity);
    }
}
