/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataconn.bonecp;

/**
 *
 * @author Hanzla Khan
 */

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchdata {
 
    
    public static void main(String[] args) throws PropertyVetoException, SQLException, IOException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
           
            connection = connect.getInstance().getConnection();

            if (connection != null) {
                statement = connection.createStatement();
                resultSet = statement.executeQuery("select * from studentreg");
                while (resultSet.next()) {
                    System.out.println("Student name: " + resultSet.getString("Student_name"));
                    System.out.println("Father name: " + resultSet.getString("Father_name"));
                    System.out.println("Sap id: " + resultSet.getString("SAP_ID"));
                    System.out.println("Department: " + resultSet.getString("Department"));
                    System.out.println("Batch: " + resultSet.getString("Batch"));
                    System.out.println("City: " + resultSet.getString("City"));
                    
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException e) {e.printStackTrace();}
            if (statement != null) try { statement.close(); } catch (SQLException e) {e.printStackTrace();}
            if (connection != null) try { connection.close(); } catch (SQLException e) {e.printStackTrace();}
        }
    }
    
    
  
}
