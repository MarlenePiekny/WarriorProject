package enemy;
import square.*;

/**
 * <b>Class representing a sorcerer square in the game board</b>
 * 
 * <p>A sorcerer is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>life level : </li>
 * 	<li>attack strength : </li>
 * </ul>
 * 
 * <p>A sorcerer can have actions such as :</p>
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

public class Sorcerer extends Enemy{

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			/**
		     * Customized sorcerer constructor.
		     * <p>With the customized sorcerer constructor, the name, the life level and the attack strength can be set. </p>
		     * 
		     * @see Square#name
		     * @see Enemy#lifeLevel
		     * @see Enemy#attackStrength
		     */
			public Sorcerer() {
				super("Sorcerer", 9, 2);
			}

			//SPECIFIC METHOD

			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Sorcerer [getName()=" + getName() + ", getLifeLevel()=" + getLifeLevel()
						+ ", getAttackStrength()=" + getAttackStrength() + "]";
			}
			
}
