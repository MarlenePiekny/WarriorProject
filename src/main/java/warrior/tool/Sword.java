package tool;

/**
 * <b>Class representing sword, only for Warrior.</b>
 * 
 * <p>A sword is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus attack strength : </li>
 * </ul>
 * 
 * <p>A sword can have actions such as :</p>
 * <ul>
 * 	<li>interaction : </li>
 * 	<li>display square information : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */
public class Sword extends Weapon {

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Sword() {
				super("Sword", 5);
			}

			//SPECIFIC METHOD
			
			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Sword [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
