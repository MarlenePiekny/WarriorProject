package tool;

/** <b>Class representing lightning, only for Wizard.</b>
* 
* <p>A lightning is defined by those informations : </p>
* <ul>
* 	<li>name : </li>
*  <li>bonus attack strength : </li>
* </ul>
* 
* <p>A lightning can have actions such as :</p>
* <ul>
* 	<li>interaction : </li>
* 	<li>display square information : </li>
* </ul>
* 
* @author Marlène
* @version 1.0
*/

public class Lightning extends Spell {

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Lightning() {
				super("Lightning", 2);
			}
			
			//SPECIFIC METHOD
			
			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Lightning [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
