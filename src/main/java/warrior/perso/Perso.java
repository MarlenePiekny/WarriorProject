package perso;
import tool.*;

/**
 * <b>Class representing perso of the game</b>
 * 
 * <p>A perso is defined by this informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>picture URL : </li>
 *	<li>life level : </li>
 *	<li>attack strength : </li>
 * 	<li>attack tool : </li>
 * 	<li>defense tool : </li>
 * 	<li>square board position : </li>
 *</ul>
 * 
 * <p>A perso can have actions such as :</p>
 * <ul>
 * 	<li>welcome</li>
 * 	<li>display informations</li>
 * </ul>
 * 
 * @author Marlene
 * @version 1.0
 */

public abstract class Perso {
	
	// ATTRIBUTES
	
	/**
     * The perso name, it is editable.
     *	@see Perso#Perso(String)
     *	@see Perso#Perso(String, String, int, int)
     *	@see Perso#getName()
     *	@see Perso#setName(String)
     */
	private String name;
	
	/**
     * The perso pictureURL, it is editable.
     * @see Perso#Perso(String, String, int, int)
     * @see Perso#getPictureURL()
     * @see Perso#setPictureURL(String)
     */
	private String pictureURL;
	
	/**
     * The perso lifeLevel, it is editable.
     * @see Perso#Perso(String, String, int, int)
     * @see Perso#getLifeLevel()
     * @see Perso#setLifeLevel(int)
     */
	private int lifeLevel;
	
	/**
     * The perso attack strength, it is editable.
     * @see Perso#Perso(String, String, int, int)
     * @see Perso#getAttackStrength()
     * @see Perso#setAttackStrength(int)
     */
	private int attackStrength;
	
	/**
	 * The perso attack tool, it is editable.
	 * @see Perso#getAttackTool()
	 * @see Perso#setAttackTool(AttackTool)
	 */
	private AttackTool attackTool;
	
	/**
	 * The perso defense tool, it is editable.
	 * @see Perso#getDefenseTool()
	 * @see Perso#setDefenseTool(DefenseTool)
	 */
	private DefenseTool defenseTool;
	
	/**
	 * The perso board square position, it is editable.
	 * @see Perso#getBoardSquare()
	 * @see Perso#setBoardSquare(int)
	 */
	private int boardSquare;

	// METHODS

	// CONSTRUCTORS
	
	/**
     * Default perso constructor.
     * <p>
     * With the default perso constructor, no name, pictureURL, attackTool, defenseTool or square board position are given.
     * The life level and attack strength are set to 5.
     * </p>
     * 
     * @see Perso#name
     * @see Perso#pictureURL
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */
	public Perso() {
		this("", "", 5,5);

	}

	/**
     * Name customized perso constructor.
     * <p>
     * With the name customized perso constructor,no pictureURL, attack tool, defense tool or square board position are given.
     * The life level and attack strength are set to 5.
     * </p>
     * 
     * @param name
     * 		The name of the perso
     * 
     * @see Perso#name
     * @see Perso#pictureURL
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */
	public Perso(String name) {
		this(name, "", 5,5);
	}

	/**
     * Customized perso constructor.
     * <p>
     * With the customized perso constructor, no attack tool, defense tool or square board position are given.
     * </p>
     * 
     * @param name
     * 		The perso name
     * @param pictureURL
     * 		The perso URL address picture
     * @param lifeLevel
     * 		The perso life level
     * @param attackStrength
     * 		The perso attack strength
     * 
     * @see Perso#name
     * @see Perso#pictureURL
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */
	public Perso(String name, String pictureURL, int lifeLevel, int attackStrength) {
		this.name = name;
		this.pictureURL = pictureURL;
		this.lifeLevel = lifeLevel;
		this.attackStrength = attackStrength;
		this.attackTool = null;
		this.defenseTool = null;
		this.boardSquare = 0;
	}

	// SPECIFIC METHODS
	
	/**
     * Welcome the perso.
     * <p>
     * Welcome the perso reminding its perso kind, life level and attack strength
     * </p>
     * 
     * @return String
     * 
     * @see Perso#name
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */

	public String welcome() {
		return "Welcome " + this.getName() + " you are a " + this.getClass().getSimpleName() +"! Here are your info : \n"
				+ "\n life level : " + this.getLifeLevel() + "\n"
				+ "\n attack strength : " + this.getAttackStrength();
	}
	
	/**
     * Display perso information.
     * <p>
     * Remind the perso its life level and attack strength
     * </p>
     * 
     * @return String
     * 
     * @see Perso#name
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */
	public String displayInformation() {
		return this.getName() + " , here are your info : "
				+ "\n life level : " + this.getLifeLevel()
				+ "\n attack strength : " + this.getAttackStrength();
	}

	/**
     * Perso moves on board.
     * <p>Moves the perso board square position.</p>
     * 
     * @param move
     * 		The number squares to move
     * 
     * @see Perso#boardSquare
     */
	public void moveOnBoard(int move) {
		this.boardSquare = this.boardSquare + move;
	}
	
	/*public void givesAHit(Enemy enemy) {
		System.out.println(this.getName() + " gives a " + this.attackStrength + "-hit to the " + enemy.getName() );
		enemy.setLifeLevel(enemy.getLifeLevel() - this.attackStrength);
	}
	*/
	
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