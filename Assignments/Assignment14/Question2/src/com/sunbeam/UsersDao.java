package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

public class UsersDao implements AutoCloseable
{
	private Connection con;
	
	public UsersDao() throws SQLException{
		con=DbUtil.getConnection();	
	}

	public void close() {
		try {
			if(con!=null)
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

public int addUser(Users u) throws SQLException, ParseException{
	String sql="Insert into users values(default,?,?,?,?,?,?,?)";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setString(1,u.getFirstname());
		stmt.setString(2, u.getLastname());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getPassword());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jd=sdf.parse(u.getDob());
		java.sql.Date dob=new java.sql.Date(jd.getTime());	
		stmt.setString(5, u.getDob());
		stmt.setDate(5, dob);
		stmt.setBoolean(6, u.isStatus());
		stmt.setString(7, u.getRole());
		int cnt=stmt.executeUpdate();
		return cnt ;
		
	}
	
}

public int deleteUser(int id) throws SQLException{
	String sql="DELETE from users where id=?";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setInt(1, id);
		int cnt=stmt.executeUpdate();
		return cnt;
	}
}

public int updateUser(Users u) throws SQLException, ParseException{
	String sql="Update users set first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? where id=?";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		
		stmt.setString(1,u.getFirstname());
		stmt.setString(2, u.getLastname());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getPassword());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jd=sdf.parse(u.getDob());
		java.sql.Date dob=new java.sql.Date(jd.getTime());
		stmt.setDate(5, dob);
		stmt.setBoolean(6, u.isStatus());
		stmt.setString(7, u.getRole());
		stmt.setInt(8, u.getId());
		int cnt=stmt.executeUpdate();
		return cnt;
	}
	}
		
public List <Users> displayAll() throws SQLException{
	List<Users> list=new ArrayList<>();
	String sql1="Select * from users";
	try(PreparedStatement stmt=con.prepareStatement(sql1)){
		try(ResultSet rs=stmt.executeQuery()){
			while(rs.next()) {
				int id=rs.getInt("id");
				String firstname=rs.getString("first_name");
				String lastname=rs.getString("last_name");
				String email=rs.getString("email");
				String password=rs.getString("password");
				java.sql.Date sdate=rs.getDate("dob");
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				String date=rs.getString("dob");
				Boolean status=rs.getBoolean("status");
				String role=rs.getString("role");
				 Users u=new Users(id,firstname,lastname,email,password,date,status,role);
				 list.add(u);
				
			}
		}
	}
	return list;
	
	
}
}
 	
