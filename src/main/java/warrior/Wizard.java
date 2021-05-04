

public class Wizard extends Character {

	// ATTRIBUTES
	private String name = "Merlin";
	private AttackTool spell;
	private DefenseTool philter;


	//Wizard constructor without any input
	public Wizard() {
	
	}

	//Wizard constructor with name 
	public Wizard(String inputName) {
		super(inputName);
	}

	 //Wizard constructor with 4 inputs 
	public Wizard(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		super(inputName, inputPicture, inputLifeLevel, inputAttackStrength);
	 }

	 //SPECIFIC METHODS
	
	 public String displayInformation() { return "Welcome " + this.name +
	 " you are a wizard! Here are your info : \n" + "life level : " +
	 this.lifeLevel + "\n" + "attack strength : " + this.attackStrength; }

	 // GETTERS
	 
	
	public AttackTool getSpell() {
		return this.spell;
	}

	public DefenseTool getPhilter() {
		return this.philter;
	}

	// SETTERS

	public void setSpell(AttackTool spell) {
		this.spell = spell;
	}

	public void setPhilter(DefenseTool philter) {
		this.philter = philter;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Wizard [name=" + this.name + ", pictureURL=" + this.pictureURL + ", lifeLevel=" + this.lifeLevel
				+ ", attackStrength=" + this.attackStrength + ", spell=" + this.spell + ", philter=" + this.philter
				+ "]";
	}

}