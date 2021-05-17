package enemy;
import square.*;

/**
 * <b>Class representing a dragon square in the game board</b>
 * 
 * <p>A dragon is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>life level : </li>
 * 	<li>attack strength : </li>
 * </ul>
 * 
 * <p>A dragon can have actions such as :</p>
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

public class Dragon extends Enemy{
	
	//ATTRIBUTES

	
	//METHODS
		
		//CONSTRUCTOR
		/**
	     * Customized dragon constructor.
	     * <p>With the customized enemy constructor, the name, the life level and the attack strength can be set. </p>
		 * 
		 * @see Square#name
		 * @see Enemy#lifeLevel
		 * @see Enemy#attackStrength
	     */
		public Dragon() {
			super("Dragon", 15, 4);
		}

		//SPECIFIC METHOD
	
		//GETTERS
		
		//SETTERS
	
		//TO STRING
		@Override
		public String toString() {
			return "Dragon [getName()=" + getName() + ", getLifeLevel()=" + getLifeLevel() + ", getAttackStrength()="
					+ getAttackStrength() + "]";
		}

}
