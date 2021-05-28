package com.ljf.common.msg;

import lombok.Data;

/**
 * @author: ljf
 * @create: 2021/5/28 17:14
 * @description:
 **/
@Data
public class ReturnMsg<T> {
    private Integer code;
    private String msg;
    private T result;

    public ReturnMsg() {
        this.code = 200;
        this.msg = "";
        this.result = null;
    }

    public static <T> ReturnMsg success(T t) {
        ReturnMsg<T> rm = new ReturnMsg<T>();
        rm.setCode(200);
        rm.setMsg("处理成功");
        rm.setResult(t);
        return rm;
    }

    public static <T> ReturnMsg fail(Exception e) {
        ReturnMsg<T> rm = new ReturnMsg<T>();
        rm.setCode(500);
        rm.setMsg("错误信息:"+e.getMessage());
        rm.setResult(null);
        return rm;
    }

}
