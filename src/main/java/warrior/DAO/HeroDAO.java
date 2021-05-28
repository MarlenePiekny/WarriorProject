package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import perso.Perso;
import play.ConnectionToDB;

/**
 * <b>Class representing the Development Acces Object with the Data Base</b>
 * 
 * <p>A HeroDAO is defined by those informations : </p>
 * <ul>
 * 	<li>ConnectionToDB : </li>
 * </ul>
 * 
 * <p>A HeroDAO can have actions such as :</p>
 * <ul>
 * 	<li>create perso : </li>
 *  <li> getPersoListChoices : </li>
 * 	<li>create warrior : </li>
 * 	<li>create wizard: </li>
 * 	<li>update perso : </li>
 * 	<li>menu choices : </li>
 * 	<li>end game : </li>
 * </ul>
 * 
 * @author Marlene
 * @version 1.0
 */

public class HeroDAO {
	
	//Attributes
	/**
     * The connection to the data base.
     * 
     */
	private ConnectionToDB connectionToDB;
	
	//Methods
	
	//Constructor
	public HeroDAO() {
		this.connectionToDB = new ConnectionToDB();	
	}
	
	//Specific Methods
	
	//CREATE
	/**
     * Create a perso in data base.
     * <p>This method create a new line in perso table</p>
     * 
     * @param type
     * 		The perso type
     * @param name
     * 		The perso name
     * @param lifeLevel
     * 		The perso life level
     * @param attackStrength
     * 		The perso attack strength
     * @param boardSquare
     * 		The perso board square position
     * 
     * @see ConnectionToDB#SQLRequest(String)
     * 
     * @throws SQLException if the SQL doesn't work
     * 
     */
	public void createAPersoInDB(String type, String name, int lifeLevel, int attackStrength, int boardSquare) throws SQLException {
		connectionToDB.SQLRequest("INSERT INTO Perso (type, name, lifeLevel, attackStrength, boardSquare)"  +
			 " VALUES ( '" + type + "', '" + name + "', " + lifeLevel + ", " + attackStrength + ", " + boardSquare + ")");
	}
	
	
	
	//READ
	
	/**
     * Returns the Perso table.
     * <p>This method returns all the data lines of the SQL request from Perso table</p>
     * 
     * @return persoList
     * 
     * @see ConnectionToDB#SQLRequest(String)
     * 
     * @throws SQLException if the SQL doesn't work
     * 
     */
	public ResultSet listPersoInDB() throws SQLException {
		ResultSet persoList = connectionToDB.SQLRequest("SELECT* FROM Perso");
	return persoList;	
	}
	
	/**
     * Returns a perso name list.
     * <p>Returns a list of existing perso name.</p>
     * 
     * @return nameList
     * 
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public List<String> getPersoNameList() throws SQLException {
		List<String> nameList = new ArrayList<String>();
		
		//Collect the SQL response
		ResultSet persoList = listPersoInDB();
		
		//Fill the tab with names
		while (persoList.next()) {
			String name = persoList.getString("name");
			nameList.add(name);
		}
		
	return nameList;
	}
	
	//UPDATE
	/**
     * Update a perso in Data Base
     * <p>This method update a perso in data base given a name</p>
     * 
     * * @param type
     * 		The perso type
     * @param name
     * 		The perso name
     * @param lifeLevel
     * 		The perso life level
     * @param attackStrength
     * 		The perso attack strength
     * @param boardSquare
     * 		The perso board square position
     * 
     * @see ConnectionToDB#SQLRequest(String)
     * 
     * @throws SQLException if the SQL doesn't work
     * 
     */
	public void updateAPersoInDB(String type, String name, int lifeLevel, int attackStrength, int boardSquare) throws SQLException {
		connectionToDB.SQLUpdate("UPDATE Perso" + 
			 " SET type = '" + type + "', lifeLevel = " + lifeLevel + ", attackStrength = " + attackStrength +
			 ", boardSquare =  " + boardSquare + 
			 " WHERE name = '" + name + "'" );	
	}
	
	
	//Specific methods
	/**
     * Save perso while playing.
     * <p>Save perso informations : name, type, life level, attack strength and board square position.</p>
     * 
     * @see Perso#getName()
     * @see Perso#getClass()
     * @see Perso#getLifeLevel()
     * @see Perso#getAttackStrength()
     * @see Perso#getBoardSquare()
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public void savePersoInDB(Perso perso) throws SQLException {
		
		//Collect all the informations from the playing perso
		String name = perso.getName();
		String type = perso.getClass().getSimpleName();
		int lifeLevel = perso.getLifeLevel();
		int attackStrength = perso.getAttackStrength();
		int boardSquare = perso.getBoardSquare();
		
		List<String> nameList = getPersoNameList();
		
		if (nameList.contains(name)) {
			//Update the DB
			this.updateAPersoInDB(type, name, lifeLevel, attackStrength, boardSquare);
		} else {
			//Create a new perso in the DB
			this.createAPersoInDB(type, name, lifeLevel, attackStrength, boardSquare);
		}
		
		
	}
}
