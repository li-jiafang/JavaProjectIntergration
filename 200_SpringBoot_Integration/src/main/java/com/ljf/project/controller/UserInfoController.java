package com.ljf.project.controller;


import com.ljf.project.domain.UserInfoDO;
import com.ljf.project.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljf
 * @since 2021-05-28
 */
@RestController
@RequestMapping("/project")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/get")
    @ResponseBody
    public UserInfoDO getUserInfoDO(){
        return userInfoService.getUserInfo();
    }


}
