package com.dao.impl;

import com.dao.Deptdao;
import com.entity.Dept;
import com.util.BaseDaoImpl;

import java.util.List;

public class DeptDaoImpl extends BaseDaoImpl<Dept> implements Deptdao {
    @Override
    public List<Dept> findAll(Dept entity) throws Exception {
        startTx();
        String sql="select * from dept";
        List<Dept> list=null;
        try {
            list=session.createSQLQuery(sql).addEntity(Dept.class).list();
            if (list.size()>0) {
                commit();
            } else {
                rollback();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return list;
    }
}
