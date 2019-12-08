package com.weichuang.servlet;

import com.weichuang.pojo.User;
import com.weichuang.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet{
    //request   response
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if(method.equals("login")){
            login(req,resp);
        }else if(method.equals("register")){
            register(req,resp);
        }else if(method.equals("isExit")){
            isExit(req,resp);
        }
    }

    public void isExit(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        Connection connection = DBUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            String sql = "select * from t_user where name=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setObject(1,name);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()){
                resp.getWriter().print(1);
            }else{
                resp.getWriter().print(0);
            }
//            sql注入 xss
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(HttpServletRequest req, HttpServletResponse resp){
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getUsers(HttpServletRequest req, HttpServletResponse resp){
        Connection connection = DBUtil.getConnection();
        List<User> users = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            String sql = "select * from t_user";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()){
                User u  = new User();
                u.setName(resultSet.getString("name"));
                u.setId(resultSet.getInt("id"));
                u.setPassword(resultSet.getString("password"));
                users.add(u);
//                resp.sendRedirect("/success.jsp");
            }
//            req.getSession().setAttribute();
            req.setAttribute("users",users);
//            resp.sendRedirect("/user_show.jsp");//
            req.getRequestDispatcher("/user_show.jsp").forward(req,resp);
//            sql注入 xss
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void register(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String pwd2 = req.getParameter("pwd2");
        Connection connection = DBUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            String sql = "insert into t_user values(null,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setObject(1,name);
            pst.setObject(2,pwd);
            int rows = pst.executeUpdate();
            if (rows > 0 ){
               resp.getWriter().print("success");
            }else{
                resp.getWriter().print("fail");
            }
//            sql注入 xss
        } catch (Exception e) {
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
