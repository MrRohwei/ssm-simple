package com.looveh.constants;

public enum ResponseMessageEnum {

    SUCCESS("200","成功"),
    SYSTEM_ERROR("500","服务端异常"),

    EMAIL_HAS_BEAN_BIND("000001","此邮箱已被绑定"),
    PHONE_HAS_BEAN_BIND("000002","此手机号已被绑定"),
    REGISTER_FAIL("000003","注册失败"),

    NOT_EXIST_OR_DISABLED("100001","用户不存在或被禁用")
    ;

    private String code;
    private String message;

    private ResponseMessageEnum(String code,String message){
        this.code = code;
        this.message = message;
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
