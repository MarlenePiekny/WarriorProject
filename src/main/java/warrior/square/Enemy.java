package square;

import java.util.*;

import exception.PersoOvertakeGameBoardException;
import perso.Perso;
import play.*;

/**
 * <b>Class representing enemy of the game board</b>
 * 
 * <p>An enemy is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>life level : </li>
 * 	<li>attack strength : </li>
 * </ul>
 * 
 * <p>A enemy can have actions such as :</p>
 * <ul>
 * 	<li>interaction</li>
 * 	<li>display informations</li>
 * 	<li>takes a hit</li>
 * 	<li>gives a hit</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public abstract class Enemy extends Square {
	
	//ATTRIBUTES
	/**
     * The enemy life level
     * 
     * @see Enemy#getLifeLevel
     * @see Enemy#setLifeLevel(int)
     */
	private int lifeLevel;
	
	/**
     * The enemy attack strength
     * 
     * @see Enemy#getAttackStrength
     * @see Enemy#setLifeLevel(int)
     */
	private int attackStrength;
	
		//METHODS
			
			//CONSTRUCTOR
			/**
		     * Default enemy constructor.
		     * <p>With the default enemy constructor, no name is given, the life level and the attack strenght are set to 0. </p>
		     * 
		     * @see Square#name
		     */
			public Enemy() {
				this("", 0, 0);
			}
			
			/**
		     * Customized enemy constructor.
		     * <p>With the customized enemy constructor, the name, the life level and the attack strength can be set. </p>
		     * 
		     * @param name
		     * 		The name of the perso
		     * @param lifeLevel
		     * 		The life level of the perso
		     *  @param attackStrength
		     * 		The attack strength of the perso
		     * 
		     * @see Square#name
		     * @see Enemy#lifeLevel
		     * @see Enemy#attackStrength
		     */
			public Enemy(String name, int lifeLevel, int attackStrength) {
				super(name);
				this.lifeLevel = lifeLevel;
				this.attackStrength = attackStrength;
			}

			//SPECIFIC METHOD
			/**
		     * Interaction with the enemy.
		     * <p>When the perso is on the square position where there is an enemy, it display the enemy as well as the perso information.
		     * Then ask if the perso wants to fight. <br>
		     * If it is the case first the enemy takes an hit, then vice versa, the enemy gives an hit. <br>
		     * If not the perso leave going backward as much as the throwing dice gives.
		     * </p>
		     * 
		     * @param perso
		     * 		The perso playing
		     * 
		     * @see Square#getName()
		     * 
		     * @see Perso#getLifeLevel()
		     * @see Perso#getName()
		     * 
		     * @see Enemy#getLifeLevel()
		     * @see Enemy#displayInformations()
		     * @see Enemy#takesAHitFrom(Perso)
		     * @see Enemy#dies()
		     */
			
			
			@Override
			public int interaction(Perso perso) {
				Scanner keyboard = new Scanner(System.in);
				Dice dice = new Dice();
				
				System.out.println("You are in front of the " + super.getName());
				
				String inputChoiceFight = "";
				
				while ( ( perso.getLifeLevel() > 0 && this.getLifeLevel() > 0 ) && !inputChoiceFight.equals("leave") ) {
					
					System.out.println(this.displayInformations());
					System.out.println(perso.displayInformation());
					
					System.out.println("Do you want to fight or leave?");
					inputChoiceFight = keyboard.nextLine();
				
					switch (inputChoiceFight) {
					
					case "fight":
						
						//The perso attack
						this.takesAHitFrom(perso);
						if ( this.getLifeLevel() <= 0 ) {
							//the enemy died
							this.dies();
						} else {
							//the enemy gives a hit in return
							this.givesAHitTo(perso);
							if (perso.getLifeLevel() <= 0) {
								System.out.println("GAME OVER : " + perso.getName() +" is dead");
								Menu menu = new Menu();
								menu.endGame();
							}
						}
					break;
					
					case "leave" :
						System.out.println("You have chosen to leave. The " + this.getName() + " remains in the game");
						this.displayInformations();
						int squareToGoBackwards = dice.throwDice();
						
						
						System.out.println("You go " + squareToGoBackwards + " square.s backwards");
					return -squareToGoBackwards;
					
					default:
						System.out.println("This word doesn't match the choices");
					}
				}
				return 0;
			}
			
			/**
		     * Display enemy square information.
		     * <p>Display information when perso arriving for the first time in front of the enemy. </p>
		     * 
		     * @return String
		     * 
		     * @see Square#getName()
		     * 
		     * @see Enemy#getLifeLevel()
		     * @see Enemy#getAttackStrength()
		     */
			@Override
			public String displaySquareInformations() {
				return "You have reached a square where there is a " + super.getName() + 
						"\n Life level : " + this.getLifeLevel() +
						"\n Attack strength : " + this.getAttackStrength();
			}
			
			/**
		     * Display enemy square information.
		     * <p>Display information when perso and enemy are fighting. </p>
		     * 
		     * @return String
		     * 
		     * @see Square#getName()
		     * 
		     * @see Enemy#getLifeLevel()
		     * @see Enemy#getAttackStrength()
		     */
			public String displayInformations() {
				return "\n     | " + super.getName() + "\n" +
						"     | life level : " + this.getLifeLevel() + "\n" +
						"     | attack strength : " + this.getAttackStrength() + "\n";
			}
			
			/**
		     * Takes an hit from the perso.
		     * <p>The enemy life level decrease to the level of the perso attack strength. <p>
		     * 
		     * @param perso
		     * 		The perso playing
		     * 
		     * @see Perso#getName()
		     * @see Perso#getAttackStrength()
		     * 
		     * @see Square#getName()
		     * 
		     * @see Enemy#setLifeLevel(int)
		     * @see Enemy#getLifeLevel()
		     * 
		     */
			public void takesAHitFrom(Perso perso) {
				System.out.println(perso.getName() + " gives a " + perso.getAttackStrength() + "-hit to the " + super.getName() );
				this.setLifeLevel(this.getLifeLevel() - perso.getAttackStrength() );
			}
			
			/**
		     * Gives an hit to the perso.
		     * <p>The perso life level decrease to the level of the enemy attack strength. <p>
		     * 
		     * @param perso
		     * 		The perso playing
		     * 
		     * @see Perso#getLifeLevel()
		     * @see Perso#setLifeLevel(int)
		     * 
		     * @see Square#getName()
		     * 
		     * @see Enemy#getAttackStrength()
		     * 
		     */
			public void givesAHitTo(Perso perso) {
				System.out.println("The " + super.getName() + " gives a " + this.getAttackStrength() + "-hit to " + perso.getName() );
				perso.setLifeLevel(this.getAttackStrength() );
			}
			
			/**
		     * Makes the enemy die and disappear from the game board.
		     * <p>All the square when there is the enemy are replaced by an empty case. </p>
		     * 
		     * @see Square#getName()
		     * 
		     * @see Enemy#setLifeLevel(int)
		     */
			public void dies() {
				this.setLifeLevel(0);
				this.setName("Dead " + this.getName());
				System.out.println("The " + super.getName() + " is dead");
			}

		
			//GETTERS

			public int getLifeLevel() {
				return this.lifeLevel;
			}

			public int getAttackStrength() {
				return this.attackStrength;
			}

			//SETTERS
			
			public void setLifeLevel(int lifeLevel) {
				this.lifeLevel = lifeLevel;
			}

			public void setAttackStrength(int attackStrength) {
				this.attackStrength = attackStrength;
			}

			@Override
			public String toString() {
				return "Enemy [name=" + super.getName() + ", lifeLevel=" + this.getLifeLevel() + ", attackStrength=" + this.getAttackStrength() + "]";
			}
}