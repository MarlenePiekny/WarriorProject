package square;

import character.Perso;

public abstract class Surprise extends Square {
	
	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			public Surprise() {
				super();
			}

			//SPECIFIC METHOD
			public abstract Perso interaction(Perso perso);
			
			public abstract String displaySquareInformations();
		
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
				return "Surprise [name=" + name + "]";
			}

}