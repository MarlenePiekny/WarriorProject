package enemy;
import square.*;

public class Sorcerer extends Enemy{

	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Sorcerer() {
				super("Sorcerer", 9, 2);
			}

			//SPECIFIC METHOD

			//GETTERS
			
			//SETTERS
			
			//TO STRING
			@Override
			public String toString() {
				return "Sorcerer [getName()=" + getName() + ", getLifeLevel()=" + getLifeLevel()
						+ ", getAttackStrength()=" + getAttackStrength() + "]";
			}
			
}
