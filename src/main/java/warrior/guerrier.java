

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
	
	

}