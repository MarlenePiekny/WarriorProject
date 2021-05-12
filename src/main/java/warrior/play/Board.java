package play;

import java.util.*;
import square.*;
import tool.*;
import enemy.*;


public class Board {

	// ATTRIBUTES
	private int numberOfSquares;
	private int beginningSquare;
	private ArrayList<Square> tabBoard;
	private int[] dragonTab;
	private int[] sorcererTab;
	private int[] goblinTab;
	private int[] clubTab;
	private int[] swordTab;
	private int[] fireballTab;
	private int[] lightningTab;
	private int[] standardPotionTab;
	private int[] largePotionTab;
	private int[] emptyTab;
	

	// METHODS

	// CONSTRUCTOR
	public Board() {
		
		this.numberOfSquares = 64;
		this.beginningSquare = 0;
		
		this.dragonTab = new int[]{45, 52, 56, 62};
		this.sorcererTab = new int[]{10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
		this.goblinTab = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		this.clubTab = new int[]{2, 11, 5, 22, 38};
		this.swordTab = new int[]{19, 26, 42, 53, 38};
		this.fireballTab = new int[]{48, 49};
		this.lightningTab = new int[] {1, 4, 8, 17, 23};
		this.standardPotionTab = new int[]{7, 13, 31, 33, 39, 43};
		this.largePotionTab = new int[]{28, 41};
		this.emptyTab = new int[]{0, 14, 16, 29, 34, 46, 50, 51, 54, 55, 57, 58, 59, 60, 61, 63, 64};
		
		//Declare the array list made of numberOfSquares+1 number of squares
		this.tabBoard = new ArrayList<Square>(Arrays.asList(new Square[this.numberOfSquares + 1]));
		
		//Fill the tab board with the squares
		this.setSquareInTabBoard(new Dragon(), this.dragonTab);
		this.setSquareInTabBoard(new Sorcerer(), this.sorcererTab);
		this.setSquareInTabBoard(new Goblin(), this.goblinTab);
		this.setSquareInTabBoard(new Club(), this.clubTab);
		this.setSquareInTabBoard(new Sword(), this.swordTab);
		this.setSquareInTabBoard(new Fireball(), this.fireballTab);
		this.setSquareInTabBoard(new Lightning(), this.lightningTab);
		this.setSquareInTabBoard(new StandardPotion(), this.standardPotionTab);
		this.setSquareInTabBoard(new LargePotion(), this.largePotionTab);
		this.setSquareInTabBoard(new Empty(), this.emptyTab);
		
		//Randomized the board
		Collections.shuffle(tabBoard);
	};

	// SPECIFIC METHODS
	
	public void setSquareInTabBoard(int index, Square square) {
		this.tabBoard.set(index, square);
	}
	
	public void setSquareInTabBoard(Square square, int[] indexes) {
		for(int index : indexes ) {
			this.tabBoard.set(index, square);
		}
	}
	
	public void deleteEnemyInTabBoard(Enemy enemy) {
		while( this.tabBoard.indexOf(enemy) != -1) {
		this.setSquareInTabBoard(this.tabBoard.indexOf(enemy) , new Empty());
		}
	}
	
	// GETTERS

	public int getNumberOfSquare() {
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
