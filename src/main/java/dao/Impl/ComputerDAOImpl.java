package dao.Impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ComputerDAO;
import db.DBUtility;
import entity.Computer;

public class ComputerDAOImpl implements ComputerDAO {

	@Override
	public List<Computer> getComputers() {
		List<Computer> list = new ArrayList<Computer>();
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		con = DBUtility.openConnection();
		try {
			pstmt = con.prepareStatement("select * from Computers");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Computer c = new Computer();
				c.setComId(rs.getInt("ComId"));
				c.setComName(rs.getString("ComName"));
				c.setProducer(rs.getString("Producer"));
				c.setYearMaking(rs.getInt("YearMaking"));
				c.setExpireDate(rs.getDate("ExpireDate"));
				c.setConfiguration(rs.getString("Configuration"));
				c.setPrice(rs.getDouble("Price"));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeAll(con, pstmt, rs);
		}

		return list;
	}

	@Override
	public boolean insertComputer(Computer com) {
		boolean b = false;
		Connection con;
		PreparedStatement pstmt = null;
		con = DBUtility.openConnection();
		try {
			pstmt = con.prepareStatement("insert into Computers values (?,?,?,?,?,?)");
			pstmt.setString(1, com.getComName());
			pstmt.setString(2, com.getProducer());
			pstmt.setInt(3, com.getYearMaking());
			pstmt.setDate(4, new Date(com.getExpireDate().getTime()));
			pstmt.setString(5, com.getConfiguration());
			pstmt.setDouble(6, com.getPrice());
			int i = pstmt.executeUpdate();
			if (i > 0)
				b = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeAll(con, pstmt, null);
		}
		// TODO Auto-generated method stub
		return b;
	}

}
