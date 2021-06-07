package com.xujintao.onlineshop.tiny.controller;

import com.xujintao.onlineshop.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/07 14:38
 * @Version:1.0
 */
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;


}
