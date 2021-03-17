package com.ljf.dao;

import com.ljf.bean.Emp;
import com.ljf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-03-16 16:48
 * @description:
 **/
public class EmpDaoTest {

    /**
     * 查询所有记录
     */
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        List<Emp> list = empDao.getList();
        for (Emp emp : list) {
            System.out.println(emp);
        }
        sqlSession.close();
    }

    /**
     * 查询指定记录
     */
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        List<Emp> list = empDao.getListById(1);
        for (Emp emp : list) {
            System.out.println(emp);
        }
        sqlSession.close();
    }


    /**
     * 插入记录
     */
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setId(12);
        emp.setName("李四");
        emp.setAge(100);
        emp.setDeptId(1);
        emp.setEmpNo(100010);
        int s = empDao.insertList(emp);
        System.out.println(s);
        sqlSession.commit();

        sqlSession.close();
    }

    /**
     * 更新记录
     */
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setId(12);
        emp.setName("李四改");
        emp.setAge(100);
        emp.setDeptId(1);
        emp.setEmpNo(111111);
        int s = empDao.updateList(emp);
        System.out.println(s);
        sqlSession.commit();
        sqlSession.close();
    }


    /**
     * 删除记录
     */
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setId(12);
        emp.setName("张三");
        int s = empDao.deleteList(emp);
        System.out.println(s);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 不用创建对象,用map参数来传递
     */

    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",14);
        map.put("name","测试map插入");
        map.put("empnoss","11000");
        int s = empDao.insertListByMap(map);
        System.out.println(s);
        sqlSession.commit();
        sqlSession.close();
    }







}
