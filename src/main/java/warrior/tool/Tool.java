package tool;
import square.*;

public abstract class Tool extends Surprise {

	// ATTRIBUTES
	private String name;

	// METHODS

	// CONSTRUCTOR
	public Tool() {
		this.name = "";
	}
	
	public Tool(String inputName) {
		this.name = inputName;
	}

	// SPECIFIC METHODS

	// GETTER
	public String getName() {
		return name;
	}

	// SETTERS
	public void setName(String name) {
		this.name= name;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Tool [name=" + name + "]";
	}
	
}