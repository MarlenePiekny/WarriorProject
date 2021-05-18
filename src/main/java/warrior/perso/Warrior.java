package perso;
import tool.*;

/**
 * <b>Class representing warrior in the game</b>
 * 
 * <p>A warrior is defined by this informations : </p>
 * <ul>
 * 	<li>name : </li>
 * 	<li>picture URL : </li>
 *	<li>life level : </li>
 *	<li>attack strength : </li>
 * 	<li>attack tool : </li>
 * 	<li>defense tool : </li>
 * 	<li>square board position : </li>
 * </ul>
 * 
 * <p>A warrior can have actions such as :</p>
 * <ul>
 * 	<li>welcome</li>
 * 	<li>display informations</li>
 * </ul>
 * 
 * @author Marlene
 * @version 1.0
 */

public class Warrior extends Perso {
	
	//ATTRIBUTES
	/**
     * The warrior weapon, it is editable.
     *	@see Warrior#getAttackTool()
     *	@see Warrior#setAttackTool(Weapon)
     */
	private Weapon attackTool;
	
	//METHODS
	
	//CONSTRUCTOR
	/**
     * Default warrior constructor.
     * <p>
     * With the default warrior constructor, no name, pictureURL, attackTool, defenseTool or square board position are given.
     * The name is set to Xena, and the life level and attack strength are set to 5.
     * </p>
     * 
     * @see Perso#name
     * @see Perso#pictureURL
     * @see Perso#lifeLevel
     * @see Perso#attackStrength
     */
	public Warrior() {
		super("Xena");
	}
	
	/**
     * Name customized warrior constructor.
     * <p> With the name customized warrior constructor,no pictureURL, attack tool, defense tool or square board position are given.<br>
     * The life level and attack strength are set to 5.</p>
     * 
     * @param name
     * 		The warrior name
     * 
     * @see Perso#Perso(String)
     */
	public Warrior(String name) {
		super(name);
	}
	
	/**
     * Customized warrior constructor.
     * <p>With the customized warrior constructor, no attack tool, defense tool or square board position are given.</p>
     * 
     * @param name
     * 		The warrior name
     * @param pictureURL
     * 		The warrior URL address picture
     * @param lifeLevel
     * 		The warrior life level
     * @param attackStrength
     * 		The warrior attack strength
     * 
     * @see Perso#Perso(String, String, int, int)
     */
	public Warrior(String name, String pictureURL, int lifeLevel, int attackStrength) {
		super(name, pictureURL, lifeLevel, attackStrength);
	}
	
	//SPECIFIC METHODS
	
	
	// GETTERS

	public Weapon getAttackTool() {
		return this.attackTool;
	}

	// SETTERS
	
	public void setAttackTool(Weapon attackTool) {
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