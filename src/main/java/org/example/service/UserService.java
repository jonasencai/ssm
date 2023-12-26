package org.example.service;

import org.example.pojo.User;
import org.example.pojo.dto.UserFront;
import java.util.ArrayList;

public interface UserService {
    User loginC(String account, String password);
}
