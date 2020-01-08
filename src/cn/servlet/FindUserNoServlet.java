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
        //������������ʽ
        req.setCharacterEncoding("utf-8");
        //������Ӧ�����ʽ
        resp.setContentType("text/html;charset=utf-8");
        //��ȡ������Ϣ
        String userNo=req.getParameter("userNo");
        System.out.println(userNo);
        //����������Ϣ
        FindUsersService findUsersService=new FindUsersServiceImpl();
        Users users=findUsersService.findUserNo(userNo);
        //��Ӧ������
        if (users!=null){
            resp.getWriter().write("���˺��ѱ�ʹ������������");
        }
    }
}
