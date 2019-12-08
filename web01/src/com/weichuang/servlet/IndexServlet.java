package com.weichuang.servlet;

import com.weichuang.pojo.Banner;
import com.weichuang.pojo.User;
import com.weichuang.service.IndexService;
import com.weichuang.service.IndexServiceImpl;
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
    private IndexService indexService ;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = DBUtil.getConnection();
        try {
            indexService = new IndexServiceImpl();
            List<Banner> banners = indexService.getBanner();
            req.setAttribute("list",banners);
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
//            sql注入 xss
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
