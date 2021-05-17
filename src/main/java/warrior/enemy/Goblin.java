package enemy;
import square.*;

/**
 * <b>Class representing a goblin square in the game board</b>
 * 
 * <p>A goblin is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>life level : </li>
 * 	<li>attack strength : </li>
 * </ul>
 * 
 * <p>A goblin can have actions such as :</p>
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

public class Goblin extends Enemy{

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			/**
		     * Customized goblin constructor.
		     * <p>With the customized goblin constructor, the name, the life level and the attack strength can be set. </p>
		     * 
		     * @see Square#name
		     * @see Enemy#lifeLevel
		     * @see Enemy#attackStrength
		     */
			public Goblin() {
				super("Goblin", 6, 1);
			}

			//SPECIFIC METHOD

			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Goblin [name=" + getName() + ", getLifeLevel()=" + getLifeLevel() + ", getAttackStrength()="
						+ getAttackStrength() + "]";
			}

}
