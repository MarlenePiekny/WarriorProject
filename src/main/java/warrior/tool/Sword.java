package tool;

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
