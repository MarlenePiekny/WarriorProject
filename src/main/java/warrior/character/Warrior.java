package character;
import tool.*;

public class Warrior extends Perso {
	
	//ATTRIBUTES
	private AttackTool sword;
	private DefenseTool shield;
	
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
	
	public String displayInformation() {
		return "Welcome " + this.getName() + " you are a warrior! Here are your info : \n"
				+ "life level : " + this.getLifeLevel() + "\n"
				+ "attack strength : " + this.getAttackStrength();
	}
	
	// GETTERS

	public AttackTool getSword() {
		return this.sword;
	}

	public DefenseTool getShield() {
		return this.shield;
	}

	// SETTERS
	
	public void setSword(AttackTool sword) {
		this.sword = sword;
	}

	public void setShield(DefenseTool shield) {
		this.shield = shield;
	}

	// TO STRING
		@Override
	public String toString() {
			return "Warrior [name= " + this.getName() + "pictureURL= " + this.getPictureURL() + "lifeLevel= " + this.getLifeLevel() + 
					"attackStrength= " + this.getAttackStrength() + "sword= " + this.sword + "shield= " + this.getShield() +
					"square board= " + this.getBoardSquare() + "]";
		}

}