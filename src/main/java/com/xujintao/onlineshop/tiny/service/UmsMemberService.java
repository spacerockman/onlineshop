package com.xujintao.onlineshop.tiny.service;

import com.xujintao.onlineshop.tiny.common.CommonResult;

/**
 * @Author Jintao Xu
 * @Description:会员管理用
 * @Date 2021/06/18 15:06
 * @Version:1.0
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
