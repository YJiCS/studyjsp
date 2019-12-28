package cn.dao.impl;

import cn.dao.DeleteUsersDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUsersDaoImpl implements DeleteUsersDao {
    @Override
    public boolean deleteUsersDao(int userNo) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        boolean isFlag=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/web_study?serverTimezone=UTC","root","123456");
            String sql ="delete from users where userno=?";
            pstmt.setInt(1, userNo);
            pstmt=conn.prepareStatement(sql);
            int num= pstmt.executeUpdate();
            if (num>0){
                isFlag=true;
            }
        } catch (Exception e) {
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
