package cn.servlet;

import cn.pojo.Users;
import cn.services.RegisterService;
import cn.services.impl.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users users=new Users();
        users.setUserNo(Integer.parseInt(req.getParameter("userNo")));
        users.setUserName(req.getParameter("userName"));
        users.setUserPwd(req.getParameter("userPwd"));
        users.setUserSex(Integer.parseInt(req.getParameter("userSex")));
        users.setUserAddress(req.getParameter("userAddress"));
        RegisterService registerService=new RegisterServiceImpl();
        boolean isFlag=registerService.registerService(users);
        if (isFlag==true){
            resp.sendRedirect("/studyjsp/login.jsp");
        }else{
            resp.sendRedirect("/studyjsp/register.jsp");
        }
    }
}
