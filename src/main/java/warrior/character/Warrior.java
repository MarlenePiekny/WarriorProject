package character;
import tool.*;

public class Warrior extends Perso {
	
	//ATTRIBUTES
	private Weapon attackTool;
	
	//METHODS
	
	//CONSTRUCTOR
	//Warrior constructor without any input
	public Warrior() {
		super("Xena");
	}
	
	//Warrior constructor with name
	public Warrior(String inputName) {
		super(inputName);
	}
	
	//Warrior constructor with 4 inputs
	public Warrior(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		super(inputName, inputPicture, inputLifeLevel, inputAttackStrength);
	}
	
	//SPECIFIC METHODS
	
	
	// GETTERS

	public Weapon getWeapon() {
		return this.attackTool;
	}

	// SETTERS
	
	public void setattackTool(Weapon attackTool) {
		this.attackTool = attackTool;
	}


	// TO STRING
		@Override
	public String toString() {
			return "Warrior [name= " + this.getName() + "pictureURL= " + this.getPictureURL() + "lifeLevel= " + this.getLifeLevel() + 
					"attackStrength= " + this.getAttackStrength() + "sword= " + this.attackTool + "shield= " + this.getDefenseTool() +
					"square board= " + this.getBoardSquare() + "]";
		}

}