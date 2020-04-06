package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresHandler {
	private Connection connection;
	private Statement statement;
	
	/**
	 * Execute an SQL query to the local bookstore database
	 * 
	 * @param query
	 * @return a ResultSet
	 */
	public ResultSet query(final String query) {
		if (getConnection()) {
			try {
				return statement.executeQuery(query);
			} catch (final SQLException e) {
				System.out.println("Exception: " + e);
			}
		}
		return null;
		
	}
	
	/**
	 * Establish a connection 
	 * 
	 * @return
	 */
	private boolean getConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/University", "postgres", "postgres");
			statement = connection.createStatement();
			return true;
		} catch (final Exception sqle) {
			System.out.println("Exception: " + sqle);
			return false;
        }
	}
	
	

}
