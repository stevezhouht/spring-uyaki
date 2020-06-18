package com.uyaki.exception.common.enumeration;

import com.uyaki.exception.common.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务响应枚举
 *
 * @author uyaki
 * @date 2020 /06/06
 */
@Getter
@AllArgsConstructor
public enum BusinessErrorCodeEnum implements BusinessExceptionAssert {

    /**
     * 登录已过期
     */
    LAND_EXPIRATION(-5, "登录已过期，为保障账号安全，系统要求您重新登录!"),

    /**
     * 身份验证失败
     */
    UNAUTHORIZED(-6, "身份验证失败!"),

    /**
     * 签名错误
     */
    SIGNATURE_ERROR(-7, "签名错误!"),

    /**
     * 没有权限
     */
    HAVE_NOT_PERMISSION(-8, "对不起！您没有这权限！"),

    /**
     * 版本号有误
     */
    VERSION_ERROR(-9, "版本号有误！"),

    /**
     * 已存在的参数
     */
    EXISTING_PARAMETER(-10, "参数已存在"),

    /**
     * jwt无效！
     */
    JWT_INVALID(-11, "jwt无效！");
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回信息
     */
    private String message;
}
