package tool;

public class Club extends Weapon {

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Club() {
				super("Club", 3);
			}

			//SPECIFIC METHOD
			
			//GETTERS
			
			//SETTERS
			
			//TO STRING
			//TO STRING
			@Override
			public String toString() {
				return "Club [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
			}
}
