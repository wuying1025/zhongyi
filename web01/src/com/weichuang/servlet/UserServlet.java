package com.weichuang.servlet;

import com.weichuang.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class UserServlet extends HttpServlet{
    //request   response
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        Connection connection = DBUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            String sql = "select * from t_user where name=? and password=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setObject(1,name);
            pst.setObject(2,pwd);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()){
                req.getSession().setAttribute("username",name);
                resp.sendRedirect("/success.jsp");
            }else{
                resp.sendRedirect("/error.jsp");
            }

//            sql注入 xss
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
