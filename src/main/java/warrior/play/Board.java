package play;

import java.util.*;
import square.*;
import tool.*;
import enemy.*;

/**
 * <b>Class representing the game board</b>
 * 
 * <p>A game board is defined by those informations : </p>
 * <ul>
 * 	<li>number of squares : </li>
 * 	<li>beginning square : </li>
 * 	<li>ordered list of square : </li>
 * </ul>
 * 
 * <p>A game board can have actions such as :</p>
 * <ul>
 * 	<li>set a square in the ordered list of square</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */
public class Board implements GameBoard {

	// ATTRIBUTES
	/**
     * The number of squares of the game board
     * 
     * @see Board#getNumberOfSquares()
     * @see Board#setNumberOfSquares(int)
     */
	private int numberOfSquares;
	
	/**
     * The value of the first square
     * 
     * @see Board#getBeginningSquare()
     * @see Board#setBeginningSquare(int)
     */
	private int beginningSquare;
	
	/**
     * The ordered list of square forming the game board
     * 
     * @see Board#getTabBoard()
     */
	private ArrayList<Square> tabBoard;
	

	// METHODS

	// CONSTRUCTOR
	/**
     * Default game board constructor.
     * <p>A game board made of 65 squares starting from 0 with randomized and various squares types. </p>
     * 
     * @see Board#numberOfSquares
     * @see Board#beginningSquare
     * @see Board#tabBoard
     */
	public Board() {
		
		this.numberOfSquares = 64;
		this.beginningSquare = 0;
		
		//Specify where are supposed to be all the square types
		int[] dragonTab = new int[]{45, 52, 56, 62};
		int[] sorcererTab = new int[]{10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
		int[] goblinTab = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		int[] clubTab = new int[]{2, 11, 5, 22, 38};
		int[] swordTab = new int[]{19, 26, 42, 53, 38};
		int[] fireballTab = new int[]{48, 49};
		int[] lightningTab = new int[] {1, 4, 8, 17, 23};
		int[] standardPotionTab = new int[]{7, 13, 31, 33, 39, 43};
		int[] largePotionTab = new int[]{28, 41};
		int[] emptyTab = new int[]{0, 14, 16, 29, 34, 46, 50, 51, 54, 55, 57, 58, 59, 60, 61, 63, 64};
		
		//Declare the array list made of numberOfSquares+1 number of squares
		this.tabBoard = new ArrayList<Square>(Arrays.asList(new Square[this.numberOfSquares + 1]));
		
		//Fill the tab board with the squares
		this.setSquareInTabBoard(new Dragon(), dragonTab);
		this.setSquareInTabBoard(new Sorcerer(), sorcererTab);
		this.setSquareInTabBoard(new Goblin(), goblinTab);
		this.setSquareInTabBoard(new Club(), clubTab);
		this.setSquareInTabBoard(new Sword(), swordTab);
		this.setSquareInTabBoard(new Fireball(),fireballTab);
		this.setSquareInTabBoard(new Lightning(), lightningTab);
		this.setSquareInTabBoard(new StandardPotion(), standardPotionTab);
		this.setSquareInTabBoard(new LargePotion(), largePotionTab);
		this.setSquareInTabBoard(new Empty(), emptyTab);
		
		//Randomized the board
		Collections.shuffle(tabBoard);
	};

	// SPECIFIC METHODS
	

	/**
     * Set a square in the board
     * <p>It set a specific type of square to a specified index.</p>
     * 
     * @param index
     * 		The index of the game tab board
     * @param square
     * 		The kind of square to set in the game board
     * 
     * @see Board#tabBoard
     * 
     */
	@Override
	public void setSquareInTabBoard(int index, Square square) {
		this.tabBoard.set(index, square);
	}
	
	/**
     * Set squares in the board
     * <p>It set number of specific type of square to several index.</p>
     * 
     * @param indexes
     * 		The array list of indexes to be set in the game tab board
     * @param square
     * 		The kind of square to set in the game board
     * 
     * @see Board#tabBoard
     * 
     */
	@Override
	public void setSquareInTabBoard(Square square, int[] indexes) {
		for(int index : indexes ) {
			this.tabBoard.set(index, square);
		}
	}
	
	// GETTERS

	public int getNumberOfSquares() {
		return this.numberOfSquares;
	}

	public int getBeginningSquare() {
		return this.beginningSquare;
	}
	
	public Square getSquareInTabBoard(int index) {
		return tabBoard.get(index);
	}
	
	public ArrayList<Square> getTabBoard() {
		return tabBoard;
	}
	 

	// SETTERS

	public void setNumberOfSquares(int numberOfSquares) {
		this.numberOfSquares = numberOfSquares;
	}

	public void setBeginningSquare(int beginningSquare) {
		this.beginningSquare = beginningSquare;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Board [numberOfSquares=" + numberOfSquares + ", beginningSquare=" + beginningSquare + ", tabBoard="
				+ tabBoard + "]";
	}

	

}
