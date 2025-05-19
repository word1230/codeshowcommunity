package com.cheems.codeshowcommunitybackend.mapper;

import com.cheems.codeshowcommunitybackend.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author cheems
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-05-19 09:41:52
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




