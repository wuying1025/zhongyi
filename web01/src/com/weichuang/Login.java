package com.weichuang;

import com.weichuang.util.DBUtil;
import org.junit.Test;

import java.sql.*;

public class Login {

    @Test
    public void login(){
        String name = "zs";
        String password = "1234";

        Connection connection = DBUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            String sql = "select * from t_user where name=? and password=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setObject(1,name);
            pst.setObject(2,password);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()){
                System.out.println("姓名："+resultSet.getString(2)+",密码："+resultSet.getString("password"));
            }
//            sql注入 xss
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        servlet
    }
}
