package com.xujintao.onlineshop.tiny.service.impl;

import com.xujintao.onlineshop.tiny.mbg.mapper.PmsBrandMapper;
import com.xujintao.onlineshop.tiny.mbg.model.PmsBrand;
import com.xujintao.onlineshop.tiny.mbg.model.PmsBrandExample;
import com.xujintao.onlineshop.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/07 14:44
 * @Version:1.0
 */

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return 0;
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> ListBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
