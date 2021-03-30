package com.dev.project.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljf
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qs_task_queue")
public class QsTaskQueuePO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 任务id
     */
    private Long taskId;

    /**
     * 患者id
     */
    private Long patientId;

    /**
     * 问卷id
     */
    private Long questionId;

    /**
     * 问卷版本id
     */
    private Long questionVersionId;

    /**
     * 代理人id sso_user_id
     */
    private Long agentId;

    /**
     * 是否自动发送,默认为0
     */
    private Integer autoSend;

    /**
     * 问卷是否完成
     */
    private Integer isFinished;

    private Integer deleteFlag;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;


}
