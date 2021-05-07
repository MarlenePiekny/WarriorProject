package enemy;
import square.*;

public class Dragon extends Enemy{
	
	//ATTRIBUTES

	
	//METHODS
		
		//CONSTRUCTOR
		public Dragon() {
			super("Dragon", 15, 4);
		}

		//SPECIFIC METHOD
	
		//GETTERS
		
		//SETTERS
	
		//TO STRING
		@Override
		public String toString() {
			return "Dragon [getName()=" + getName() + ", getLifeLevel()=" + getLifeLevel() + ", getAttackStrength()="
					+ getAttackStrength() + "]";
		}

}
