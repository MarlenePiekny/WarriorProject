package play;

import java.sql.SQLException;
import java.util.Scanner;

import exception.*;
import perso.*;
import square.*;

//GAME START

public class Game {

	// ATTRIBUTES
	private Board board;
	private Dice dice;
	private Scanner keyboard;
	private Menu menu;
	private Perso perso;

	// METHODS

	// CONSTRUCTOR
	public Game(Perso playingPerso) {
		this.board  = new Board();
		this.dice = new Dice();
		this.keyboard  = new Scanner(System.in);
		this.menu = new Menu();
		this.perso = playingPerso;

	}

	// SPECIFIC METHODS

	public Perso startGame() throws SQLException {
		
		System.out.println("Game board : " + board);

		while (perso.getBoardSquare() < board.getNumberOfSquares()) {

			turnToPlay();
			
		}
		System.out.println("Congrats " + perso.getName() + " you have completed the Warrior and Wizard game");
		
		return perso;
	}
	
	/**
     * Moves on board.
     * <p>Moves the perso board square position.</p>
     * 
     * @param move
     * 		The number squares to move
     * 
     * @see Perso#boardSquare
     */
	public void movesOnBoard(int move) {
		try {	
			if (perso.getBoardSquare() + move > board.getNumberOfSquares() ) {
				throw new PersoOvertakeGameBoardException();
			}
			if (perso.getBoardSquare() + move < board.getBeginningSquare() ) {
				throw new PersoOvertakeGameBoardException();
			}
		} catch ( PersoOvertakeGameBoardException e ) {
			
		}
		perso.setBoardSquare(perso.getBoardSquare() + move);
	}
	
	
	/**
     * Perso turn to play.
     * <p>Game play for a perso in a turn.</p>
     * 
     * @param move
     * 		The number squares to move
     * 
     * @see Perso#displayInformation()
     * @see Dice#throwDice()
     * @see Perso#getBoardSquare()
     * @see Board#getNumberOfSquares()
     * @see Game#movesOnBoard(int)
     * @see Perso#setBoardSquare(int)
     * 
     * @throws SQLException if the SQL doesn't work
     */
	public void turnToPlay() throws SQLException {
		
		//display perso informations
		displayPersoDetails();

		// Ask the perso to throw the dice
		
		System.out.println(
				"\n" +
				"This is your turn to play \n" +
				"Throw the dice to continue to play ----- enter dice \n" +
				"Leave the game without saving ---------- enter exit \n" +
				"Save and leave the game ---------------- enter save \n \n" +
				"--------------------------------------------------- \n");

		String inputPersoInGame = keyboard.nextLine();

		switch (inputPersoInGame) {
		case "dice":
			// Throw the dice
			System.out.println("You throw the dice");
			int diceResult = dice.throwDice();
			System.out.println("Dice result : " + diceResult);		
			
			
			try {
				if (perso.getBoardSquare() + diceResult > board.getNumberOfSquares()) {
					throw new PersoOvertakeGameBoardException();
				} 
			
				// the perso will remain on the game board, move the perso with the dice result
				this.movesOnBoard(diceResult);


			} catch (PersoOvertakeGameBoardException e) {

				System.out.println(e.getMessage());
				
				// the perso will overtake the game board, move the perso to the end of the game board
				perso.setBoardSquare(board.getNumberOfSquares());

				
			}
			

			// Display the perso details
			this.displayPersoDetails();
			
			//Check what is in the square
			Square square = board.getSquareInTabBoard(perso.getBoardSquare());
			int squareToGoBack = square.interaction(perso);
			
			movesOnBoard(squareToGoBack);
			
			break;
			
		case "save":
			menu.savePerso(this.perso);
			System.out.println("Your perso has been saved, you will leave the game");
			menu.endGame();
			break;	
		case "exit":
			menu.endGame();
			break;
			
		default:
			System.out.println("This word doesn't match the choices");
		}
	}
	
	public void displayPersoDetails() {
		System.out.println("      --------------------------- \n" +
						   "     |  "  + perso.getName() + "\n" +
						   "     |  Life level : " + perso.getLifeLevel() + "          | \n" +
						   "     |  Attack strength : " + perso.getAttackStrength() + "     | \n" +
						   "     |  Square position " + perso.getBoardSquare() + " / " + board.getNumberOfSquares() + "   | \n" +
					   	   "      --------------------------- \n");
	}	
}
