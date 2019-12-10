package cn.services.impl;

import cn.dao.DeleteUsersDao;
import cn.dao.impl.DeleteUsersDaoImpl;
import cn.services.DeleteUsersService;

public class DeleteUsersServiceImpl implements DeleteUsersService {
    DeleteUsersDao deleteUsersDao =new DeleteUsersDaoImpl();
    @Override
    public boolean deleteUsersService(int userNo) {
        return deleteUsersDao.deleteUsersDao(userNo);
    }
}
