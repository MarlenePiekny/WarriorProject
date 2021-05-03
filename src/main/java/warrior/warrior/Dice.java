package warrior;
import java.util.Random;

public class Dice {
	
	//ATTRIBUTES
	private int numberOfSides = 6;
	private int firstSideValue = 1;
	
	//METHODS
	
	//CONSTRUCTOR
	public Dice() {
		this.numberOfSides = numberOfSides;
		this.firstSideValue = firstSideValue;
	}
	
	//SPECIFIC METHODS
	
	Random random = new Random();
	
	public int throwDice() {
		int diceResult = this.firstSideValue + random.nextInt(this.numberOfSides);
		return diceResult;
	}
	
	//GETTERS
	
	public int getNumberOfSides() {
		return this.numberOfSides;
	}
	
	public int getFirstSideValue() {
		return this.firstSideValue;
	}
	
	//SETTERS
	
}