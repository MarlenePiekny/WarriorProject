package tool;

public class Fireball extends Spell {

	//ATTRIBUTES
	
			//METHODS
				
				//CONSTRUCTOR
				public Fireball() {
					super("Fireball", 7);
				}
				
				//SPECIFIC METHOD
				
				//GETTERS
				
				//SETTERS
				
				//TO STRING
				@Override
				public String toString() {
					return "Fireball [name= " + this.getName() + ", bonusAttackStrength=" + this.getBonusAttackStrength() + "]";
				}
}
