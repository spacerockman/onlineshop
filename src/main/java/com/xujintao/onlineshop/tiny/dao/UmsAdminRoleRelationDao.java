package com.xujintao.onlineshop.tiny.dao;

import com.xujintao.onlineshop.tiny.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Jintao Xu
 * @Description:
 * @Date 2021/06/23 16:35
 * @Version:1.0
 */
@Component
@Mapper
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
