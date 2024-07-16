package com.java.testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DBConnect {

	public static void main (String []args)
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
        Statement	statement = connection.createStatement();
       
        //System.out.println("Enter your Data:");
        //System.out.println("Enter Employee ID:");
        System.out.println("Enter Employee ID  For Delection:");
        
        Scanner scanner = new Scanner (System.in);
        int id = scanner.nextInt() ;
        //System.out.println("Enter Updated Salary:");
        //String name     = scanner.next();
        //float salary    = scanner.nextFloat();
        //String address  = scanner.next();
        //String query = "insert into employee(`name`, `salary`, `address) values('"+name+"', '"+salary+"', '"+address+"')";
        //String query ="Update employee SET `salary` = '"+salary+"' where (id = '"+id+"')" ;
       String query = "Employee Id for Deletion where id = '"+id+"' ";
        
        int i = 0;
        i = statement.executeUpdate(query);  
        if (i!= 0)
        {
        	//System.out.println("Data Inserted Successfully");
        	System.out.println("Employee Id Delection Complete !!");
        }
        else
        {
        	//System.out.println("Employee Not Found!!");
        	System.out.println("Employee Id Delection Im-Complete!!");
        }
        
        
        ResultSet set = statement.executeQuery("SELECT * FROM test.employee");
	    while(set.next())
	    {
	    	System.out.println(set.getInt(1) +" " +set.getString(2) +" " +set.getInt(3) +" " +set.getString(4) +"" );
	    }
	}
	
	catch (Exception e) {
		System.out.println(e);
	}
	}
	
	
	
}

