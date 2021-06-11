/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classjava.jsf.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="javause")
@RequestScoped
/**
 *
 * @author Hanzla Khan
 */
public class studentc {
    
        private String sname;
        private String fname;
	private String sapid;
        private String dept;
        private String batch;
        private String city;
        private String country;
        private String semail;
        private String descbox;

    public String getDescbox() {
        return descbox;
    }

    public void setDescbox(String descbox) {
        this.descbox = descbox;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }
        private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    
  
    private Map<String,String> countries;
	private Map<String,String> cities;

   
    @PostConstruct
    public void init() {
        countries  = new HashMap<String, String>();
        countries.put("Pakistan", "Pakistan");
        countries.put("Germany", "Germany");
        countries.put("Brazil", "Brazil");

        Map<String,String> map = new HashMap<String, String>();
		map.put("Lahore", "Lahore");
		map.put("Karachi", "Karachi");
		map.put("Multan", "Multan");
        data.put("Pakistan", map);

        map = new HashMap<String, String>();
		map.put("Berlin", "Berlin");
		map.put("Munich", "Munich");
		map.put("Frankfurt", "Frankfurt");
        data.put("Germany", map);

        map = new HashMap<String, String>();
        map.put("Sao Paulo", "Sao Paulo");
        map.put("Rio de Janerio", "Rio de Janerio");
        map.put("Salvador", "Salvador");
        data.put("Brazil", map);
    }
    
        

   
        

   

	public studentc() {
	}

	public studentc(String sname, String fname, String sapid, String dept,
			String batch, String city, String country) {
		this.sname = sname;
		this.fname = fname;
		this.sapid = sapid;
		this.dept = dept;
		this.batch = batch;
                this.city = city;
                this.country = country;
	}
    
    
	

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSapid() {
        return sapid;
    }

    public void setSapid(String sapid) {
        this.sapid = sapid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public Map<String, Map<String, String>> getData() {
        return data;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
   public Map<String, String> getCountries() {
        return countries;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void onCountryChange() {
		if(country !=null && !country.equals(""))
			cities = data.get(country);
		else
			cities = new HashMap<String, String>();
	} 

  public void delete(String stid) throws SQLException, ClassNotFoundException
{

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
				.prepareStatement("DELETE FROM studentreg WHERE Student_name="+"'"+stid+"'");
		int rs = pstmt.executeUpdate();

		pstmt.close();
		connect.close();
              
    
} 
  
  
  public void insert(String sname,String fname,String sapid,String dept, String batch, String city ) throws SQLException, ClassNotFoundException
{

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
				.prepareStatement("INSERT INTO `studentreg` (`Student_name`, `Father_name`, `SAP_ID`, `Department`, `Batch`, `City`) values('"+sname+"','"+fname+"','"+sapid+"','"+dept+"','"+batch+"','"+city+"')");
		int rs = pstmt.executeUpdate();

		pstmt.close();
		connect.close();
              
    
}   
  
  public void update(String sname,String fname,String sapid,String dept, String batch, String city ) throws SQLException, ClassNotFoundException
{

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
				.prepareStatement("UPDATE studentreg  SET Student_name ='"+sname+"', Father_name ='"+fname+"',Department ='"+dept+"',Batch ='"+batch+"',City ='"+city+"' WHERE SAP_ID ='"+sapid+"'");
		int rs = pstmt.executeUpdate();

		pstmt.close();
		connect.close();
              
    
}   
  
  
  
  public void inserttable2(String same,String email,String descbox ) throws SQLException, ClassNotFoundException
{

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
				.prepareStatement("INSERT INTO `aboutinfo` (`same`, `email`, `description`) values('"+same+"','"+email+"','"+descbox+"')");
		int rs = pstmt.executeUpdate();

		pstmt.close();
		connect.close();
              
    
}   
    
  
    
}
