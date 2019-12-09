package cn.services.impl;

import cn.dao.RegisterDao;
import cn.dao.impl.RegisterDaoimpl;
import cn.pojo.Users;
import cn.services.RegisterService;

public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean registerService(Users users) {
        RegisterDao registerDao =new RegisterDaoimpl();
        return registerDao.registerDao(users);
    }
}
