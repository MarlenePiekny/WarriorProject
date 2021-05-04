

import java.util.Arrays;

public class Board {

	// ATTRIBUTES
	private int numberOfSquares = 64;
	private int beginningSquare = 1;
	private String tabBoard[] = new String[numberOfSquares + 1];

	// METHODS

	// CONSTRUCTOR
	public Board() {
		this.tabBoard = tabBoard;
	};

	// SPECIFIC METHODS
	
	public void putCharacterToTheBeginning(Character character) {
		this.tabBoard[beginningSquare] = character.getName();
	}

	public void putCharacterInBoard(Character character) throws CharacterOvertakeGameBoardException {
		if (character.getBoardSquare() > numberOfSquares) {
			throw new CharacterOvertakeGameBoardException();
		} else {
			this.tabBoard[character.getBoardSquare()] = character.getName();
		}
		
	}

	public void removeCharacterInBoard(Character character) {
		this.tabBoard[character.getBoardSquare()] = null;
	}
	
	public void moveCharacterToTheEnd(Character character) {
		this.tabBoard[numberOfSquares +1] = character.getName();
	}

	// GETTERS

	public int getNumberOfSquare() {
		return this.numberOfSquares;
	}

	public int getBeginningSquare() {
		return this.beginningSquare;
	}

	public String getTabBoard() {
		return Arrays.toString(tabBoard);
	}

	// SETTERS

	@Override
	public String toString() {
		return "Board [numberOfSquares=" + numberOfSquares + ", beginningSquare=" + beginningSquare + ", tabBoard="
				+ Arrays.toString(tabBoard) + "]";
	}

	// TO STRING

}
