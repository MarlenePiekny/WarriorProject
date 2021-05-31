package square;

import perso.Perso;
import play.*;
import perso.Warrior;
import perso.Wizard;
import tool.AttackTool;
import tool.DefenseTool;
import tool.Spell;
import tool.Weapon;

/**
 * <b>Class representing surprise of the game board</b>
 * 
 * <p>An surprise is defined by those informations : </p>
 * <ul>
 * 	<li>name : </li>
 * </ul>
 * 
 * <p>A surprise can have actions such as :</p>
 * <ul>
 * 	<li>interaction</li>
 * 	<li>display square informations</li>
 * 	<li>get equipped with defense tool</li>
 * 	<li>get equipped with attack tool</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public abstract class Surprise extends Square {
	
	//ATTRIBUTES
	
		//METHODS
			
			//CONSTRUCTOR
			/**
		     * Default surprise constructor.
		     * <p>With the default surprise constructor, no name is given. </p>
		     * 
		     * @see Square#name
		     */
			public Surprise() {
				super();
			}
			
			/**
		     * Name customized square constructor.
		     * <p>With the default square constructor, a name can be given. </p>
		     * 
		     * @param name
		     * 		The name of the surprise
		     * 
		     * @see Square#name
		     */
			public Surprise(String name) {
				super(name);
				
			}

			//SPECIFIC METHOD
			/**
		     * Interaction with the surprise square.
		     * <p>The perso get equipped with the tool in the surprise square. </p>
		     * 
		     * @param perso
		     * 		The perso playing
		     * 
		     * @see Surprise#getEquippedWithDefenseTool(DefenseTool, Perso)
		     * @see Surprise#getEquippedWithAttackTool(AttackTool, Perso)
		     * 
		     */
			public int interaction(Perso perso) {
					
					if (this instanceof DefenseTool) {
						this.getEquippedWithDefenseTool((DefenseTool)this, perso);

					} else if (this instanceof AttackTool ) {
						this.getEquippedWithAttackTool((AttackTool) this, perso);
						
					} else {
						System.out.println("Aouch, this case shouldn't happen");
					}
					return 0;
					
				}

			public abstract String displaySquareInformations();
			
			/**
		     * The perso get equipped with a defense tool.
		     * <p>The perso get equipped with a defense tool and get the life level of it . </p>
		     * 
		     * @param defenseTool
		     * 		The defense tool to be equipped with
		     * @param perso
		     * 		The perso who will be equipped
		     * 
		     * @see DefenseTool#getBonusLifeLevel()
		     * 
		     * @see Perso#setDefenseTool(DefenseTool)
		     * @see Perso#getLifeLevel()
		     * @see Perso#setLifeLevel(int)
		     * 
		     */
			public void getEquippedWithDefenseTool(DefenseTool defenseTool, Perso perso) {
				perso.setDefenseTool((DefenseTool) this);
				
				//Don't overtake maximum perso life level
				if (perso.getLifeLevel() + ((DefenseTool) this).getBonusLifeLevel() > 10) {
					perso.setLifeLevel(10);
					System.out.println("You drink the potion and get a +" + ( ((DefenseTool) this).getBonusLifeLevel() - perso.getLifeLevel() ) + "-life level");
					
				} else {
					perso.setLifeLevel( perso.getLifeLevel() + ((DefenseTool) this).getBonusLifeLevel() );
					System.out.println("You drink the potion and get a +" + ((DefenseTool) this).getBonusLifeLevel() + "-life level");
				}

				System.out.println("You have a life level of " + perso.getLifeLevel());
			}
			
			/**
		     * The perso get equipped with an attack tool.
		     * <p>If the attack tool matches the perso attack tool kind, the perso get equipped with it and get the attack strength bonus of it.
		     * If not, the perso doesn't equipped with it.</p>
		     * 
		     * @param attackTool
		     * 		The attack tool to be equipped with
		     * @param perso
		     * 		The perso who will be equipped
		     * 
		     * @see AttackTool#getBonusAttackStrength()
		     * 
		     * @see Perso#setAttackTool(AttackTool)
		     * @see Perso#getAttackStrength()
		     * @see Perso#setAttackStrength(int)
		     * 
		     */
			public void getEquippedWithAttackTool(AttackTool attackTool, Perso perso) {
	
				if (attackTool instanceof Weapon && perso instanceof Warrior) {
					
					//Don't overtake maximum attack strength
					if (perso.getAttackStrength() + attackTool.getBonusAttackStrength() > 10 ) {
						System.out.println("The bonus attack strength of this " + attackTool.getName() + " is " + attackTool.getBonusAttackStrength()+ " , it is too high, you can't equip with it");
					} else {
						//the warrior can equip with a weapon
						perso.setAttackTool(attackTool);
						perso.setAttackStrength(perso.getAttackStrength() + attackTool.getBonusAttackStrength());
					}
						
					
				} else if (attackTool instanceof Spell && perso instanceof Wizard) {
					
					//Don't overtake maximum attack strength
					if (perso.getAttackStrength() + attackTool.getBonusAttackStrength() > 10 ) {
						System.out.println("The bonus attack strength of this " + attackTool.getName() + " is " + attackTool.getBonusAttackStrength()+ " , it is too high, you can't equip with it");
					} else {
						//the wizard can equip with a spell
						perso.setAttackTool(attackTool);
						perso.setAttackStrength(perso.getAttackStrength() + attackTool.getBonusAttackStrength());
					}
					
				} else {
					//the perso can't equip with the attack tool because it doesn't match its class
					System.out.println("You can't equip with " + attackTool.getName() + " because it doesn't match your " + perso.getClass().getSimpleName() + " class" );
				}
			}
		
			//GETTERS

			//SETTERS

			//TO STRING
			@Override
			public String toString() {
				return "Surprise [name=" + super.getName() + "]";
			}

}