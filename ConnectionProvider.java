
package com.User_Mgt_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection createConnection() throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_mgt_project","root","Root");
		
		return con;
	}

}
Footer
