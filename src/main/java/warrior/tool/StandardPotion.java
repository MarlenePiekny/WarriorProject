package tool;

public class StandardPotion extends DefenseTool {

	//ATTRIBUTES
	
			//METHODS
				
				//CONSTRUCTOR
				public StandardPotion() {
					super("Standard Potion", 2);
				}
				
				//SPECIFIC METHOD
				
				//GETTERS
				
				//SETTERS
				
				//TO STRING
				@Override
				public String toString() {
					return "StandardPotion [name= " + this.getName() + ", bonusLifeLevel= " + this.getBonusLifeLevel() + "]";
				}
}
