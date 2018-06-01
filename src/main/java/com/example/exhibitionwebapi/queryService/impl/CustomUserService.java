package com.example.exhibitionwebapi.queryService.impl;

import com.example.exhibitionwebapi.dao.entity.SysUser;
import com.example.exhibitionwebapi.dao.jpa.SysUserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 系统管理员服务
 * @author xiaozhen
 * @date 2018-5-16
 */
public class CustomUserService implements UserDetailsService {

    @Autowired
    private SysUserJpa sysUserJpa;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserJpa.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}
