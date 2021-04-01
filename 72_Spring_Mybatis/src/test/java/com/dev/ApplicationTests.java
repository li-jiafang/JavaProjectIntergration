package com.dev;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dev.project.controller.vo.QsAnswerVO;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
import com.dev.project.service.QsAnswerService;
import com.dev.project.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

    @Resource
    private QsAnswerService qsAnswerService;

    @Resource
    private QsTaskQueueDao qsTaskQueueDao;

//    @Autowired
//    private QsAnswerService qsAnswerService;

    @Resource
    private TestService testService;


    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",1L);
        List<QsTaskQueuePO> qsTaskQueuePOS = qsTaskQueueDao.selectList(queryWrapper);
        System.out.println(qsTaskQueuePOS);

    }


    /**
     * 不同service层调用方法,出现异常回滚情况
     */
    @Test
    void testTransaction() {
        try {
            testService.execute1();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    /**
     * 在同一个service层,出现异常回滚情况
     */
    @Test
    void testTransaction1(){
        try {
            testService.execute2();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Test
    void testPage() {

        IPage<QsAnswerVO> byPage = qsAnswerService.findByPage();

        System.out.println(byPage.getRecords());

    }
}

