
import play.*;
import character.*;

public class Launch {

	// ATTRIBUTES

	// METHODS

	public static void main(String[] args) {

		Menu menu = new Menu();
		
		//Create a character
		Perso perso= menu.createPerso();
		
		//Chose an option in the menu
		menu.menuChoices(perso);

	}

}

