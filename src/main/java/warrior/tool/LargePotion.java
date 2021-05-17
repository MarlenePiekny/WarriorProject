package tool;

/**
 * <b>Class representing large potion.</b>
 * 
 * <p>A large potion is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus life level : </li>
 * </ul>
 * 
 * <p>A large potion can have actions such as :</p>
 * <ul>
 * 	<li>interaction : </li>
 * 	<li>display square information : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public class LargePotion extends DefenseTool {

	//ATTRIBUTES
	
	//METHODS
		
		//CONSTRUCTOR
		public LargePotion() {
			super("Large Potion", 5);
		}
		
		//SPECIFIC METHOD
		
		//GETTERS
		
		//SETTERS
		
		//TO STRING
		@Override
		public String toString() {
			return "LargePotion [name= " + this.getName() + ", bonusLifeLevel= " + this.getBonusLifeLevel() + "]";
		}
}
