package cn.dao.impl;

import cn.dao.FindUsersDao;
import cn.pojo.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FindUsersDaoImpl implements FindUsersDao {
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    Users u=null;
    @Override
    public List<Users> findUsersDao() {
        List<Users> ls=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/web_study?serverTimezone=UTC","root","123456");
            String sql="select * from users";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                u=new Users();
                u.setUserNo(rs.getInt(1));
                u.setUserName(rs.getString(2));
                u.setUserPwd(rs.getString(3));
                u.setUserSex(rs.getInt(4));
                u.setUserAddress(rs.getString(5));
                ls.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ls;
    }

    @Override
    public Users findUserNo(String userNo) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/web_study?serverTimezone=UTC","root","123456");
            String sql="select * from users where userno=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,userNo);
            rs=pstmt.executeQuery();
            while (rs.next()){
                u=new Users();
                u.setUserNo(rs.getInt(1));
                u.setUserName(rs.getString(2));
                u.setUserPwd(rs.getString(3));
                u.setUserSex(rs.getInt(4));
                u.setUserAddress(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return u;
    }
}
