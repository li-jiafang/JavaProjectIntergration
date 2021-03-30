package com.dev.project.service.impl;
import java.time.LocalDateTime;

import com.dev.project.dao.QsAnswerDao;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
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
    private QsTaskQueueDao qsTaskQueueDao;

    @Resource
    private QsTaskQueueService qsTaskQueueService;

    @Resource
    private TestService testService;


    @Override
    public void insertAAndB() {
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
        if (true){
            throw new RuntimeException();
        }

    }



    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void execute() {
        testService.insertAAndB();

        execute2();
    }


    public void execute2() {
        qsTaskQueueService.insertB();

    }
}
