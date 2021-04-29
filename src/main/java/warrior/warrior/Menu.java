package warrior;
import java.util.Scanner;

public class Menu {
	
		//Attributes
	
		//Methods
		public Menu() {

		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Welcome in the Warrior game");
		
		//while there isn't any character
		boolean isNoWarrior = true;
		while (isNoWarrior) {
		
		System.out.println("You will create you first character, chose between guerrier and magicien");
		String inputCharacterChoice = keyboard.nextLine();
		
		//
		switch (inputCharacterChoice) {
			case "guerrier" :
				//CREATE
				Guerrier warrior = null;
				
				//No personalization
				boolean isNoGuerrier = true;
				while (isNoGuerrier) {
					
				//Ask default, name customization or complete customization
				System.out.println("Do you want to create a default guerrier, a name custom guerrier or a full customized guerrier. Enter default, name or customized");
				String inputCustomGuerrierChoice = keyboard.nextLine();
					
					switch (inputCustomGuerrierChoice) {
						case "default":
							warrior = new Guerrier();
							isNoGuerrier = false;
						break;
						case "name":
							System.out.println("You will customize your guerrier, please enter his/her name");
							String inputGuerrierName = keyboard.nextLine();
							warrior = new Guerrier(inputGuerrierName );
							isNoGuerrier = false;
						break;
						case "customize":
							System.out.println("You will customize your guerrier : \n" + "Please enter his/her name");
							String inputGuerrierName1 = keyboard.nextLine();
							System.out.println("Please enter his/her life level : ");
							int inputGuerrierLifeLevel = keyboard.nextInt();
							System.out.println("Please enter his/her attack strength : ");
							int inputGuerrierAttackStrength = keyboard.nextInt();
							warrior = new Guerrier(inputGuerrierName1, "", inputGuerrierLifeLevel, inputGuerrierAttackStrength );
							isNoGuerrier = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
					
				//Display all guerrier informations
				System.out.println(warrior.displayInformation());	
				isNoWarrior = false;	
				}
				
			//SEE, EDIT OR PLAY
			
				boolean stayInMenu = true;
				
				while (stayInMenu) {
					
				
					System.out.println("You are now ready to play! :) \n" + "Do you want to play, see your guerrier informations or edit your guerrier. Please enter play, see or edit :");	
					String inputMenuChoice = keyboard.nextLine();

					switch (inputMenuChoice) {
						case "see":
							System.out.println(warrior.displayInformation());
						break;
						case "edit":
							System.out.println("You will customize your guerrier : \n" + "Please enter his/her name");
							String inputGuerrierName = keyboard.nextLine();
							warrior.setName(inputGuerrierName);
							
							System.out.println("Please enter his/her life level : ");
							int inputGuerrierLifeLevel = keyboard.nextInt();
							warrior.setLifeLevel(inputGuerrierLifeLevel);
							
							System.out.println("Please enter his/her attack strength : ");
							int inputGuerrierAttackStrength = keyboard.nextInt();
							warrior.setAttackStrength(inputGuerrierAttackStrength);
							
							System.out.println(warrior.displayInformation());
						break;
						case "play":
							System.out.println("Great! Welcome" + warrior.getName() + "! Let's play");
							stayInMenu = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
			}	
			break;
			
			
			case "magicien" :
				//create a magicien
				Magicien warrior2 = new Magicien();
				System.out.println(warrior2.displayInformation());
			break;
			default :
				System.out.println("Please enter guerrier ou magicien");
				isNoWarrior =true;
		}
	}	
		
		
		
	//Close the keyboard
	keyboard.close();
	
	}

} 