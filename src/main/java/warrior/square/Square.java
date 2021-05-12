package square;
import character.*;

/**
 * <b>Class representing square of the game board</b>
 * 
 * <p>A square is defined by this information : </p>
 * <ul>
 * 	<li>name : </li>
 * </ul>
 * 
 * <p>A square can have actions such as :</p>
 * <ul>
 * 	<li>interaction</li>
 * 	<li>display informations</li>
 * </ul>
 * 
 * @author Marlène
 * @version 1.0
 */

public abstract class Square {
	
	//ATTRIBUTES
	/**
     * The square name, it is editable.
     * 
     *	@see Square#getName()
     *	@see Square#setName(String)
     */
	private String name;
	
	//METHODES
	
		//CONSTRUCTOR
		/**
	     * Default square constructor.
	     * <p>With the default square constructor, no name is given. </p>
	     * 
	     * @see Square#name
	     */
		public Square() {
			this("");
		}
		
		/**
	     * Name customized square constructor.
	     * <p>With the default square constructor, a name can be given. </p>
	     * 
	     * @see Square#name
	     */
		public Square(String name) {
			this.name = name;
		}
		
		//SPECIFIC METHODS
		/**
	     * Interaction with the square.
	     * <p>When the perso is on the square position, it display the square informations. </p>
	     * 
	     * @param perso
	     * 
	     * @see Square#toString()
	     * @see Square#displaySquareInformations()
	     */
		public void interaction(Perso perso) {
			System.out.println( this.toString() );
			System.out.println( this.displaySquareInformations() );
		}
		
		/**
	     * Display square informations.
	     * <p>Display the square informations. </p>
	     * 
	     * @return String
	     * 
	     */
		public abstract String displaySquareInformations();
		
	
		//GETTER
		public String getName() { 
			return name;
		}
	
		//SETTER
		public void setName(String name) {
			this.name = name;
		}

		//TO STRING
		@Override
		public String toString() {
			return "Square [name=" + getName() + "]";
		}
		
		
}