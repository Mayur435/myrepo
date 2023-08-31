package com.tca.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class First {
	public static void main(String args[])
	{
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/college","root","root@123");
			
			ps = con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, 102);
			ps.setString(2, "AAA");
			ps.setFloat(3, 75);
			
			int sval = ps.executeUpdate();
			
			if(sval == 0)
			{
				System.out.println("Unable to insert record");
			}
			else
			{
				System.out.println(" insert record");
			}
			
			System.out.println("Hello mysql");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

