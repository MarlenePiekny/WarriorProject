package tool;

/**
 * <b>Class representing fireball, only for Wizard.</b>
 * 
 * <p>A fireball is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus attack strength : </li>
 * </ul>
 * 
 * <p>A fireball can have actions such as :</p>
 * <ul>
 * 	<li>interaction : </li>
 * 	<li>display square information : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public class Fireball extends Spell {

	//ATTRIBUTES
	
			//METHODS
				
				//CONSTRUCTOR
				public Fireball() {
					super("Fireball", 7);
				}
				
				//SPECIFIC METHOD
				
				//GETTERS
				
				//SETTERS
				
				//TO STRING
				@Override
				public String toString() {
					return "Fireball [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
				}
}
