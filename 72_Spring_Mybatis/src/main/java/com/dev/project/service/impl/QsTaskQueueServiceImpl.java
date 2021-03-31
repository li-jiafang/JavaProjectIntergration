package com.dev.project.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dev.project.dao.QsAnswerDao;
import com.dev.project.dao.QsTaskQueueDao;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.domain.QsTaskQueuePO;
import com.dev.project.service.QsTaskQueueService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljf
 * @since 2021-03-25
 */
@Service
public class QsTaskQueueServiceImpl extends ServiceImpl<QsTaskQueueDao, QsTaskQueuePO> implements QsTaskQueueService {

    @Resource
    private QsTaskQueueDao qsTaskQueueDao;



    @Override
    public void insertQsTaskQueue() throws SQLException {
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

    }
}
