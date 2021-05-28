import java.sql.SQLException;

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
			menu.welcoming();
			
			//Create a character
			Perso perso= menu.createPerso();
		
			//Chose an option in the menu
			menu.menuChoices(perso);

	}

}

