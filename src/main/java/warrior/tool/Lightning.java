package tool;

public class Lightning extends Spell {

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Lightning() {
				super("Lightning", 2);
			}
			
			//SPECIFIC METHOD
			
			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Lightning [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
