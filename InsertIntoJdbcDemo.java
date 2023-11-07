package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoJdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String title = "fire";
		String genre = "Action";
		String director = "Atlee";
		String release_year = "2023";
		
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,genre);
		ps.setString(3,director);
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		// see the result
		
	  }

	}

