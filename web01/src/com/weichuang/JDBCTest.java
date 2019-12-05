package com.weichuang;

import com.weichuang.util.DBUtil;
import org.junit.Test;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        try {
//            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //获取连接
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//            //获取st对象
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("select * from t_user");
            while (resultSet.next()){
                System.out.println("姓名："+resultSet.getString(2)+",密码："+resultSet.getString("password"));
            }
            DBUtil.closeAll(resultSet,st,conn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常了 ");
        }
    }

    @Test
    public void update(){
        try {
            //加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //获取连接
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//            //获取st对象
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            int rows = st.executeUpdate("update t_user set password='1234' where id=1");
            if(rows > 0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
            DBUtil.closeAll(null,st,conn);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常了 ");
        }
    }

}
