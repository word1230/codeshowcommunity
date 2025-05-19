package com.cheems.codeshowcommunitybackend.controller;

import com.cheems.codeshowcommunitybackend.common.BaseResponse;
import com.cheems.codeshowcommunitybackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {


    @GetMapping("/health")
    public BaseResponse<String> health(){
        return ResultUtils.success("成功");
    }

}
