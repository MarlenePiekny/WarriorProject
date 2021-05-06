package warrior.play;

import java.util.Scanner;
import warrior.character.*;
import warrior.exception.*;

//GAME START

public class Game {

	// ATTRIBUTES
	private Board board = new Board();
	private Dice dice = new Dice();
	private Scanner keyboard = new Scanner(System.in); ;
	private Menu menu = new Menu();
	private Perso perso;
	private int persoSquare = 1; //in our case called with perso.getBoardSquare()

	// METHODS

	// CONSTRUCTOR
	public Game(Perso playingPerso) {
		this.board = board;
		this.dice = dice;
		this.keyboard = keyboard;
		this.menu = menu;
		this.perso = playingPerso;
		this.persoSquare = persoSquare;
	}

	// SPECIFIC METHODS

	public Perso startGame() {


		// Place the perso on the first square
		perso.onBoard(board);
		//putPersoToTheBeginning(perso);

		// Remind to the perso his/her place on the board
		System.out.println(perso.getName());
		System.out.println("Square " + persoSquare + " / " + board.getNumberOfSquare());

		while (persoSquare < board.getNumberOfSquare()) {

			turnToPlay(perso);
		}
		return perso;
	}

	public Perso turnToPlay(Perso perso) {
		// display the board
		//System.out.println(board.getTabBoard());

		// Ask the perso to throw the dice
		System.out.println("Enter dice to continue to play or exit to leave the game");
		String inputPersoInGame = keyboard.nextLine();

		switch (inputPersoInGame) {
		case "dice":
			// Throw the dice
			System.out.println("You throw the dice");
			int diceResult = dice.throwTrickDie();
			System.out.println("Dice result : " + diceResult);

			// Remove the perso from his/her current square
			

			// Move the perso to the appropriated square

			try {

				// the perso will remain on the game board, move the perso with the dice result
				perso.moveOnBoard(diceResult);
				
				persoSquare = movePersoOnBoard(diceResult);

				

			} catch (PersoOvertakeGameBoardException e) {

				System.out.println(e.getMessage());

				// the perso will overtake the game board, move the perso to the end of
				// the game board
				perso.setBoardSquare(board.getNumberOfSquare());
				persoSquare = board.getNumberOfSquare();

				// Actualization of the board
				//movePersoToTheEnd(perso); TO DELETE IF WORKING
			}

			// Display the square of the perso
			System.out.println("Square " + persoSquare + " / " + board.getNumberOfSquare());
			
			//Check what is in the square
			

			break;
		case "exit":
			menu.endGame();
			break;
		default:
			System.out.println("This word doesn't match the choices");
		}
		return perso;
	}
	
	// METHOD TO MOVE THE CHARACTER ON THE BOARD
	
		public int movePersoOnBoard(int diceResult) throws PersoOvertakeGameBoardException {
			if (persoSquare + diceResult > board.getNumberOfSquare()) {
				throw new PersoOvertakeGameBoardException();
			} else {
				//board.setValueInTabBoard(persoSquare, perso.getName() );
				persoSquare += diceResult;
			}
		return persoSquare;
		}
	
	
		/*
		public void putPersoToTheBeginning(Perso perso) {
			board.setValueInTabBoard(board.getBeginningSquare(), character.getName() );
		}

		public void putPersoInBoard(Perso perso) throws PersoOvertakeGameBoardException {
			if (perso.getBoardSquare() > board.getNumberOfSquare()) {
				throw new PersoOvertakeGameBoardException();
			} else {
				board.setValueInTabBoard(perso.getBoardSquare(), perso.getName() );
			}
			
		}

		public void removePersoInBoard(Perso perso) {
			board.setValueInTabBoard(perso.getBoardSquare(),  null);
		}
		
		public void movePersoToTheEnd(Perso perso) {
			board.setValueInTabBoard(board.getNumberOfSquare(), perso.getName() );
		}
		*/
	
}
