package com.xujintao.onlineshop.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/07 14:25
 * @Version:1.0
 */
@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
