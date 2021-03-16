package com.ljf.dao;

import com.ljf.bean.Emp;
import com.ljf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: ljf
 * @create: 2021-03-16 16:48
 * @description:
 **/
public class EmpDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        List<Emp> list = empDao.getList();
        for (Emp emp : list) {
            System.out.println(emp);
        }

        sqlSession.close();


    }
}
