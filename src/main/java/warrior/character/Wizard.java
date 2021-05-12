package character;
import tool.*;

/**
 * <b>Class representing wizard in the game</b>
 * 
 * <p>A wizard is defined by this informations : </p>
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
 * <p>A wizard can have actions such as :</p>
 * <ul>
 * 	<li>welcome</li>
 * 	<li>display informations</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public class Wizard extends Perso {

	// ATTRIBUTES
	/**
     * The wizard spell, it is editable.
     *	@see Wizard#getSpell()
     *	@see Wizardr#setSpell(Spell)
     */
	private Spell attackTool;


	/**
     * Default wizard constructor.
     * <p>
     * With the default wizard constructor, no name, pictureURL, attackTool, defenseTool or square board position are given.
     * The name is set to Merlin, and the life level and attack strength are set to 5.
     * </p>
     * 
     * @see Perso#Perso()
     */
	public Wizard() {
		super("Merlin");
	}

	/**
     * Name customized wizard constructor.
     * <p>
     * With the name customized wizard constructor,no pictureURL, attack tool, defense tool or square board position are given.
     * The life level and attack strength are set to 5.
     * </p>
     * 
     * @param name
     * 
     * @see Perso#Perso(String)
     */
	public Wizard(String inputName) {
		super(inputName);
	}

	/**
     * Customized warrior constructor.
     * <p>
     * With the customized warrior constructor, no attack tool, defense tool or square board position are given.
     * </p>
     * 
     * @param name
     * @param pictureURL
     * @param lifeLevel
     * @param attackStrength
     * 
     * @see Perso#Perso(String, String, int, int)
     */ 
	public Wizard(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		super(inputName, inputPicture, inputLifeLevel, inputAttackStrength);
	 }

	 //SPECIFIC METHODS
	

	 // GETTERS
	 
	public Spell getAttackTool() {
		return this.attackTool;
	}


	// SETTERS

	public void setAttackTool(Spell attackTool) {
		this.attackTool = attackTool;
	}


	// TO STRING
	@Override
	public String toString() {
		return "Wizard [name=" + this.getName() + ", pictureURL=" + this.getPictureURL() + ", lifeLevel=" + this.getLifeLevel()
				+ ", attackStrength=" + this.getAttackStrength() + ", spell=" + this.getAttackTool()
				+ "]";
	}

}