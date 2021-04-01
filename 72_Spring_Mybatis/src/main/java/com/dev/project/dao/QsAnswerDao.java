package com.dev.project.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.project.controller.vo.QsAnswerVO;
import com.dev.project.domain.QsAnswerPO;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljf
 * @since 2021-03-30
 */
public interface QsAnswerDao extends BaseMapper<QsAnswerPO> {

    Page<QsAnswerVO> getPage(Page<?> page);

}
