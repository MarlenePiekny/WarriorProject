
import java.util.Scanner;

public class Menu {

	// ATTRIBUTES
	private Scanner keyboard;
	private Game game;

	// METHODS

	// CONSTRUCTOR
	public Menu() {

		keyboard = new Scanner(System.in);

		System.out.println("Welcome in the Warrior & Wizard game");

	}

	// SPECIFIC METHODS

	public Character createCharacter() {

		Character character = null;

		// while there isn't any character
		while (character == null) {

			System.out.println(
					"You will create you first character, chose between warrior and wizard, or exit to leave the game");
			String inputCharacterChoice = keyboard.nextLine();

			// Input Character choice
			switch (inputCharacterChoice) {
			case "warrior":
				// create a warrior
				character = createWarrior();
				break;
			case "wizard":
				// Create a wizard
				character = createWizard();
				break;
			case "exit":
				this.endGame();
				break;
			default:
				System.out.println("This word doesn't match the choices");
			}
		}
		return character;
	}

	public Character menuChoices(Character character) {

		while (true) {

			System.out.println("You are now ready to play! :) \n"
					+ "Do you want to play, see your warrior informations or edit your warrior. Please enter play, see or edit :");
			String inputMenuChoice = keyboard.nextLine();

			switch (inputMenuChoice) {
			case "see":
				System.out.println(character.displayInformation());
				break;
			case "edit":
				updateCharacter(character);
				break;
			case "play":
				System.out.println("Great! Welcome " + character.getName() + "! Let's play");
				game = new Game(character);
				game.startGame();
				return character;
			case "exit":
				this.endGame();
				break;
			default:
				System.out.println("Sorry this answer doesn't exist :( ");
			}
		}
	}

	// METHODS

	public Warrior createWarrior() {

		Warrior warrior = null;
		while (warrior == null) {

			// Ask default, name customization or complete customization
			System.out.println(
					"Do you want to create a default warrior, a name custom warrior or a full customized warrior. Enter default, name or customized");
			String inputCustomWarriorChoice = keyboard.nextLine();

			switch (inputCustomWarriorChoice) {
			case "default":
				warrior = new Warrior();
				break;
			case "name":
				System.out.println("You will customize your warrior, please enter his/her name");
				String inputWarriorName = keyboard.nextLine();
				warrior = new Warrior(inputWarriorName);
				break;
			case "customized":
				System.out.println("You will customize your warrior : \n" + "Please enter his/her name");
				String inputWarriorName1 = keyboard.nextLine();
				System.out.println("Please enter his/her life level : ");
				int inputWarriorLifeLevel = keyboard.nextInt();
				System.out.println("Please enter his/her attack strength : ");
				int inputWarriorAttackStrength = keyboard.nextInt();
				warrior = new Warrior(inputWarriorName1, "", inputWarriorLifeLevel, inputWarriorAttackStrength);
				break;
			default:
				System.out.println("Sorry this answer doesn't exist :( ");
			}

			// Display all warrior informations
			System.out.println(warrior.displayInformation());
		}
		return warrior;
	}

	public Wizard createWizard() {

		Wizard wizard = null;
		while (wizard == null) {

			// Ask default, name customization or complete customization
			System.out.println(
					"Do you want to create a default wizard a name custom wizard or a full customized wizard. Enter default, name or customized");
			String inputCustomWizardChoice = keyboard.nextLine();

			switch (inputCustomWizardChoice) {
			case "default":
				wizard = new Wizard();
				break;
			case "name":
				System.out.println("You will customize your wizard please enter his/her name");
				String inputWizardName = keyboard.nextLine();
				wizard = new Wizard(inputWizardName);
				break;
			case "customized":
				System.out.println("You will customize your wizard : \n" + "Please enter his/her name");
				String inputWizardName1 = keyboard.nextLine();
				System.out.println("Please enter his/her life level : ");
				int inputWizardLifeLevel = keyboard.nextInt();
				System.out.println("Please enter his/her attack strength : ");
				int inputWizardAttackStrength = keyboard.nextInt();
				wizard = new Wizard(inputWizardName1, "", inputWizardLifeLevel, inputWizardAttackStrength);
				break;
			default:
				System.out.println("Sorry this answer doesn't exist :( ");
			}

		}
			// Display all wizard informations
			System.out.println(wizard.displayInformation());
		
		return wizard;
	}

	public void updateCharacter(Character character) {
		System.out.println("You will customize your character : \n" + "Please enter his/her name");
		String inputCharacterName = keyboard.nextLine();
		character.setName(inputCharacterName);

		System.out.println("Please enter his/her life level : ");
		int inputCharacterLifeLevel = keyboard.nextInt();
		character.setLifeLevel(inputCharacterLifeLevel);

		System.out.println("Please enter his/her attack strength : ");
		int inputCharacterAttackStrength = keyboard.nextInt();
		character.setAttackStrength(inputCharacterAttackStrength);

		System.out.println(character.displayInformation());
	}

	static public void endGame() {
		System.out.println("You have decided to leave the game, too bad. See you soon!");
		System.exit(0);
	}

	// GETTERS

	// SETTERS

}