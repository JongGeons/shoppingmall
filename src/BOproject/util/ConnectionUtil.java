package BOproject.util;


import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class ConnectionUtil {
	
	private static ConnectionUtil connectionUtil = new ConnectionUtil();
	private static final String BO_URL = "jdbc:oracle:thin:@192.168.8.5:1521:xe";  
	private static final String USERNAME = "BO1";
	private static final String PASSWORD = "BO1";

	private Connection conn;

	private ConnectionUtil() {
	}

	public static ConnectionUtil getConnectionUtil() {
		return connectionUtil;
	}

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(
					BO_URL,
					USERNAME,
					PASSWORD);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return conn;
	}

	public void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		try {

			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
