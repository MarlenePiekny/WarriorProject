public class CharacterOvertakeGameBoardException extends Exception {
	
	public CharacterOvertakeGameBoardException() {
		super("The Character square position will exceed the game board, it will take the last quare of the game board");
	}
	
	
}