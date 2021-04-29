package warrior;

public class Guerrier {
	
	//Default attributs
	private String name = "Xena";
	private String pictureURL = "";
	private int lifeLevel = 5 ;
	private int attackStrength = 8;
	private boolean weapon = false;
	private boolean shield = false;
	
	
	//Guerrier constructor without any input
	public Guerrier() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.weapon = weapon;
		this.shield = shield;
	}
	
	//Guerrier constructor with name
		public Guerrier(String inputName) {
			this.name = inputName;
			this.pictureURL = pictureURL;
			this.lifeLevel = lifeLevel;
			this.attackStrength = attackStrength;
			this.weapon = weapon;
			this.shield = shield;
		}
	
	//Guerrier constructor with 4 inputs
	public Guerrier(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.weapon = weapon;
		this.shield = shield;
	}
	
	// GETTERS

	public String getName() {
		return name;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public int getLifeLevel() {
		return lifeLevel;
	}

	public int getAttackStrength() {
		return attackStrength;
	}

	public boolean isWeapon() {
		return weapon;
	}

	public boolean isShield() {
		return shield;
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
			return "Guerrier [name= " + name + "pictureURL= " + pictureURL + "lifeLevel= " + lifeLevel + 
					"attackStrength= " + attackStrength + "weapon= " + weapon + "shield= " + shield;
		}

}