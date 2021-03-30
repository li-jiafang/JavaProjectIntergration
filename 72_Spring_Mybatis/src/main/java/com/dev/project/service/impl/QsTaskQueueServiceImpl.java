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
    private QsAnswerDao qsAnswerDao;

    @Override
    public void insertB() {
        QsAnswerPO qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("1");
        qsAnswerPO.setUniqueKey("1");
        qsAnswerPO.setCreateDate(LocalDateTime.now());
        qsAnswerPO.setUpdateDate(LocalDateTime.now());
        qsAnswerDao.insert(qsAnswerPO);


        qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("2");
        qsAnswerPO.setUniqueKey("2");
        qsAnswerPO.setCreateDate(LocalDateTime.now());
        qsAnswerPO.setUpdateDate(LocalDateTime.now());
        qsAnswerDao.insert(qsAnswerPO);

    }
}
