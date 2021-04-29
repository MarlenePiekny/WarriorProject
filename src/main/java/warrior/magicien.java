

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
	
}