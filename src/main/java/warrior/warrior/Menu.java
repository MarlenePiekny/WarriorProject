package warrior;
import java.util.Scanner;

public class Menu {
	
		//ATTRIBUTES
	
		//METHODS
	
		//Constructor
		public Menu() {

		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Welcome in the Warrior & Wizard game");
		
		//while there isn't any character
		boolean isNoCharacter = true;
		while (isNoCharacter) {
		
		System.out.println("You will create you first character, chose between warrior and wizard");
		String inputCharacterChoice = keyboard.nextLine();
		
		//
		switch (inputCharacterChoice) {
			case "warrior" :
				//CREATE
				Warrior character = null;
				
				//No personalization
				boolean isNoWarrior = true;
				while (isNoWarrior) {
					
				//Ask default, name customization or complete customization
				System.out.println("Do you want to create a default warrior, a name custom warrior or a full customized warrior. Enter default, name or customized");
				String inputCustomWarriorChoice = keyboard.nextLine();
					
					switch (inputCustomWarriorChoice) {
						case "default":
							character = new Warrior();
							isNoWarrior = false;
						break;
						case "name":
							System.out.println("You will customize your warrior, please enter his/her name");
							String inputWarriorName = keyboard.nextLine();
							character = new Warrior(inputWarriorName);
							isNoWarrior = false;
						break;
						case "customize":
							System.out.println("You will customize your warrior : \n" + "Please enter his/her name");
							String inputWarriorName1 = keyboard.nextLine();
							System.out.println("Please enter his/her life level : ");
							int inputWarriorLifeLevel = keyboard.nextInt();
							System.out.println("Please enter his/her attack strength : ");
							int inputWarriorAttackStrength = keyboard.nextInt();
							character = new Warrior(inputWarriorName1, "", inputWarriorLifeLevel, inputWarriorAttackStrength );
							isNoWarrior = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
					
				//Display all warrior informations
				System.out.println(character.displayInformation());	
				isNoCharacter = false;	
				}
				
			//SEE, EDIT OR PLAY
			
				boolean stayInMenu = true;
				
				while (stayInMenu) {
					
				
					System.out.println("You are now ready to play! :) \n" + "Do you want to play, see your warrior informations or edit your warrior. Please enter play, see or edit :");	
					String inputMenuChoice = keyboard.nextLine();

					switch (inputMenuChoice) {
						case "see":
							System.out.println(character.displayInformation());
						break;
						case "edit":
							System.out.println("You will customize your warrior : \n" + "Please enter his/her name");
							String inputWarriorName = keyboard.nextLine();
							character.setName(inputWarriorName);
							
							System.out.println("Please enter his/her life level : ");
							int inputWarriorLifeLevel = keyboard.nextInt();
							character.setLifeLevel(inputWarriorLifeLevel);
							
							System.out.println("Please enter his/her attack strength : ");
							int inputWarriorAttackStrength = keyboard.nextInt();
							character.setAttackStrength(inputWarriorAttackStrength);
							
							System.out.println(character.displayInformation());
						break;
						case "play":
							System.out.println("Great! Welcome" + character.getName() + "! Let's play");
							stayInMenu = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
			}	
			break;
			
			
			case "wizard" :
				//CREATE
				Wizard character1 = null;
				
				//No personalization
				boolean isNoWizard = true;
				while (isNoWizard) {
					
				//Ask default, name customization or complete customization
				System.out.println("Do you want to create a default wizard, a name custom wizard or a full customized wizard. Enter default, name or customized");
				String inputCustomWizardChoice = keyboard.nextLine();
					
					switch (inputCustomWizardChoice) {
						case "default":
							character1 = new Wizard();
							isNoWizard = false;
						break;
						case "name":
							System.out.println("You will customize your wizard, please enter his/her name");
							String inputWizardName = keyboard.nextLine();
							character1 = new Wizard(inputWizardName);
							isNoWizard = false;
						break;
						case "customize":
							System.out.println("You will customize your wizard : \n" + "Please enter his/her name");
							String inputWizardName1 = keyboard.nextLine();
							System.out.println("Please enter his/her life level : ");
							int inputWizardLifeLevel = keyboard.nextInt();
							System.out.println("Please enter his/her attack strength : ");
							int inputWizardAttackStrength = keyboard.nextInt();
							character1 = new Wizard(inputWizardName1, "", inputWizardLifeLevel, inputWizardAttackStrength );
							isNoWizard = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
					
				//Display all warrior informations
				System.out.println(character1.displayInformation());	
				isNoCharacter = false;	
				}
				
			//SEE, EDIT OR PLAY
			
				boolean stayInMenu1 = true;
				
				while (stayInMenu1) {
					
				
					System.out.println("You are now ready to play! :) \n" + "Do you want to play, see your wizard informations or edit your wizard. Please enter play, see or edit :");	
					String inputMenuChoice = keyboard.nextLine();

					switch (inputMenuChoice) {
						case "see":
							System.out.println(character1.displayInformation());
						break;
						case "edit":
							System.out.println("You will customize your warrior : \n" + "Please enter his/her name");
							String inputWizardName = keyboard.nextLine();
							character1.setName(inputWizardName);
							
							System.out.println("Please enter his/her life level : ");
							int inputWizardLifeLevel = keyboard.nextInt();
							character1.setLifeLevel(inputWizardLifeLevel);
							
							System.out.println("Please enter his/her attack strength : ");
							int inputWizardAttackStrength = keyboard.nextInt();
							character1.setAttackStrength(inputWizardAttackStrength);
							
							System.out.println(character1.displayInformation());
						break;
						case "play":
							System.out.println("Great! Welcome" + character1.getName() + "! Let's play");
							stayInMenu1 = false;
						break;	
						default :
							System.out.println("Sorry this answer doesn't exist :( ");
					}
			}	
			break;
			
			default :
				System.out.println("This word doesn't match the choices");
				isNoCharacter =true;
		}
		
	}	
		
		
		
	//Close the keyboard
	keyboard.close();
	
	}
	
		//METHODS
		
		//GETTERS
		
		
		//SETTERS

} 