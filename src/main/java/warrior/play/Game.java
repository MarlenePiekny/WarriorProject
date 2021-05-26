package play;

import java.sql.SQLException;
import java.util.Scanner;

import exception.*;
import perso.*;
import square.*;
import tool.*;

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



		// Remind to the perso his/her place on the board
		System.out.println(perso.getName());
		System.out.println("Square " + perso.getBoardSquare() + " / " + board.getNumberOfSquares());
		
		System.out.println("Tableau" + board.getTabBoard());

		while (perso.getBoardSquare() < board.getNumberOfSquares()) {

			turnToPlay();
			
		}
		System.out.println("Congrats " + perso.getName() + " you have completed the Warrior and Wizard game");
		
		return perso;
	}

	public void turnToPlay() throws SQLException {
		
		//display perso informations
		System.out.println(perso.displayInformation());

		// Ask the perso to throw the dice
		System.out.println("Enter dice to continue to play \n" +
							"Enter exit to leave the game \n" +
							"Enter save to save your perso" )
		;
		String inputPersoInGame = keyboard.nextLine();

		switch (inputPersoInGame) {
		case "dice":
			// Throw the dice
			System.out.println("You throw the dice");
			int diceResult = dice.throwTrickDie();
			System.out.println("Dice result : " + diceResult);		
			
			
			try {
				if (perso.getBoardSquare() + diceResult > board.getNumberOfSquares()) {
					throw new PersoOvertakeGameBoardException();
				} 
			
				// the perso will remain on the game board, move the perso with the dice result
				perso.moveOnBoard(diceResult);


			} catch (PersoOvertakeGameBoardException e) {

				System.out.println(e.getMessage());
				
				// the perso will overtake the game board, move the perso to the end of the game board
				perso.setBoardSquare(board.getNumberOfSquares());

				
			}
			

			// Display the number of the square where the perso is
			System.out.println("Square " + perso.getBoardSquare() + " / " + board.getNumberOfSquares());
			
			//Check what is in the square
			Square square = board.getSquareInTabBoard(perso.getBoardSquare());
			square.interaction(perso);
			break;
			
		case "save":
			menu.savePersoInDB(this.perso);
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
	
		
		
		//METHOD TO DO NOTHING WHEN EMPTY SQUARE
		/*public void nothingHappens() {
			System.out.println("There is nothing in there, nothing happens");
		}
		*/
	
	
	
}
