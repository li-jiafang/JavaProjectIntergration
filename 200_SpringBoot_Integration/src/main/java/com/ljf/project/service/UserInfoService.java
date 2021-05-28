package com.ljf.project.service;

import com.ljf.project.domain.UserInfoDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljf
 * @since 2021-05-28
 */
public interface UserInfoService extends IService<UserInfoDO> {

    /**
     * 获取用户信息
     * @return
     */
    UserInfoDO getUserInfo();
}
