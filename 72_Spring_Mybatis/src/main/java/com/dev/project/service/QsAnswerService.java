package com.dev.project.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dev.project.controller.vo.QsAnswerVO;
import com.dev.project.domain.QsAnswerPO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljf
 * @since 2021-03-30
 */
public interface QsAnswerService extends IService<QsAnswerPO> {


    Page<QsAnswerVO> findByPage();


    void insertQsAnswer();

}
