package com.dao;

import com.entity.Dept;

import java.util.List;

public interface Deptdao {
    List<Dept> findAll(Dept entity) throws Exception;
}
