package helo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emp_mgm {
	public static void ins(int z,String a , String b, int c, String d) throws Exception{
		String i="insert into payroll values (?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/mydb";
		String name="root";
		String password="Romys@123#";
		Connection con= DriverManager.getConnection(url,name,password);
		PreparedStatement pp=con.prepareStatement(i);
		pp.setInt(1,z);
		pp.setString(2,a);
		pp.setString(3,b);
		pp.setInt(4,c);	
		pp.setString(5,d);
		int r =pp.executeUpdate();
		System.out.println();
	con.close();
	}	
	
	public static void insert(int z,String a, String b, int c, String d) throws Exception{
		String i="insert into employee values ('"+z+"','"+a+"','"+b+"','"+c+"')";
		String url="jdbc:mysql://localhost:3306/mydb";
		String name="root";
		String password="Romys@123#";
		String q ="select*from payroll";
		Connection con= DriverManager.getConnection(url,name,password);
		Statement s=con.createStatement();
		int rows =s.executeUpdate(i);
		System.out.println();
	con.close();
	}	
	
	public static void delete(int empid) throws Exception{
		
            String url="jdbc:mysql://localhost:3306/mydb";
			String name="root";
			String password="Romys@123#";
			String q ="delete from payroll where emp_id = " +empid;
			Connection con= DriverManager.getConnection(url,name,password);
			Statement s=con.createStatement();
			int rows =s.executeUpdate(q);
			System.out.println();
			con.close();			
	}
	 
	public static void update(int bv, int cb) throws Exception{
		getins gg=new getins();
		 String url="jdbc:mysql://localhost:3306/mydb";
			String name="root";
			String password="Romys@123#";
			String q ="update payroll  set  salary = "+bv+" where emp_id ="+cb;
			Connection con= DriverManager.getConnection(url,name,password);
			Statement s=con.createStatement();
			int rows =s.executeUpdate(q);
			System.out.println();
			con.close();	
			
	}
	public static void read() throws Exception{
	    String url="jdbc:mysql://localhost:3306/mydb";
		String name="root";
		String password="Romys@123#";
		String q ="select*from payroll";
		Connection con= DriverManager.getConnection(url,name,password);
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery(q);
	while(r.next()) {
			System.out.println("");
			System.out.println("Employee ID : "+r.getInt(1));
			System.out.println("Employee name : "+r.getString(2));
			System.out.println("Designation  : "+r.getString(3));
			System.out.println("Salary : "+r.getString(4));
			System.out.println("Branch : "+r.getString(5));
		} 
	con.close();
	}



}
