package tool;

/**
 * <b>Class representing club, only for Warrior.</b>
 * 
 * <p>A club is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus attack strength : </li>
 * </ul>
 * 
 * <p>A club can have actions such as :</p>
 * <ul>
 * 	<li>interaction : </li>
 * 	<li>display square information : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */
public class Club extends Weapon {

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Club() {
				super("Club", 3);
			}

			//SPECIFIC METHOD
			
			//GETTERS
			
			//SETTERS
			
			//TO STRING
			//TO STRING
			@Override
			public String toString() {
				return "Club [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
