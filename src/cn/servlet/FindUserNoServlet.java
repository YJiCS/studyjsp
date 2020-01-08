package cn.servlet;

import cn.pojo.Users;
import cn.services.FindUsersService;
import cn.services.impl.FindUsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FindUserNoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String userNo=req.getParameter("userNo");
        System.out.println(userNo);
        //处理请求信息
        FindUsersService findUsersService=new FindUsersServiceImpl();
        Users users=findUsersService.findUserNo(userNo);
        //响应处理结果
        if (users!=null){
            resp.getWriter().write("该账号已被使用请重新输入");
        }
    }
}
