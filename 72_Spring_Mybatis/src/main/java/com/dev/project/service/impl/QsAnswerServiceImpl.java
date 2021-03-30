package com.dev.project.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dev.project.dao.QsAnswerDao;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
import com.dev.project.service.QsAnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljf
 * @since 2021-03-30
 */
@Service
public class QsAnswerServiceImpl extends ServiceImpl<QsAnswerDao, QsAnswerPO> implements QsAnswerService {

    @Resource
    private QsTaskQueueDao qsTaskQueueDao;

    @Resource
    private  QsAnswerDao qsAnswerDao;

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
