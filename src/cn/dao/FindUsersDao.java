package cn.dao;

import cn.pojo.Users;

import java.util.List;

public interface FindUsersDao {
    List<Users> findUsersDao();
    Users findUserNo(String userNo);
    
}
