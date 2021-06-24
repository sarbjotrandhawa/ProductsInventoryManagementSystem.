/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebMethod;
import javax.jws.WebService;
import my.model.User;

/**
 *
 * @author macbookair
 */
@WebService
public class UserService {
    
   @WebMethod
   public int InsertUser (String username, String password, String email, String userRole)
   {
       int i =0;
       User u = new User(username, password, email, userRole);
       
       try {

            String query = "insert into usermaster(username,password,email,userRole) values(?,?,?,?)";

            Connection con = initiateDbConnection();

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, userRole);
             i=   preparedStatement.executeUpdate();
           System.out.println(i);

        } catch (Exception e) {
             System.out.println("hiiiii");
            e.printStackTrace();
        }
        
       return i;
       
   }
   
   @WebMethod
   public String ValidateUser (String username, String password)
   {
       String role = null;
        try {
            
            ResultSet rs = null;
            String query = "Select * from usermaster where Username=? and Password=?";

            Connection con = initiateDbConnection();
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            rs = preparedStatement.executeQuery();

            if (rs.next()) {
            role = rs.getString("UserRole");
            }
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        
        return role;
   }
   
   private Connection initiateDbConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_URL, db_Username, db_Password;
            db_URL = "jdbc:mysql://localhost:3306/testdb?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            db_Username = "root";
            db_Password = "12345678";

            con = DriverManager.getConnection(db_URL, db_Username, db_Password);

        } catch (Exception e) {
            System.out.println("hello");
            e.printStackTrace();
        }
        return con;
    }
    
}
