package tool;

public abstract class Spell extends AttackTool {

	//ATTRIBUTES

	
	//METHODS
	
		//CONSTRUCTOR
	
		public Spell() {
			super();
		}
		
		public Spell(String inputName, int inputBonusAttackStrength) {
			super(inputName, inputBonusAttackStrength);
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
