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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import my.model.Items;
import my.model.User;

/**
 *
 * @author macbookair
 */
@WebService
public class InventoryService {
    
    
   @WebMethod
    public int InsertItem(String name, double price, String Quantity) {
        
        int i =0;
       Items u = new Items(name, price, Quantity);
       
       try {

            String query = "insert into itemsmaster(name,price,Quantity) values(?,?,?)";

            Connection con = initiateDbConnection();

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, Integer.parseInt(Quantity));
           
           i= preparedStatement.executeUpdate();
           System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
       return i;
        
    }

    @WebMethod
    public List<Items> GetAllItems() {
       List<Items> items = new ArrayList<>();

        try {
            ResultSet rs = null;
            String query = "Select * from itemsmaster";

            Connection con = initiateDbConnection();
            Statement statement = con.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                items.add(new Items(rs.getString("Name"), rs.getDouble("Price"), rs.getInt("Quantity")+""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          
        return items;

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
            e.printStackTrace();
        }
        return con;
    }

}
