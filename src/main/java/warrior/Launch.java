package warrior;

import java.util.Scanner;

public class Launch {

	// ATTRIBUTES

	// METHODS

	public static void main(String[] args) {

		Menu menu = new Menu();
		
		//Create a character
		Character character = menu.createCharacter();
		
		//Chose an option in the menu
		menu.menuChoices(character);

	}

}