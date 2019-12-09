package cn.services.impl;

import cn.dao.LoginDao;
import cn.dao.impl.LoginDaoImpl;
import cn.pojo.Users;
import cn.services.LoginService;

public class LoginServiceImpl implements LoginService{
    LoginDao loginDao=new LoginDaoImpl();
    @Override
    public Users findUsersService(String userNo,String userPwd) {
        return loginDao.findUsersDao(userNo, userPwd);
    }
}
