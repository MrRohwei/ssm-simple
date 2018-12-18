package com.looveh.resp;

import com.looveh.constants.ResponseMessageEnum;

/**
 * @Author Looveh
 * @Date 2018/11/8/008 10:32
 * @Version 1.0
 * @Desc TODO
 **/
public class BaseResp {

    private String code = ResponseMessageEnum.SUCCESS.getCode();
    private String message =  ResponseMessageEnum.SUCCESS.getMessage();
    private boolean success = true;
    private Object data;

    public BaseResp(){}

    public BaseResp(String code,String message,boolean success){
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public BaseResp(Object data){
        this.data = data;
    }

    public static BaseResp succ(){
        return succ(null);
    }

    public static BaseResp succ(Object data){
        BaseResp resp = new BaseResp();
        resp.setCode(ResponseMessageEnum.SUCCESS.getCode());
        resp.setMessage(ResponseMessageEnum.SUCCESS.getMessage());
        resp.setSuccess(true);
        resp.setData(data);
        return resp;
    }

    /**
     * 系统异常失败
     * @return
     */
    public static BaseResp fail() {
        BaseResp resp = new BaseResp();
        resp.setCode(ResponseMessageEnum.SYSTEM_ERROR.getCode());
        resp.setMessage(ResponseMessageEnum.SYSTEM_ERROR.getMessage());
        resp.setSuccess(false);
        return resp;
    }

    public static BaseResp fail(String message) {
        BaseResp resp = new BaseResp();
        resp.setCode(ResponseMessageEnum.SYSTEM_ERROR.getCode());
        resp.setMessage(message);
        resp.setSuccess(false);
        return resp;
    }

    /**
     * 自定义失败
     * @param messageEnum
     * @return
     */
    public static BaseResp fail(ResponseMessageEnum messageEnum){
        BaseResp resp = new BaseResp();
        resp.setCode(messageEnum.getCode());
        resp.setMessage(messageEnum.getMessage());
        resp.setSuccess(false);
        return resp;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
