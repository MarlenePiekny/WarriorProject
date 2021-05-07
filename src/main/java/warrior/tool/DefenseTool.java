package tool;

public class DefenseTool extends Tool {

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
