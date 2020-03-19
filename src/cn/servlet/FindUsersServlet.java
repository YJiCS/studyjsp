package cn.servlet;

import cn.pojo.Users;
import cn.services.FindUsersService;
import cn.services.impl.FindUsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindUsersServlet  extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        int userSex=Integer.parseInt(req.getParameter("userSex"));
        FindUsersService findUsersService =new FindUsersServiceImpl();
        List<Users> ls= findUsersService.findUsersService();
        req.setAttribute("list", ls);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
//        for(Users users: ls){
//            System.out.print(users.getUserNo()+"--");
//            System.out.print(users.getUserName()+"--");
//            System.out.println(users.getUserPwd());
//        }
    }
}
