package character;
import tool.*;

public class Wizard extends Perso {

	// ATTRIBUTES
	private AttackTool spell;
	private DefenseTool philter;


	//Wizard constructor without any input
	public Wizard() {
		super("Merlin");
	}

	//Wizard constructor with name 
	public Wizard(String inputName) {
		super(inputName);
	}

	 //Wizard constructor with 4 inputs 
	public Wizard(String inputName, String inputPicture, int inputLifeLevel, int inputAttackStrength) {
		super(inputName, inputPicture, inputLifeLevel, inputAttackStrength);
	 }

	 //SPECIFIC METHODS
	@Override
	 public String welcome() {
		 return this.getName() + " here are your info : \n" 
				 + "life level : " + this.getLifeLevel() + "\n" 
				 + "attack strength : " + this.getAttackStrength();
	 }
	
	@Override
	 public String displayInformation() {
		 return "Welcome " + this.getName() + " you are a wizard! Here are your info : \n" + "life level : " + this.getLifeLevel() + 
				 "\n" + "attack strength : " + this.getAttackStrength();
	 }

	 // GETTERS
	 
	public AttackTool getSpell() {
		return this.spell;
	}

	public DefenseTool getPhilter() {
		return this.philter;
	}

	// SETTERS

	public void setSpell(AttackTool spell) {
		this.spell = spell;
	}

	public void setPhilter(DefenseTool philter) {
		this.philter = philter;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Wizard [name=" + this.getName() + ", pictureURL=" + this.getPictureURL() + ", lifeLevel=" + this.getLifeLevel()
				+ ", attackStrength=" + this.getAttackStrength() + ", spell=" + this.getSpell() + ", philter=" + this.getPhilter()
				+ "]";
	}

}