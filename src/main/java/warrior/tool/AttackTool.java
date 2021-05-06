package warrior.tool;

public class AttackTool extends Tool {
	
	//ATTRIBUTES
	private int bonusAttackStrength;
	
	//METHODS
	
		//CONSTRUCTOR
	
		public AttackTool() {
			super();
			this.bonusAttackStrength = 0;
		}
		
		public AttackTool(String inputName, int inputBonusAttackStrength) {
			super(inputName);
			this.bonusAttackStrength = inputBonusAttackStrength;
		}

		//SPECIFIC METHOD
		
		//GETTERS
		public int getBonusAttackStrength() {
			return bonusAttackStrength;
		}
		
		//SETTERS
		public void setBonusAttackStrength(int bonusAttackStrength) {
			this.bonusAttackStrength = bonusAttackStrength;
		}

		
		//TO STRING
		@Override
		public String toString() {
			return "AttackTool [name= " + this.getName() + ", bonusAttackStrength=" + bonusAttackStrength + "]";
		}
}