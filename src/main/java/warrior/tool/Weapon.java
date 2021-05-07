package tool;

public abstract class Weapon extends AttackTool {
	
	//ATTRIBUTES

		
		//METHODS
		
			//CONSTRUCTOR
		
			public Weapon() {
				super();
			}
			
			public Weapon(String inputName, int inputBonusAttackStrength) {
				super(inputName, inputBonusAttackStrength);
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
