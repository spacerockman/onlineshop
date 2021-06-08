package com.xujintao.onlineshop.tiny.common;

/**
 * @Author Jintao Xu
 * @Description:封装API的错误码
 * @Date 2021/06/08 18:19
 * @Version:1.0
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
