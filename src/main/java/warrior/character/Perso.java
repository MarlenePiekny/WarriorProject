package character;
import tool.*;
import play.*;
import square.Enemy;

public abstract class Perso {
	// ATTRIBUTES
	private String name;
	private String pictureURL;
	private int lifeLevel;
	private int attackStrength;
	private AttackTool attackTool;
	private DefenseTool defenseTool;
	private int boardSquare;

	// METHODS

	// CONSTRUCTOR

	// character constructor without any input
	public Perso() {
		this.name = "";
		this.pictureURL = "";
		this.lifeLevel = 5;
		this.attackStrength = 5;
		this.attackTool = null;
		this.defenseTool = null;
		this.boardSquare = 0;
	}

	// character constructor with name
	public Perso(String inputName) {
		this();
		this.name = inputName;
	}

	// character constructor with 4 inputs
	public Perso(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this();
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
	}

	// SPECIFIC METHODS

	public String welcome() {
		return "Welcome " + this.getName() + " you are a" + this.getClass().getSimpleName() +"! Here are your info : \n"
				+ "life level : " + this.getLifeLevel() + "\n"
				+ "attack strength : " + this.getAttackStrength();
	}

	public String displayInformation() {
		return this.getName() + " , here are your info : \n"
				+ "life level : " + this.getLifeLevel() + "\n"
				+ "attack strength : " + this.getAttackStrength();
	}

	public void onBoard(Board board) {
		this.boardSquare = board.getBeginningSquare();
	}

	public void moveOnBoard(int move) {
		this.boardSquare = this.boardSquare + move;
	}
	
	public void givesAHit(Enemy enemy) {
		System.out.println(this.getName() + " gives a " + this.attackStrength + "-hit to the " + enemy.getName() );
		enemy.setLifeLevel(enemy.getLifeLevel() - this.attackStrength);
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

	public int getBoardSquare() {
		return this.boardSquare;
	}
	
	public AttackTool getAttackTool() {
		return attackTool;
	}

	public DefenseTool getDefenseTool() {
		return defenseTool;
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

	public void setBoardSquare(int newBoardSquare) {
		this.boardSquare = newBoardSquare;
	}
	
	public void setAttackTool(AttackTool attackTool) {
		this.attackTool = attackTool;
	}
	
	public void setDefenseTool(DefenseTool defenseTool) {
		this.defenseTool = defenseTool;
	}

	// TO STRING
	
	@Override
	public String toString() {
		return "Perso [name=" + name + ", pictureURL=" + pictureURL + ", lifeLevel=" + lifeLevel
				+ ", attackStrength=" + attackStrength + ", attackTool=" + attackTool + ", defenseTool=" + defenseTool
				+ ", boardSquare=" + boardSquare + "]";
	}

}