package warrior.square;
import warrior.character.*;

public abstract class Square {
	
	//ATTRIBUTES
	String name;
	
	//METHODES
	
		//CONSTRUCTOR
		public Square() {
			this.name = name;
		}
		
		//SPECIFIC METHODS
		
		public abstract Perso interaction(Perso perso);
		
	
		//GETTER
		public String getName() {
			return name;
		}
	
		//SETTER
		public void setName(String name) {
			this.name = name;
		}

		//TO STRING
		@Override
		public String toString() {
			return "Square [name=" + name + "]";
		}
		
		
}