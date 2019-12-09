package cn.dao;

import cn.pojo.Users;

import java.sql.SQLException;

public interface LoginDao {
    public Users findUsersDao(String userNo,String userPwd);
}
