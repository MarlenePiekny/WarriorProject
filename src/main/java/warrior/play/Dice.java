package play;

import java.util.Random;

/**
 * <b>Class representing dice for the game</b>
 * 
 * <p>A dice is defined by those informations : </p>
 * <ul>
 * 	<li>number of sides : </li>
 *  <li>first side value : </li>
 * </ul>
 * 
 * <p>A dice can have actions such as :</p>
 * <ul>
 * 	<li>throw dice : </li>
 * 	<li>throw trick dice : </li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */
public class Dice {
	
	//ATTRIBUTES
	/**
     * The number of sides of the dice, it is editable.
     * 
     *	@see Dice#getNumberOfSides()
     *	@see Dice#setNumberOfSides(int)
     */
	private int numberOfSides;
	
	/**
     * The first value of the dice, it is editable.
     * 
     *	@see Dice#getFirstSideValue()
     *	@see Dice#setFirstSideValue(int)
     */
	private int firstSideValue;
	
	//METHODS
	
	//CONSTRUCTOR
	/**
     * Default dice constructor.
     * <p>A 6-sides dice is created started from 1. </p>
     * 
     * @see Dice#numberOfSides
     * @see Dice#firstSideValue
     */
	public Dice() {
		this.numberOfSides = 6;
		this.firstSideValue = 1;
	}
	
	//SPECIFIC METHODS
	
	/**
     * Throw a dice.
     * <p>It returns a value between 1 and 6 randomly. <p>
     * 
     * @return diceResult
     * 
     * @see Dice#numberOfSides
     * @see Dice#firstSideValue
     * 
     */
	public int throwDice() {
		Random random = new Random();
		int diceResult = this.firstSideValue + random.nextInt(this.numberOfSides);
		return diceResult;
	}
	
	/**
     * Throw a trick die dice.
     * <p>It returns 1 each time. <p>
     * 
     * @return 1
     * 
     */
	public int throwTrickDie() {
		return 1;
	}
	
	//GETTERS
	
	public int getNumberOfSides() {
		return this.numberOfSides;
	}
	
	public int getFirstSideValue() {
		return this.firstSideValue;
	}
	
	//SETTERS
	
	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public void setFirstSideValue(int firstSideValue) {
		this.firstSideValue = firstSideValue;
	}
	
}