package play;

import java.util.Scanner;
import character.*;

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

	public Perso createPerso() {

		Perso perso = null;

		// while there isn't any perso
		while (perso == null) {

			System.out.println(
					"You will create you first perso, chose between warrior and wizard, or exit to leave the game");
			String inputPersoChoice = keyboard.nextLine();

			// Input Perso choice
			switch (inputPersoChoice) {
			case "warrior":
				// create a warrior
				perso = createWarrior();
				break;
			case "wizard":
				// Create a wizard
				perso = createWizard();
				break;
			case "exit":
				this.endGame();
				break;
			default:
				System.out.println("This word doesn't match the choices");
			}
		}
		return perso;
	}

	public Perso menuChoices(Perso perso) {

		while (true) {

			System.out.println("You are now ready to play! :) \n"
					+ "Do you want to play, see your warrior informations or edit your warrior. Please enter play, see or edit :");
			String inputMenuChoice = keyboard.nextLine();

			switch (inputMenuChoice) {
			case "see":
				System.out.println(perso.displayInformation());
				break;
			case "edit":
				updatePerso(perso);
				break;
			case "play":
				System.out.println("Great! Welcome " + perso.getName() + "! Let's play");
				game = new Game(perso);
				game.startGame();
				return perso;
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

	public void updatePerso(Perso perso) {
		System.out.println("You will customize your perso : \n" + "Please enter his/her name");
		String inputPersoName = keyboard.nextLine();
		perso.setName(inputPersoName);

		System.out.println("Please enter his/her life level : ");
		int inputPersoLifeLevel = keyboard.nextInt();
		perso.setLifeLevel(inputPersoLifeLevel);

		System.out.println("Please enter his/her attack strength : ");
		int inputPersoAttackStrength = keyboard.nextInt();
		perso.setAttackStrength(inputPersoAttackStrength);

		System.out.println(perso.displayInformation());
	}

	 public void endGame() {
		System.out.println("You have decided to leave the game, too bad. See you soon!");
		System.exit(0);
	}

	// GETTERS

	// SETTERS

}