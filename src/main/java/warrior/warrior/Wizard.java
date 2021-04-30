package warrior;


public class Wizard {
	
	//ATTRIBUTES
	private String name = "Merlin";
	private String pictureURL = "";
	private int lifeLevel = 5 ;
	private int attackStrength = 8;
	private boolean spell = false;
	private boolean  philter = false;
	
	
	//Guerrier constructor without any input
	public Wizard() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.spell = spell;
		this.philter = philter;
	}
	
	//Guerrier constructor with name
		public Wizard(String inputName) {
			this.name = inputName;
			this.pictureURL = pictureURL;
			this.lifeLevel = lifeLevel;
			this.attackStrength = attackStrength;
			this.spell = spell;
			this.philter = philter;
		}
	
	//Guerrier constructor with 4 inputs
	public Wizard(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.spell = spell;
		this.philter = philter;
	}
	
	//SPECIFIC METHODS
	
	public String displayInformation() {
		return "Welcome " + this.name + " you are a wizard! Here are your info : \n"
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
	
	public boolean isSpell() {
		return this.spell;
	}
	
	public boolean isPhilter() {
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
	
	public void setSpell(boolean spell) {
		this.spell = spell;
	}
	
	public void setPhilter(boolean philter) {
		this.philter = philter;
	}

	
	// TO STRING
	@Override
	public String toString() {
		return "Wizard [name=" + this.name + ", pictureURL=" + this.pictureURL + ", lifeLevel=" + this.lifeLevel
				+ ", attackStrength=" + this.attackStrength + ", spell=" + this.spell + ", philter=" + this.philter + "]";
	}
	
	
	
}