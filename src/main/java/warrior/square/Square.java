package square;
import character.*;

public abstract class Square {
	
	//ATTRIBUTES
	String name;
	
	//METHODES
	
		//CONSTRUCTOR
		public Square() {
			this.name = "";
		}
		
		//SPECIFIC METHODS
		
		public abstract Perso interaction(Perso perso);
		
		public abstract String displaySquareInformations();
		
	
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