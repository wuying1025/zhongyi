package com.weichuang.servlet;

import com.weichuang.pojo.User;
import com.weichuang.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IndexServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
//            resp.sendRedirect("/index.jsp");//
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
//            sql注入 xss
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
