package com.dev.project.service.impl;

import com.dev.project.dao.QsAnswerDao;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
import com.dev.project.service.TestService;
import org.springframework.stereotype.Service;

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
    private QsAnswerDao qsAnswerDao;

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
        qsTaskQueueDao.insert(qsTaskQueuePO);

        insertB();
    }

    private void insertB() {
        QsAnswerPO qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("1");
        qsAnswerPO.setUniqueKey("1");
        qsAnswerDao.insert(qsAnswerPO);
        if (true){
            throw new RuntimeException();
        }

        qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("2");
        qsAnswerPO.setUniqueKey("2");
        qsAnswerDao.insert(qsAnswerPO);


    }
}
