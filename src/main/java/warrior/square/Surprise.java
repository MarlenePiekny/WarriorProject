package square;

public class Surprise extends Square {
	
	//ATTRIBUTES
	String name = "Surprise";
	
		//METHODS
			
			//CONSTRUCTOR
			public Surprise() {
				super();
			}

			//SPECIFIC METHOD
		
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