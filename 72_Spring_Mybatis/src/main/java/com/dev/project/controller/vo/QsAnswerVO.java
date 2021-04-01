package com.dev.project.controller.vo;

import lombok.Data;

/**
 * @author: ljf
 * @create: 2021-04-01 18:07
 * @description:
 **/

@Data
public class QsAnswerVO {
    private Long id;
    private Long taskQueueId;
    private String content="";
    private String uniqueKey;
    private String test;
    private Long questionId;
}
