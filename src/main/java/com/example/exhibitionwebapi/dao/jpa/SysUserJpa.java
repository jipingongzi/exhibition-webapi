package com.example.exhibitionwebapi.dao.jpa;

import com.example.exhibitionwebapi.dao.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 系统管理员jpa
 * @author xiaozhen
 * @date 2018-5-16
 */
public interface SysUserJpa extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
