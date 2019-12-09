package cn.servlet;

import cn.pojo.Users;
import cn.services.LoginService;
import cn.services.impl.LoginServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡ������Ϣ
        String userNo=req.getParameter("userNo");
        String userPwd=req.getParameter("userPwd");
        //����������Ϣ
        LoginService loginService=new LoginServiceImpl();
        Users users=loginService.findUsersService(userNo, userPwd);
        //��Ӧ������
        if (users!=null){
            resp.sendRedirect("/studyjsp/index.jsp");
        }else {
            resp.sendRedirect("/studyjsp/login.jsp");
        }
    }
}
