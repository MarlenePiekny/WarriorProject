package tool;

/**
 * <b>Class representing default potion.</b>
 * 
 * <p>A default potion is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus life level : </li>
 * </ul>
 * 
 * <p>A default potion can have actions such as :</p>
 * <ul>
 * 	<li>interaction : </li>
 * 	<li>display square information : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public class StandardPotion extends DefenseTool {

	//ATTRIBUTES
	
			//METHODS
				
				//CONSTRUCTOR
				public StandardPotion() {
					super("Standard Potion", 2);
				}
				
				//SPECIFIC METHOD
				
				//GETTERS
				
				//SETTERS
				
				//TO STRING
				@Override
				public String toString() {
					return "StandardPotion [name= " + this.getName() + ", bonusLifeLevel= " + this.getBonusLifeLevel() + "]";
				}
}
