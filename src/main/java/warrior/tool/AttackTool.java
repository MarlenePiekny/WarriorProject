package tool;

import character.Perso;

public abstract class AttackTool extends Tool {
	
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
		public abstract Perso interaction(Perso perso);
		
		@Override
		public String displaySquareInformations() {
			return "You have reached a square where there is a " + getName() + 
					"\n Bonus attack strength ; " + getBonusAttackStrength();
		}
		
		
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