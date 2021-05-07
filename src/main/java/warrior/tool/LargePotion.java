package tool;

public class LargePotion extends DefenseTool {

	//ATTRIBUTES
	
	//METHODS
		
		//CONSTRUCTOR
		public LargePotion() {
			super("Large Potion", 5);
		}
		
		//SPECIFIC METHOD
		
		//GETTERS
		
		//SETTERS
		
		//TO STRING
		@Override
		public String toString() {
			return "LargePotion [name= " + this.getName() + ", bonusLifeLevel= " + this.getBonusLifeLevel() + "]";
		}
}
