package cn.dao.impl;

import cn.dao.LoginDao;
import cn.pojo.Users;
import sun.misc.Request;

import java.sql.*;

public class LoginDaoImpl implements LoginDao {
    @Override
    public Users findUsersDao(String userNo,String userPwd){
        Users u=null;
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/web_study?serverTimezone=UTC","root","123456");
            String sql="select * from users where userNo=? and userPwd=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, userNo);
            pstmt.setString(2, userPwd);
            rs=pstmt.executeQuery();
            while (rs.next()){
                u=new Users();
                u.setUserNo(rs.getInt(1));
                u.setUserName(rs.getString(2));
                u.setUserPwd(rs.getString(3));
                u.setUserSex(rs.getInt(4));
                u.setUserAddress(rs.getString(5));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return u;
    }
}
