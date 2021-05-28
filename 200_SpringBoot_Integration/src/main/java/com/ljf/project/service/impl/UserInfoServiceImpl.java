package com.ljf.project.service.impl;

import com.ljf.project.domain.UserInfoDO;
import com.ljf.project.dao.UserInfoDao;
import com.ljf.project.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljf
 * @since 2021-05-28
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfoDO> implements UserInfoService {

}
