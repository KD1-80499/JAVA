package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {

	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addnewCandidate(Candidate c) throws SQLException{
	   
		String sql="INSERT INTO candidates VALUES(default,?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql)){	
			stmt.setString(1, c.getName());
			stmt.setString(2,c.getParty());
			stmt.setInt(3,c.getVotes());
			int cnt=stmt.executeUpdate();		
		 return cnt;
		}
	}

	
	// delete given candidate
		public int deleteById(int id) throws SQLException {
			String sql = "DELETE FROM candidates WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, id);
				int cnt = stmt.executeUpdate();
				return cnt;
			} //stmt.close();
		}
		
		
	//update candidates
	public int updateCandidate(Candidate c) throws SQLException{
		String sql="UPDATE candidates SET name=?,party=?,votes=? WHERE id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1,c.getName());
			stmt.setString(2,c.getParty());
			stmt.setInt(3,c.getVotes());
			stmt.setInt(4,c.getId());
			int cnt=stmt.executeUpdate();
		
		return cnt;
		}
	}
	
	//get all candidates

		
	public  List<Candidate> displayAll() throws SQLException{
		List<Candidate>list=new ArrayList<>();
		String sql="SELECT * FROM candidates";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
		try(ResultSet rs=stmt.executeQuery()){
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String party=rs.getString("party");
				int votes=rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				list.add(c);
			}
		}
		} 
		return list;
	}
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt; 
		} //stmt.close();
		
	}
	// get all candidates of given party
	
	public List<Candidate> findByParty(String givenParty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
}
}
	


