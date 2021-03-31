package com.dev.project.service.impl;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.dev.project.dao.QsAnswerDao;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
import com.dev.project.service.QsAnswerService;
import com.dev.project.service.QsTaskQueueService;
import com.dev.project.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: ljf
 * @create: 2021-03-30 10:48
 * @description:
 **/

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private QsAnswerService qsAnswerService;

    @Resource
    private QsTaskQueueService qsTaskQueueService;

    @Override
    public void execute1() throws SQLException {
        qsAnswerService.insertQsAnswer();
        execute11();
        if (true) {
            throw new RuntimeException("执行错误");
        }
    }

    private void execute11() throws SQLException {
        qsTaskQueueService.insertQsTaskQueue();

        qsTaskQueueService.insertQsTaskQueue();
    }


}
