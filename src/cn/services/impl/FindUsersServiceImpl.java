package cn.services.impl;

import cn.dao.FindUsersDao;
import cn.dao.impl.FindUsersDaoImpl;
import cn.pojo.Users;
import cn.services.FindUsersService;

import java.util.List;

public class FindUsersServiceImpl implements FindUsersService {
    FindUsersDao findUsersDao=new FindUsersDaoImpl();
    @Override
    public List<Users> findUsersService() {
        return findUsersDao.findUsersDao();
    }
}
