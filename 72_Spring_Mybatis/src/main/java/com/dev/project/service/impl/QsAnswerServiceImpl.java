package com.dev.project.service.impl;
import java.time.LocalDateTime;


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
    private  QsAnswerDao qsAnswerDao;


    @Override
    public void insertQsAnswer() {
        QsAnswerPO qsAnswerPO = new QsAnswerPO();
        qsAnswerPO.setTaskQueueId(0L);
        qsAnswerPO.setContent("1");
        qsAnswerPO.setUniqueKey("1");
        qsAnswerPO.setDeleteFlag(0);
        qsAnswerPO.setCreateDate(LocalDateTime.now());
        qsAnswerPO.setUpdateDate(LocalDateTime.now());
        qsAnswerDao.insert(qsAnswerPO);
    }

}
