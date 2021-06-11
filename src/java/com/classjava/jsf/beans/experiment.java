/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classjava.jsf.beans;

/**
 *
 * @author Hanzla Khan
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;  
import java.util.ArrayList;  
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  

@ManagedBean(name = "register")  
@RequestScoped  

public class experiment {
    
 
    private List<studentc> students1;
    private List<studentc> filteredstudents1;
    public List<studentc> RegList; 
    public List<studentc> RegList1; 

    public List<studentc> getRegList1() throws SQLException, ClassNotFoundException {
     RegList1 = new ArrayList<>();   
        
       Connection connect = null;

		String url = "jdbc:mysql://localhost/ooselab6";

		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(url, username, password);
			
                }
                 catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}



PreparedStatement pstmt = connect
				.prepareStatement("select same, email, description from aboutinfo ");
		ResultSet rs = pstmt.executeQuery();

               
                
                
                
		while (rs.next()) {

                    
			studentc Studentd = new studentc();
		     
                      
                        Studentd.setSname(rs.getString("same"));
                        Studentd.setSemail(rs.getString("email"));
                        Studentd.setDescbox(rs.getString("description"));
                       
                        

			RegList1.add(Studentd);

                        
                        
 
 
		}

		
		rs.close();
		pstmt.close();
		connect.close();



return RegList1;  
     
    }
    
     public String sorder;
    public String deleteAction(String order) {
        sorder = order;
        return null;
    }
public List<studentc> getRegList() throws ClassNotFoundException, SQLException {    
RegList = new ArrayList<>();  
 

Connection connect = null;

		String url = "jdbc:mysql://localhost/ooselab6";

		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(url, username, password);
			
                }
                 catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}



PreparedStatement pstmt = connect
				.prepareStatement("select Student_name, Father_name, SAP_ID, Department, Batch, City from studentreg ");
		ResultSet rs = pstmt.executeQuery();

               
                
                
                
		while (rs.next()) {

                    
			studentc Studentc = new studentc();
		     
                        Studentc.setSname(rs.getString("Student_name"));
                        
                        
                        Studentc.setFname(rs.getString("Father_name"));
                        Studentc.setSapid(rs.getString("SAP_ID"));
                        Studentc.setDept(rs.getString("Department"));
                        Studentc.setBatch(rs.getString("Batch"));
                        Studentc.setCity(rs.getString("City"));
                        

			RegList.add(Studentc);

                        
                        
 
 
		}

		
		rs.close();
		pstmt.close();
		connect.close();



return RegList;  
    
    
}



    
    public List<studentc> getstudents1() {
        return students1;
    }
    
    public List<studentc> getFilteredstudents1() {
        return filteredstudents1;
    }

    public void setFilteredstudents1(List<studentc> filteredstudents1) {
        this.filteredstudents1 = filteredstudents1;
    }

   
    
    
    
    
    
    
    
    
    
    

    
    
    
}
