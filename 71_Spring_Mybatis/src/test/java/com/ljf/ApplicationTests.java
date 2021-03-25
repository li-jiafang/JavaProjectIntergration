package com.ljf;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsTaskQueuePO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {



    @Autowired
    private QsTaskQueueDao qsTaskQueueDao;


    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",1L);
        List<QsTaskQueuePO> qsTaskQueuePOS = qsTaskQueueDao.selectList(queryWrapper);
        System.out.println(qsTaskQueuePOS);

    }

}
