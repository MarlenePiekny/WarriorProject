package play;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import DAO.*;
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
	private HeroDAO heroDAO;

	
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
		heroDAO = new HeroDAO();
		
	}

	// SPECIFIC METHODS
	
	/**
     * Welcome the player.
     * <p>Display a welcome message</p>
     * 
     */
	public void welcoming() {
	System.out.println("------------------------------------ \n \n" +
			   "Welcome in the Warrior & Wizard game \n \n" +
			   "------------------------------------ \n");
	}
	
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
					"You will select you first perso \n" +
					"Choose one in the list ----- enter list \n" +
					"Choose a warrior ----------- enter warrior \n" +
					"Choose a wizard ------------ enter wizard \n" +
					"You want to leave ---------- enter exit \n \n"+
					"------------------------------------ \n");
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
				System.out.println("\n This word doesn't match the choices \n");
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
		ResultSet persoList = this.heroDAO.listPersoInDB();
		
		//arraylist
		Map<Integer, Perso> perso = new HashMap<>();
		
					//Display existing perso
					while (persoList.next()) {
						int id = persoList.getInt("id");
						String name = persoList.getString("name");
						String type = persoList.getString("type");
						int lifeLevel = persoList.getInt("lifeLevel");
						int attackStrength = persoList.getInt("attackStrength");
						int boardSquare = persoList.getInt("boardSquare");
						System.out.println(id + " : " + name + " - " + type + " | life level :  " + lifeLevel + " | attack strength : " + attackStrength + " | board square : " + boardSquare);
						
						Perso hero = null;
						
						if (type.equalsIgnoreCase("warrior")) {
							hero = new Warrior(name,"", lifeLevel,attackStrength, boardSquare);
						}
						if (type.equalsIgnoreCase("wizard")) {
							hero = new Wizard(name,"", lifeLevel,attackStrength, boardSquare);
						}
						perso.put(id, hero);
					}
					
					//Ask the user the id of the perso he/she wants
					System.out.println("\nEnter the id of the perso you want");
					int inputPersoListChoices = keyboard.nextInt();
					keyboard.nextLine();
					
	return perso.get(inputPersoListChoices);		
	}
	

	/**
     * Menu choices.
     * <p>Returns a perso after user interactions in menu.</p>
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
	public Perso menuChoices(Perso perso) throws SQLException {

		while (true) {

			System.out.println("\n" + perso.getName() + ", you are now ready to play! :) \n" +
					"You want to play ------------------ enter play \n" +
					"See your " + perso.getClass().getSimpleName() + " informations ----- enter see \n" + 
					"Edit your " + perso.getClass().getSimpleName() + "------------------ enter edit \n");
			String inputMenuChoice = keyboard.nextLine();

			switch (inputMenuChoice) {
			case "see":
				System.out.println(perso.displayInformation());
				break;
			case "edit":
				updatePerso(perso);
				break;
			case "play":
				System.out.println("------------------------------------ \n \n" + 
								   "Welcome " + perso.getName() + "! Let's play :) \n");
				game = new Game(perso);
				game.startGame();
				return perso;
			case "exit":
				this.endGame();
				break;
			default:
				System.out.println("\n Sorry this answer doesn't exist :( \n");
			}
		}
	}

	/**
     * Create a warrior.
     * <p>Returns a perso of the class warrior.</p>
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
				System.out.println("\nSorry this answer doesn't exist :( \n");
			}

			// Display all warrior informations
			System.out.println(warrior.welcome());
		}
		return warrior;
	}
	
	/**
     * Create a wizard.
     * <p>Returns a perso of the class wizard.</p>
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
				System.out.println("\nSorry this answer doesn't exist :( \n");
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
     * Save perso while playing.
     * <p>Save perso informations : name, type, life level, attack strength and board square position.</p>
     * 
     * @param perso
     * 		The perso to save
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public void savePerso(Perso perso) throws SQLException {
		heroDAO.savePersoInDB(perso);
	}
	
	/**
     * End of the game.
     * <p>Terminate the game, switching off the console.</p>
     * 
     * @see System#exit(int)
     * 
     */
	 public void endGame() {
		 System.out.println("------------------------------------ \n \n " +
				            "You have decided to leave the game, too bad. See you soon! \n" +
				   			"------------------------------------ \n \n");

		System.exit(0);
	}

	// GETTERS

	// SETTERS

}