package tool;

/** <b>Class representing spell, only for Wizard.</b>
* 
* <p>A spell is defined by those informations : </p>
* <ul>
* 	<li>name : </li>
*   <li>bonus attack strength : </li>
* </ul>
* 
* <p>A spell can have actions such as :</p>
* <ul>
* 	<li>interaction : </li>
* 	<li>display square information : </li>
* </ul>
* 
* @author Marlène
* @version 1.0
*/

public abstract class Spell extends AttackTool {

	//ATTRIBUTES

	
	//METHODS
	
		//CONSTRUCTOR
	
		public Spell() {
			super();
		}
		
		public Spell(String name, int bonusAttackStrength) {
			super(name, bonusAttackStrength);
		}

		//SPECIFIC METHOD
		
		//GETTERS
		
		//SETTERS

		//TO STRING
		@Override
		public String toString() {
			return "Spell [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
		}
}
