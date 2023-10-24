package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDao implements AutoCloseable
{

	private Connection con;
	PartyVotes p=new PartyVotes();

	public PartyVotesDao() throws SQLException {
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
	
	public List<PartyVotes> getPartywiseVotes() throws SQLException
	{
		List<PartyVotes>list=new ArrayList<>();
		String sql="SELECT party,sum(votes) as VotesSum from candidates group by party";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while(rs.next()) {
					String party=rs.getString("party");
					int votes=rs.getInt("VotesSum");
					
					PartyVotes pv=new PartyVotes(party,votes);
					list.add(pv);
				}
				
			}
		}
		return list;
		// get partywise total votes.
	}

}
