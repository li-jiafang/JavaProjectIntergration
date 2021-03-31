package com.dev.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.project.domain.QsTaskQueuePO;

import java.sql.SQLException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljf
 * @since 2021-03-25
 */
public interface QsTaskQueueService extends IService<QsTaskQueuePO> {

    void insertQsTaskQueue() throws SQLException;

}
