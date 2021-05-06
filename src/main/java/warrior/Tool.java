

public class Tool extends Square {

	// ATTRIBUTES
	protected String name;
	protected int power;

	// METHODS

	// CONSTRUCTOR
	public void Tool() {
		this.name = name;
		this.power = power;
	}

	// SPECIFIC METHODS

	// GETTER
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPower(int power) {
		this.power = power;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Tool [name=" + name + ", power=" + power + "]";
	}
	
}