package warrior;

public class Warrior extends Character {
	
	//ATTRIBUTES
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
	
	public void onBoard(Board board) {
		this.boardSquare = board.getBeginningSquare();
	}
	
	public void moveOnBoard(int move) {
		this.boardSquare = this.boardSquare + move;
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
	*/

	public AttackTool getSword() {
		return this.sword;
	}

	public DefenseTool getShield() {
		return this.shield;
	}
	
	/*
	public int getBoardSquare() {
		return this.boardSquare;
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
	*/
	public void setSword(AttackTool sword) {
		this.sword = sword;
	}

	public void setShield(DefenseTool shield) {
		this.shield = shield;
	}
	
	public void setBoardSquare(int newBoardSquare) {
		this.boardSquare = newBoardSquare;
	}
	
	// TO STRING
		@Override
	public String toString() {
			return "Warrior [name= " + this.name + "pictureURL= " + this.pictureURL + "lifeLevel= " + this.lifeLevel + 
					"attackStrength= " + this.attackStrength + "sword= " + this.sword + "shield= " + this.shield +
					"square board= " + this.boardSquare + "]";
		}

}