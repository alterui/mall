package com.lr.mall.test;

/**
 * @author liurui
 * @date 2020/10/25 17:33
 */
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public interface AK{
    public static void main(String[] args){
        try{
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://127.0.0.1:3306/blog?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
            String user = "root";
            String password = "root";
            Connection c = DriverManager.getConnection(url,user,password);
            System.out.println("the database connection is"+c);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}