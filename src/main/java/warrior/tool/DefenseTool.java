package tool;

import square.Square;
import square.Surprise;
import perso.Perso;

/**
 * <b>Class representing defense tool.</b>
 * 
 * <p>A defense tool is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus life level : </li>
 * </ul>
 * 
 * <p>A defense tool can have actions such as :</p>
 * <ul>
 * 	<li>display square informations : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */
public abstract class DefenseTool extends Surprise {

	//ATTRIBUTES
	/**
     * The life level bonus given by the defense tool.
     * 
     * @see DefenseTool#getBonusLifeLevel()
     * @see DefenseTool#setBonusLifeLevel(int)
     */
		private int bonusLifeLevel;
		
		//METHODS
		
			//CONSTRUCTOR
			/**
		     * Default defense tool constructor.
		     * <p>With the default defense tool constructor, no name or life level bonus are given. </p>
		     * 
		     * @see Square#name
		     * @see DefenseTool#bonusLifeLevel
		     */
			public DefenseTool() {
				super();
				this.bonusLifeLevel = 0;
			}
			
			/**
		     * Customized defense tool constructor.
		     * <p>With the customized defense tool constructor, a name and an life level bonus are set. </p>
		     * 
		     *  @param name
		     *  	The name of the defense tool
		     *  
		     *  @param bonusLifeLevel
		     *  	The life level bonus given by the defense tool
		     *  
		     * @see Square#name
		     * @see DefenseTool#bonusLifeLevel
		     */
			public DefenseTool(String name, int bonusLifeLevel) {
				super(name);
				this.bonusLifeLevel = bonusLifeLevel;
			}

			//SPECIFIC METHOD
			
			/**
		     * Display defense tool square informations.
		     * <p>Display the defense tool square informations. </p>
		     * 
		     * @return String
		     * 
		     * @see Square#getName()
		     * @see DefenseTool#getBonusLifeLevel()
		     */
			@Override
			public String displaySquareInformations() {
				return "You have reached a square where there is a " + super.getName() + 
						"\n Bonus attack strength ; " + this.getBonusLifeLevel();
			}	
			
			//GETTERS
			public int getBonusLifeLevel() {
				return bonusLifeLevel;
			}
			
			//SETTERS
			public void setBonusLifeLevel(int bonusLifeLevel) {
				this.bonusLifeLevel = bonusLifeLevel;
			}

			//TO STRING
			@Override
			public String toString() {
				return "DefenseTool [name= " + super.getName() + ", bonusLifeLevel= " + this.bonusLifeLevel + "]";
			}
}
