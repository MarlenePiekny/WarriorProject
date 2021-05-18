package play;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import perso.*;

/**
 * <b>Class representing the menu of the game</b>
 * 
 * <p>A menu is defined by those informations : </p>
 * <ul>
 * 	<li>keyboard : </li>
 *  <li>game : </li>
 * </ul>
 * 
 * <p>A menu can have actions such as :</p>
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
public class Menu {

	// ATTRIBUTES
	/**
     * The keyboard allowing user to interact with the game.
     * 
     */
	private Scanner keyboard;
	
	/**
     * The game.
     * 
     */
	private Game game;
	
	/**
     * The connection to the data base.
     * 
     */
	private ConnectionToDB connectionToDB;

	
	// METHODS

	// CONSTRUCTOR
	/**
     * Default menu constructor.
     * <p>A menu made of a keyboard.</p>
     * 
     * @see Menu#keyboard
     * @see Scanner#Scanner(java.io.File)
     * 
     * @see Menu#connectionToDB
     * @see ConnectionToDB#ConnectionToDB()
     * 
     */
	
	public Menu() {
		
		//Connect to the keyboard to interact with the user
		keyboard = new Scanner(System.in);
		
		//Connect with the DB
		connectionToDB = new ConnectionToDB();

		System.out.println("Welcome in the Warrior & Wizard game");
		
	}

	// SPECIFIC METHODS
	
	/**
     * Create a perso.
     * <p>Returns a perso either warrior or wizard</p>
     * 
     * @return Perso
     * 
     * @see Menu#keyboard
     * @see Menu#createWarrior()
     * @see Menu#createWizard()
     * @see Menu#endGame()
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public Perso createPerso() throws SQLException {

		Perso perso = null;

		// while there isn't any perso
		while (perso == null) {

			System.out.println(
					"You will select you first perso : \n" +
					"Choose one in the list, enter list \n" +
					"Choose between a warrior and wizard, enter warrior or wizard \n" +
					"You want to leave, enter exit");
			String inputPersoChoice = keyboard.nextLine();

			// Input Perso choice
			switch (inputPersoChoice) {
			case "list":
				perso = getPersoListChoices();
			break;	
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
	
	
	/**
     * Perso list choices.
     * <p>Returns a perso after the player has choosen one in the existing list.</p>
     * 
     * @return Perso
     * 
     * @see Menu#updatePerso(Perso)
     * 
     * @see Perso#getName()
     * @see Perso#displayInformation()
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public Perso getPersoListChoices() throws SQLException {
		//Collect the SQL response
		ResultSet persoList = this.connectionToDB.SQLRequestListPerso();
		
		//arraylist
		Map<Integer, Perso> perso = new HashMap<>();
		
					//Display existing perso
					while (persoList.next()) {
						int id = persoList.getInt("id");
						String name = persoList.getString("name");
						String type = persoList.getString("type");
						int lifeLevel = persoList.getInt("lifeLevel");
						int attackStrength = persoList.getInt("attackStrength");
						System.out.println(id + " : " + name + " - " + type + " , life level :  " + lifeLevel + " , attack strength : " + attackStrength);
						
						Perso hero = null;
						
						if (type.equalsIgnoreCase("warrior")) {
							hero = new Warrior(name,"", lifeLevel,attackStrength);
						}
						if (type.equalsIgnoreCase("wizard")) {
							hero = new Wizard(name,"", lifeLevel,attackStrength);
						}
						perso.put(id, hero);
					}
					
					//Ask the user the id of the perso he/she wants
					System.out.println("Enter the id of the perso you want");
					int inputPersoListChoices = keyboard.nextInt();
					
	return perso.get(inputPersoListChoices);		
	}
	
	/**
     * Menu choices.
     * <p>Returns a perso after user interactions in menu.<p>
     * 
     * @param perso
     * 		The perso that will play
     * @return Perso
     * 
     * @see Menu#keyboard
     * @see Menu#updatePerso(Perso)
     * 
     * @see Perso#getName()
     * @see Perso#displayInformation()
     * 
     * @see Game#startGame()
     * 
     * @see Menu#endGame()
     * 
     */
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

	/**
     * Create a warrior.
     * <p>Returns a perso of the class warrior.<p>
     * 
     * @return Warrior
     * 
     * @see Menu#keyboard
     * 
     * @see Warrior#Warrior()
     * @see Warrior#Warrior(String)
     * @see Warrior#Warrior(String, String, int, int)
     * 
     */
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
			System.out.println(warrior.welcome());
		}
		return warrior;
	}
	
	/**
     * Create a wizard.
     * <p>Returns a perso of the class wizard.<p>
     * 
     * @return Wizard
     * 
     * @see Menu#keyboard
     * 
     * @see Wizard#Wizard()
     * @see Wizard#Wizard(String)
     * @see Wizard#Wizard(String, String, int, int)
     * 
     */
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
			System.out.println(wizard.welcome());
		
		return wizard;
	}
	
	/**
     * Update a perso.
     * <p>Ask user to put informations to update name, life level and attack strength of the perso.</p>
     * 
     * @param perso
     * 		The perso to be updated
     * 
     * @see Menu#keyboard
     * 
     * @see Perso#setName(String)
     * @see Perso#setLifeLevel(int)
     * @see Perso#setAttackStrength(int)
     * 
     */
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
	
	/**
     * End of the game.
     * <p>Terminate the game, switching off the console.</p>
     * 
     * @see System#exit(int)
     * 
     */
	 public void endGame() {
		System.out.println("You have decided to leave the game, too bad. See you soon!");
		System.exit(0);
	}

	// GETTERS

	// SETTERS

}