package lab.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsualFunctions {
	
	public Connection initDB(){
		Connection conn =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/UserDB";
			

			conn = DriverManager.getConnection(url, "root", "anguis5h");
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
		


	}
	
	
	public void closeDB(Statement sta, Connection conn) {

		try {
			sta.close();

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}
	
	public void closeDB(ResultSet rs, Statement sta, Connection conn) {

		try {
			rs.close();

			sta.close();

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
<<<<<<< HEAD
		
		}
		
	
=======
		} 
		
		return connexion;
>>>>>>> ca321f6f958836b501129de6246ebce3261dc6c3
	}

	


	
	

}
