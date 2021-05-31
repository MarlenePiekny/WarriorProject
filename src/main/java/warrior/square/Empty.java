package square;
import perso.*;

/**
 * <b>Class representing empty square of the game board</b>
 * 
 *  <p>An empty square is defined by this information : </p>
 * <ul>
 * 	<li>name : </li>
 * </ul>
 * 
 * <p>An empty square can have actions such as :</p>
 * <ul>
 * 	<li>interaction</li>
 * 	<li>display informations</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public class Empty extends Square {
	
	//ATTRIBUTES
	
	//METHODS
		
		//CONSTRUCTOR
		/**
	     * Default empty square constructor.
	     * <p>
	     * With the default square constructor, "empty" is given as name
	     * </p>
	     * 
	     * @see Square#Square()
	     * @see Square#name
	     */
		public Empty() {
			super("Empty");
		}
	
		//SPECIFIC METHOD
		@Override
		public int interaction(Perso perso) {
				System.out.println("There is nothing in there, nothing happens");
				return 0;
		}
		
		@Override
		public String displaySquareInformations() {
			return "You are on a empty square, nothing happens";
		}	
		
		//GETTERS

		
		//SETTERS

	
		//TO STRING
		@Override
		public String toString() {
			return "Empty [name=" + getName() + "]";
		}

		
	
}