package com.cheems.codeshowcommunitybackend;

import com.cheems.codeshowcommunitybackend.domain.User;
import com.cheems.codeshowcommunitybackend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CodeshowcommunityBackendApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User byId = userService.getById(1);
        System.out.println(byId);
    }

}
