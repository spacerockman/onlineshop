package com.xujintao.onlineshop.tiny.service;

import com.xujintao.onlineshop.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/07 14:39
 * @Version:1.0
 */

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    //List<PmsBrand> ListBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

    List<PmsBrand> listBrand(Integer pageNum, Integer pageSize);
}
