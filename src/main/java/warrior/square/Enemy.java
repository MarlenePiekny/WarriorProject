package square;

import character.Perso;

public abstract class Enemy extends Square {
	
	//ATTRIBUTES
	private String name;
	private int lifeLevel;
	private int attackStrength;
	
		//METHODS
			
			//CONSTRUCTOR
			public Enemy() {
				this.name = "";
				this.lifeLevel = 0;
				this.attackStrength = 0;
			}
			
			public Enemy(String inputName, int inputLifeLevel, int inputAttackStrength) {
				this.name = inputName;
				this.lifeLevel = inputLifeLevel;
				this.attackStrength = inputAttackStrength;
			}

			//SPECIFIC METHOD
			@Override
			public Perso interaction(Perso perso) {
				return perso;
			}
			
			@Override
			public String displaySquareInformations() {
				return "You have reached a square where there is a " + getName() + 
						"\n Life level : " + getLifeLevel() +
						"\n Attack strength : " + getLifeLevel();
			}
			
			public void givesAHit(Perso perso) {
				System.out.println("The " + this.getName() + " gives a " + this.attackStrength + "-hit to " + perso.getName() );
				perso.setLifeLevel(this.attackStrength);
				System.out.println("The " + this.getName() + " goes away");
			}

		
			//GETTERS
			public String getName() {
				return this.name;
			}

			public int getLifeLevel() {
				return this.lifeLevel;
			}

			public int getAttackStrength() {
				return this.attackStrength;
			}

			//SETTERS
			public void setName(String name) {
				this.name = name;
			}
			
			public void setLifeLevel(int lifeLevel) {
				this.lifeLevel = lifeLevel;
			}

			public void setAttackStrength(int attackStrength) {
				this.attackStrength = attackStrength;
			}

			@Override
			public String toString() {
				return "Enemy [name=" + name + ", lifeLevel=" + lifeLevel + ", attackStrength=" + attackStrength + "]";
			}
}