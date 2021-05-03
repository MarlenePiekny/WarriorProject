

public class Character {
	// ATTRIBUTES
	protected String name;
	protected String pictureURL = "";
	protected int lifeLevel = 0;
	protected int attackStrength = 0;
	protected int boardSquare;

	// METHODS

	// CONSTRUCTOR

	// character constructor without any input
	public Character() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.boardSquare = boardSquare;
	}

	// character constructor with name
	public Character(String inputName) {
		this.name = inputName;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.boardSquare = boardSquare;
	}

	// character constructor with 4 inputs
	public Character(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.boardSquare = boardSquare;
	}

	// SPECIFIC METHODS

	public String displayInformation() {
		return "Welcome " + this.name + " ! Here are your info : \n" + "life level : " + this.lifeLevel + "\n"
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

	public void setBoardSquare(int newBoardSquare) {
		this.boardSquare = newBoardSquare;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Warrior [name= " + this.name + "pictureURL= " + this.pictureURL + "lifeLevel= " + this.lifeLevel
				+ "attackStrength= " + this.attackStrength + "square board= " + this.boardSquare + "]";
	}

}