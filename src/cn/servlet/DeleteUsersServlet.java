package cn.servlet;

import cn.services.DeleteUsersService;
import cn.services.impl.DeleteUsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteUsersServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userNo=Integer.parseInt(req.getParameter("userNo"));
        DeleteUsersService deleteUsersService =new DeleteUsersServiceImpl();
        boolean isFlag=deleteUsersService.deleteUsersService(userNo);
        
    }
}
