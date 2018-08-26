package com.cy.demo;

import java.sql.*;

/**
 * Created by Tyki bom on 2018/8/26.
 */
public class Test {

    public static void main(String[] args){
        System.out.print("Hello IntelliJ IDEA");
        System.out.println(Test.class);


        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybatis";
            Connection conn = DriverManager.getConnection(url,"root","root");

            String sql = "select * from student where spwd = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
         //   ps.setInt(1,1);
            ps.setString(1,"123");
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("sid") + rs.getString("sname"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }


        }


}
