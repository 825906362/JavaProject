package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    // 自定义查询（MyBatis注解方式）
    @Select("SELECT class_name FROM user WHERE username = #{username}")
    String selectClassNameByUsername(String username);

    @Select("SELECT COUNT(*) FROM user WHERE username = #{username}")
    int selectCountByUsername(String username); // 验证用户名唯一性

}