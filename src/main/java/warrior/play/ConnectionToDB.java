package play;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * <b>Class representing the saved data.</b>
 * 
 * <p>A connection to data base is defined by those informations : </p>
 * <ul>
 * 	<li>connection : </li>
 * 	<li>statement : </li>
 * </ul>
 * 
 * <p>A connection to data base can have actions such as :</p>
 * <ul>
 * 	<li>SQLRequestListPerso</li>
 * 	<li>SQLRequest</li>
 * </ul>
 * 
 * @author Marlene
 * @version 1.0
 */
public class ConnectionToDB {
	
	//ATTRIBUTES
	/**
     * The connection to the data base.
     */
	private Connection connection;
	
	/**
     * The statement to the data base.
     */
	private Statement statement;
	
	//METHODS
	
	//CONSTRUCTOR
	
	/**
     * Default connection to data base constructor.
     * <p>With the default connection to data base, it will access the localhost of the machine on 3306 port, with root user and password hello12</p>
     * 
     * @see ConnectionToDB#connection
     * @see ConnectionToDB#statement
     * 
     */
	public ConnectionToDB() {
		//Connect with the DB
		try {
			Class.forName("org.mariadb.jdbc.Driver");
					
			this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/dandd", "root", "hello12");
			this.statement = this.connection.createStatement();
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
			System.out.println("You are not connected to the data base");
			
		} catch (SQLException e ) {
			
			System.out.println(e);
			System.out.println("You are not connected to the data base");
			
		}

}
	
	//SPECIFIC METHODS
	
	//REQUEST
	/**
     * Returns the result of an given SQL request.
     * <p>This method returns all the data lines of the SQL request from Perso table</p>
     * 
     * @param request
     * 		The SQL request to the data base
     * @return resultSet
     * 
     * @see ConnectionToDB#statement
     * @see Statement#executeQuery(String)
     * 
     *  @throws SQLException if the SQL doesn't work
     * 
     */
	public ResultSet SQLRequest(String request) throws SQLException {
		
		ResultSet resultSet = this.getStatement().executeQuery(request);
		
	return resultSet;	
	}
	
	//UPDATE
	/**
     * Send a SQL update request.
     * <p>This method send a SQL update request to the DB/p>
     * 
     * @param request
     * 		The SQL request to the data base
     * @return resultSet
     * 
     * @see ConnectionToDB#statement
     * @see Statement#executeQuery(String)
     * 
     * @throws SQLException if the SQL doesn't work
     * 
     */
	public void SQLUpdate(String request) throws SQLException {
		
		this.getStatement().executeUpdate(request);
		
	}
	
	//Getters
	
	public Connection getConnection() {
		return connection;
	}
	
	public Statement getStatement() {
		return statement;
	}

	//Setters

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	
}
