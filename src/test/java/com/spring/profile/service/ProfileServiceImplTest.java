package com.spring.profile.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author byzuse
 * datetime: 2021/4/1 22:52
 */
@SpringBootTest
public class ProfileServiceImplTest {

    @Autowired
    private ProfileService profileService;

    /**
     * 对于要测试的方法加上test注解
     */
    @Test
    public void getProfileTest() {
        String profile = profileService.getProfile();
        System.out.println("profile = " + profile);
    }


}