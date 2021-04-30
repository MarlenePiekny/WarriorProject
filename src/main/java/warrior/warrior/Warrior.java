package warrior;

public class Warrior {
	
	//ATTRIBUTES
	private String name = "Xena";
	private String pictureURL = "";
	private int lifeLevel = 5 ;
	private int attackStrength = 8;
	private boolean weapon = false;
	private boolean shield = false;
	
	//METHODS
	
	//CONSTRUCTOR
	
	//Guerrier constructor without any input
	public Warrior() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.weapon = weapon;
		this.shield = shield;
	}
	
	//Guerrier constructor with name
		public Warrior(String inputName) {
			this.name = inputName;
			this.pictureURL = pictureURL;
			this.lifeLevel = lifeLevel;
			this.attackStrength = attackStrength;
			this.weapon = weapon;
			this.shield = shield;
		}
	
	//Guerrier constructor with 4 inputs
	public Warrior(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.weapon = weapon;
		this.shield = shield;
	}
	
	//SPECIFIC METHODS
	
	public String displayInformation() {
		return "Welcome " + this.name + " you are a warrior! Here are your info : \n"
				+ "life level : " + this.lifeLevel + "\n"
				+ "attack strength : " + this.attackStrength;
	}
	
	// GETTERS

	public String getName() {
		return this.name;
	}

	public String getPictureURL() {
		return this.pictureURL;
	}

	public int getLifeLevel() {
		return this.lifeLevel;
	}

	public int getAttackStrength() {
		return this.attackStrength;
	}

	public boolean isWeapon() {
		return this.weapon;
	}

	public boolean isShield() {
		return this.shield;
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

	public void setWeapon(boolean weapon) {
		this.weapon = weapon;
	}

	public void setShield(boolean shield) {
		this.shield = shield;
	}
	
	// TO STRING
		@Override
	public String toString() {
			return "Warrior [name= " + this.name + "pictureURL= " + this.pictureURL + "lifeLevel= " + this.lifeLevel + 
					"attackStrength= " + this.attackStrength + "weapon= " + this.weapon + "shield= " + this.shield;
		}

}