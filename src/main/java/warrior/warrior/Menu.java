package warrior;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Welcome in the Warrior game");
		
		//while there is no guerrier or magicien created
		
		System.out.println("You will create you first character, chose between guerrier and magicien \n");
		String inputCharacterChoice = keyboard.nextLine();
		
		//
		switch (inputCharacterChoice) {
			case "guerrier" :
				//create a guerrier
				Guerrier warrior1 = new Guerrier();
				System.out.println(warrior1.displayInformation());
			break;
			case "magicien" :
				//create a magicien
				Magicien warrior2 = new Magicien();
				System.out.println(warrior2.displayInformation());
			break;
			default :
				System.out.println("Please enter guerrier ou magicien");
		}
		
		
		
		//Close the keyboard
		keyboard.close();
	
	}

} 