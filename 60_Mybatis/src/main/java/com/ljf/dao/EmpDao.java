package com.ljf.dao;

import com.ljf.bean.Emp;

import java.util.List;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-03-16 16:28
 * @description:
 **/
public interface EmpDao {

    List<Emp> getList();

    List<Emp> getListById(int id);

    int insertList(Emp emp);

    int updateList(Emp emp);

    int deleteList(Emp emp);

    int insertListByMap(Map<String, Object> map);
}
