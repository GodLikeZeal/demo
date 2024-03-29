package com.zeal.zealsay.gateway.service.impl;

import com.zeal.zealsay.common.vo.UserVo;
import com.zeal.zealsay.gateway.feign.UserService;
import com.zeal.zealsay.gateway.util.UserDetailsImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author lengleng
 * @date 2017/10/26
 * <p>
 */
@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailsService, Serializable {
    @Autowired
    private UserService userService;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isBlank(username)) {
            throw new UsernameNotFoundException("用户不存在:" + username);
        }
        UserVo userVo = userService.findUserByUsername(username);
        return new UserDetailsImpl(userVo);
    }
}
