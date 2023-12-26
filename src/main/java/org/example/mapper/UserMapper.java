package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;
import org.example.pojo.dto.UserFront;
import java.util.ArrayList;

public interface UserMapper {
    User loginC(@Param("account") String account, @Param("password") String password);
}