package com.cheems.codeshowcommunitybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cheems.codeshowcommunitybackend.mapper")
@SpringBootApplication
public class CodeshowcommunityBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeshowcommunityBackendApplication.class, args);
    }

}
