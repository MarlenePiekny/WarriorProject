package play;

import square.Square;

/**
 * <b>Interface representing the game board</b>
 * 
 * <p>A game board can have actions such as :</p>
 * <ul>
 * 	<li>addSquare : </li>
 * </ul>
 * 
 * @author Marlene
 * @version 1.0
 */

public interface GameBoard {
	
	//Methods

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
	void setSquareInTabBoard(Square square, int[] indexes);

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
	void setSquareInTabBoard(int index, Square square);

	int getNumberOfSquares();

	Square getSquareInTabBoard(int boardSquare);
	
	
}
