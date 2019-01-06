package com.service;

import com.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll(Dept entity) throws Exception;
}
