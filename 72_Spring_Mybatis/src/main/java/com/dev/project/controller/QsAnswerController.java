package com.dev.project.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.project.controller.vo.QsAnswerVO;
import com.dev.project.domain.QsAnswerPO;
import com.dev.project.service.QsAnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljf
 * @since 2021-03-30
 */
@RestController
@RequestMapping("/project/qs-answer-po")
public class QsAnswerController {

    @Resource
    private QsAnswerService qsAnswerService;

    @GetMapping("/getPage")
    @ResponseBody
    public void test(){
        Page<QsAnswerVO> byPage = qsAnswerService.findByPage();
        System.out.println(byPage);
    }

}
