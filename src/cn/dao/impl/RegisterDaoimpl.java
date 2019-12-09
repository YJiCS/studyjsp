package cn.dao.impl;

import cn.dao.RegisterDao;
import cn.pojo.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDaoimpl implements RegisterDao {
    @Override
    public boolean registerDao(Users users) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        boolean isFlag=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/web_study?serverTimezone=UTC","root","123456");
            String sql="insert into users(userNo,userName,userPwd,userSex,userAddress) values(?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1, users.getUserNo());
            pstmt.setString(2, users.getUserName());
            pstmt.setString(3, users.getUserPwd());
            pstmt.setInt(4, users.getUserSex());
            pstmt.setString(5, users.getUserAddress());
            int num=pstmt.executeUpdate();
            if (num>0){
                isFlag=true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isFlag;
    }
}
