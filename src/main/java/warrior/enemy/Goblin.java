package enemy;
import square.*;

public class Goblin extends Enemy{

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Goblin() {
				super("Goblin", 6, 1);
			}

			//SPECIFIC METHOD

			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Goblin [name=" + getName() + ", getLifeLevel()=" + getLifeLevel() + ", getAttackStrength()="
						+ getAttackStrength() + "]";
			}

}
