package cn.services;

import cn.pojo.Users;

public interface LoginService {
    public Users findUsersService(String userNo,String userPwd);
}
