import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import perso.*;
import play.*;

/**
 *  <b>Class launching and managing the game.</b>
 * 
 * @author Marlene
 * @version 1.0
 */

public class Launch {

	// ATTRIBUTES

	// METHODS

	public static void main(String[] args) throws SQLException {

			Menu menu = new Menu();
			
			//Create a character
			Perso perso= menu.createPerso();
			
			//Chose an option in the menu
			menu.menuChoices(perso);

	}

}

