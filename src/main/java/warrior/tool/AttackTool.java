package tool;

import square.Square;
import square.Surprise;

/**
 * <b>Class representing attack tool.</b>
 * 
 * <p>An attack tool is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 *  <li>bonus attack strength : </li>
 * </ul>
 * 
 * <p>An attack tool can have actions such as :</p>
 * <ul>
 * 	<li>display square informations : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public abstract class AttackTool extends Surprise {
	
	//ATTRIBUTES
	/**
     * The attack strength bonus given by the attack tool.
     * 
     *	@see AttackTool#getBonusAttackStrength()
     *	@see AttackTool#setBonusAttackStrength(int)
     */
	private int bonusAttackStrength;
	
	//METHODS
	
		//CONSTRUCTOR
		/**
	     * Default attack tool constructor.
	     * <p>With the default attack tool constructor, no name or attack strength bonus are given. </p>
	     * 
	     * @see Square#name
	     * @see AttackTool#bonusAttackStrength
	     */
		public AttackTool() {
			super();
			this.bonusAttackStrength = 0;
		}
		
		/**
	     * Customized attack tool constructor.
	     * <p>With the customized attack tool constructor, a name and an attack strength bonus are set. </p>
	     * 
	     * @see Square#name
	     * @see AttackTool#bonusAttackStrength
	     */
		public AttackTool(String name, int bonusAttackStrength) {
			super(name);
			this.bonusAttackStrength = bonusAttackStrength;
		}

		//SPECIFIC METHOD
		
		/**
	     * Display attack tool square informations.
	     * <p>Display the attack tool square informations. </p>
	     * 
	     * @return String
	     * 
	     * @see Square#getName()
	     * @see AttackTool#getBonusAttackStrength()
	     */
		@Override
		public String displaySquareInformations() {
			return "You have reached a square where there is a " + this.getName() + 
					"\n Bonus attack strength ; " + getBonusAttackStrength();
		}
		
		
		//GETTERS
		public int getBonusAttackStrength() {
			return bonusAttackStrength;
		}
		
		//SETTERS
		public void setBonusAttackStrength(int bonusAttackStrength) {
			this.bonusAttackStrength = bonusAttackStrength;
		}

		
		//TO STRING
		@Override
		public String toString() {
			return "AttackTool [name= " + super.getName() + ", bonusAttackStrength=" + this.bonusAttackStrength + "]";
		}
}