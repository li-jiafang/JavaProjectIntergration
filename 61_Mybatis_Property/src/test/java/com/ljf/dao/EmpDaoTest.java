package com.ljf.dao;

import com.ljf.bean.Emp;
import com.ljf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: ljf
 * @create: 2021-03-17 13:45
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
}
