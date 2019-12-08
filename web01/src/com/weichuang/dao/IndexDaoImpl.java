package com.weichuang.dao;

import com.weichuang.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class IndexDaoImpl implements IndexDao {
    @Override
    public ResultSet getBanner() {
        Connection connection = DBUtil.getConnection();
        ResultSet resultSet = null;
        try {
            Statement st = connection.createStatement();
            String sql = "select * from t_banner where online =1";
            PreparedStatement pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
//            sql注入 xss
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
