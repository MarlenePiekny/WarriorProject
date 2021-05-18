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
 * @author Marlène
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
	
	/**
     * Returns the Perso table.
     * <p>This method returns all the data lines of the SQL request from Perso table</p>
     * 
     * @return persoList
     * 
     * @see ConnectionToDB#statement
     * @see Statement#executeQuery(String)
     * 
     */
	public ResultSet SQLRequestListPerso() throws SQLException {
		
		ResultSet persoList = this.statement.executeQuery("SELECT* FROM Perso");
		
	return persoList;	
	}
	
	
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
     */
	public ResultSet SQLRequest(String request) throws SQLException {
		
		ResultSet resultSet = this.statement.executeQuery(request);
		
	return resultSet;	
	}
	
			
}
