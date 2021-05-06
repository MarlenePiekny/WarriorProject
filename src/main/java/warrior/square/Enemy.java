package warrior.square;

import warrior.character.Perso;

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
			public abstract Perso interaction(Perso perso);

		
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