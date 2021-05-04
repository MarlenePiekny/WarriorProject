

public abstract class Character {
	// ATTRIBUTES
	protected String name;
	protected String pictureURL = "";
	protected int lifeLevel = 5;
	protected int attackStrength = 5;
	protected AttackTool attackTool;
	protected DefenseTool defenseTool;
	protected int boardSquare;

	// METHODS

	// CONSTRUCTOR

	// character constructor without any input
	public Character() {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.attackTool = attackTool;
		this.defenseTool = defenseTool;
		this.boardSquare = boardSquare;
	}

	// character constructor with name
	public Character(String inputName) {
		this.name = inputName;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.attackTool = attackTool;
		this.defenseTool = defenseTool;
		this.boardSquare = boardSquare;
	}

	// character constructor with 4 inputs
	public Character(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		this.name = inputName;
		this.pictureURL = inputPicture;
		this.lifeLevel = inputLifeLevel;
		this.attackStrength = inputAttackStrength;
		this.attackTool = attackTool;
		this.defenseTool = defenseTool;
		this.boardSquare = boardSquare;
	}

	// SPECIFIC METHODS

	public abstract String displayInformation();

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
		return "Character [name=" + name + ", pictureURL=" + pictureURL + ", lifeLevel=" + lifeLevel
				+ ", attackStrength=" + attackStrength + ", attackTool=" + attackTool + ", defenseTool=" + defenseTool
				+ ", boardSquare=" + boardSquare + "]";
	}

}