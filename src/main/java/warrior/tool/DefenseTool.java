package tool;

import character.Perso;

public abstract class DefenseTool extends Tool {

	//ATTRIBUTES
		private int bonusLifeLevel;
		
		//METHODS
		
			//CONSTRUCTOR
			public DefenseTool() {
				super();
				this.bonusLifeLevel = 0;
			}
			
			public DefenseTool(String inputName, int inputBonusLifeLevel) {
				super(inputName);
				this.bonusLifeLevel = inputBonusLifeLevel;
			}

			//SPECIFIC METHOD
			public abstract Perso interaction(Perso perso);
			
			@Override
			public String displaySquareInformations() {
				return "You have reached a square where there is a " + getName() + 
						"\n Bonus attack strength ; " + getBonusLifeLevel();
			}	
			
			//GETTERS
			public int getBonusLifeLevel() {
				return bonusLifeLevel;
			}
			
			//SETTERS
			public void setBonusLifeLevel(int bonusLifeLevel) {
				this.bonusLifeLevel = bonusLifeLevel;
			}

			//TO STRING
			@Override
			public String toString() {
				return "DefenseTool [name= " + this.getName() + ", bonusLifeLevel= " + bonusLifeLevel + "]";
			}
}
