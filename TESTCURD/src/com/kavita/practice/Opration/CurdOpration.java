package com.kavita.practice.Opration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kavita.practice.Connection.jdbcConnection;

public class CurdOpration {
	public static void main(String[] args) {
		CurdOpration co = new CurdOpration();
		co.inserempData();
		// co.selectempData();
		// co.deleteempData();
		// co.updateempData();
	}

	public void inserempData() {
		Connection con = jdbcConnection.getjdbcConnection();
		String sql = "insert into emp value(3,'neha','nashik')";
		try {
			Statement smt = con.createStatement();
			smt.execute(sql);
			System.out.println("emp data is Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectempData() {
		Connection con = jdbcConnection.getjdbcConnection();
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

			System.out.println("emp data is Selected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteempData() {
		Connection con = jdbcConnection.getjdbcConnection();
		String sql = "delete from emp where id=10";
		try {
			Statement smt = con.createStatement();
			smt.execute(sql);
			System.out.println("emp data is Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateempData() {
		Connection con = jdbcConnection.getjdbcConnection();
		String sql = "update emp set Address='solapur' where name='yati'";
		try {
			Statement smt = con.createStatement();
			smt.execute(sql);
			System.out.println("emp data is Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
