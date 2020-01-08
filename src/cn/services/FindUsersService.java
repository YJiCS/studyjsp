package cn.services;

import cn.pojo.Users;

import java.util.List;


public interface FindUsersService {
    List<Users> findUsersService();
    Users findUserNo(String userNo);
}
