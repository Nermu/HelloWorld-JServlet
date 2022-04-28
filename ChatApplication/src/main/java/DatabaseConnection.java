import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class DatabaseConnection {
	
	static Connection jdbcConnection;
	
	protected static Connection initializeDatabase() throws ClassNotFoundException, SQLException {		
		String dbDriver = "com.mysql.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/";
		String dbName = "chatMessages";
		String jdbcUsername = "root";
		String jdbcPassword = "Root1234@@";

		Class.forName(dbDriver);
		
		jdbcConnection = DriverManager.getConnection(jdbcURL + dbName, jdbcUsername, jdbcPassword);
		
		return jdbcConnection;
	}
	
}
