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

    @Resource
    private QsTaskQueueDao qsTaskQueueDao;

    @Resource
    private  QsAnswerDao qsAnswerDao;

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

    @Override
    public void execute2() throws SQLException {
        QsAnswerPO qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("1");
        qsAnswerPO.setUniqueKey("1");
        qsAnswerPO.setDeleteFlag(0);
        qsAnswerPO.setCreateDate(LocalDateTime.now());
        qsAnswerPO.setUpdateDate(LocalDateTime.now());
        qsAnswerDao.insert(qsAnswerPO);
        if (true){
            throw new SQLException("执行错误");
        }
        execute22();
    }

    private void execute22() throws SQLException {
        QsTaskQueuePO qsTaskQueuePO = new QsTaskQueuePO();
        qsTaskQueuePO.setTaskId(0L);
        qsTaskQueuePO.setPatientId(0L);
        qsTaskQueuePO.setQuestionId(0L);
        qsTaskQueuePO.setQuestionVersionId(0L);
        qsTaskQueuePO.setAgentId(0L);
        qsTaskQueuePO.setAutoSend(0);
        qsTaskQueuePO.setIsFinished(0);
        qsTaskQueuePO.setCreateDate(LocalDateTime.now());
        qsTaskQueuePO.setUpdateDate(LocalDateTime.now());
        qsTaskQueueDao.insert(qsTaskQueuePO);



        qsTaskQueuePO = new QsTaskQueuePO();
        qsTaskQueuePO.setTaskId(0L);
        qsTaskQueuePO.setPatientId(0L);
        qsTaskQueuePO.setQuestionId(0L);
        qsTaskQueuePO.setQuestionVersionId(0L);
        qsTaskQueuePO.setAgentId(0L);
        qsTaskQueuePO.setAutoSend(0);
        qsTaskQueuePO.setIsFinished(0);
        qsTaskQueuePO.setCreateDate(LocalDateTime.now());
        qsTaskQueuePO.setUpdateDate(LocalDateTime.now());
        qsTaskQueueDao.insert(qsTaskQueuePO);
    }


}
