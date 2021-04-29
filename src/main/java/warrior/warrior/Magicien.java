package warrior;


public class Magicien {
	
	//Default attributs
	private String name = "Merlin";
	private String pictureURL = "";
	private int lifeLevel = 5 ;
	private int attackStrength = 8;
	private boolean spell = false;
	private boolean  potion = false;
	
	
	//Guerrier constructor without any input
	public Magicien() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.spell = spell;
		this.potion = potion;
	}
	
	//Guerrier constructor with name
		public Magicien(String inputName) {
			this.name = inputName;
			this.pictureURL = pictureURL;
			this.lifeLevel = lifeLevel;
			this.attackStrength = attackStrength;
			this.spell = spell;
			this.potion = potion;
		}
	
	//Guerrier constructor with 4 inputs
	public Magicien(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.spell = spell;
		this.potion = potion;
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
	
	public boolean isSpell() {
		return spell;
	}
	
	public boolean isPotion() {
		return potion;
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
	
	public void setPotion(boolean potion) {
		this.potion = potion;
	}

	
	// TO STRING
	@Override
	public String toString() {
		return "Magicien [name=" + name + ", pictureURL=" + pictureURL + ", lifeLevel=" + lifeLevel
				+ ", attackStrength=" + attackStrength + ", spell=" + spell + ", potion=" + potion + "]";
	}
	
	
	
}