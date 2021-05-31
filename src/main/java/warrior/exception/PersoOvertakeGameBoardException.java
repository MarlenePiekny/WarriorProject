package exception;

public class PersoOvertakeGameBoardException extends Exception {
	
	public PersoOvertakeGameBoardException() {
		super("The Character square position will exceed the game board, it will go to the limit of the board");
	}
	
	
}