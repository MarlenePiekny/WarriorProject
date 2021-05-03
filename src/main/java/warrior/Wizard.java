package warrior;

public class Wizard extends Character {

	// ATTRIBUTES
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
	 
	 public String getName() { return this.name; }

	 public String getPictureURL() { return this.pictureURL; }

	 public int getLifeLevel() { return this.lifeLevel; }

	 public int getAttackStrength() { return this.attackStrength;
	 }


	public AttackTool getSpell() {
		return this.spell;
	}

	public DefenseTool getPhilter() {
		return this.philter;
	}

	// SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public void setLifeLevel(int lifeLevel) {
		this.lifeLevel = lifeLevel;
	}

	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}

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