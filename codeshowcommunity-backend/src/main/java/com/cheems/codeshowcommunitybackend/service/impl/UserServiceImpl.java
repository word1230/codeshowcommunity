package com.cheems.codeshowcommunitybackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheems.codeshowcommunitybackend.domain.User;
import com.cheems.codeshowcommunitybackend.mapper.UserMapper;
import com.cheems.codeshowcommunitybackend.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author cheems
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-05-19 09:41:52
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




