/**
 * 
 */
package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author spectralr
 *
 */
public class DBConnect {
	
	private static String dbhost = "jdbc:mariadb://localhost:3306/store";
	private static String dbuser = "root";
	private static String dbpass = "azerty";
	
	public static Connection connect() throws SQLException{
		Connection con = null;
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection(dbhost, dbuser, dbpass);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
