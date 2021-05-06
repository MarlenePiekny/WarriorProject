package warrior.character;
import warrior.tool.*;

public class Warrior extends Perso {
	
	//ATTRIBUTES
	private String name = "Xena";
	private AttackTool sword;
	private DefenseTool shield;
	
	//METHODS
	
	//CONSTRUCTOR
	//Warrior constructor without any input
	public Warrior() {

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
		return "Welcome " + this.name + " you are a warrior! Here are your info : \n"
				+ "life level : " + this.lifeLevel + "\n"
				+ "attack strength : " + this.attackStrength;
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
			return "Warrior [name= " + this.name + "pictureURL= " + this.pictureURL + "lifeLevel= " + this.lifeLevel + 
					"attackStrength= " + this.attackStrength + "sword= " + this.sword + "shield= " + this.shield +
					"square board= " + this.boardSquare + "]";
		}

}