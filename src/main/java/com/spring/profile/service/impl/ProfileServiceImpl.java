package com.spring.profile.service.impl;

import com.spring.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author byzuse
 * datetime: 2021/4/1 22:52
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    /**
     * 通过value注解可以获取到spring配置文件中的变量
     */
    @Value("${my.test.str}")
    private String myTestStr;

    @Override
    public String getProfile() {
        return myTestStr;
    }
}
