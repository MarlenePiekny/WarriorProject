package tool;

/** <b>Class representing weapon, only for Warrior.</b>
* 
* <p>A weapon is defined by those informations : </p>
* <ul>
* 	<li>name : </li>
*   <li>bonus attack strength : </li>
* </ul>
* 
* <p>A weapon can have actions such as :</p>
* <ul>
* 	<li>interaction : </li>
* 	<li>display square information : </li>
* </ul>
* 
* @author Marlène
* @version 1.0
*/
public abstract class Weapon extends AttackTool {
	
	//ATTRIBUTES

		
		//METHODS
		
			//CONSTRUCTOR
		
			public Weapon() {
				super();
			}
			
			public Weapon(String name, int bonusAttackStrength) {
				super(name, bonusAttackStrength);
			}

			//SPECIFIC METHOD
			
			//GETTERS
			
			
			//SETTERS

			
			//TO STRING
			@Override
			public String toString() {
				return "Weapon [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
