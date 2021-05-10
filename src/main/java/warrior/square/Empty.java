package square;
import character.*;

public class Empty extends Square {
	
	//ATTRIBUTES
	String name = "Empty square";
	
	//METHODS
		
		//CONSTRUCTOR
		public Empty() {
			super();
		}
	
		//SPECIFIC METHOD
		@Override
		public Perso interaction(Perso perso) {
			System.out.println("You are on a empty case, nothing happens");
			return perso;
		}
		
		@Override
		public String displaySquareInformations() {
			return "You are on a empty case, nothing happens";
		}
			
		
		//GETTERS
		public String getName() {
			return name;
		}
		
		//SETTERS
		public void setName(String name) {
			this.name = name;
		}
	
		//TO STRING
		@Override
		public String toString() {
			return "Empty [name=" + name + "]";
		}

		
	
}