

public class Tool {

	// ATTRIBUTES
	protected String name;
	protected int power;

	// METHODS

	// CONSTRUCTOR
	public void Tool() {
		this.name = name;
	}

	// SPECIFIC METHODS

	// GETTER
	public String getName() {
		return name;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Tool [name=" + name + "]";
	}
}