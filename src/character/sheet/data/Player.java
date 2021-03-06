package character.sheet.data;

import javax.swing.JOptionPane;

public class Player {

	private String playerName;
	private String characterName;
	private CharacterClass classe;
	private Race race;
	private String origin;
	private int level;
	private double experience;
	private Atributes atributes;
	private int hitPoints;
	private int speed;

	public Player(String playerName, String characterName, CharacterClass classe, Race race, String origin, int level,
			double experience, Atributes atributes, int hitPoints, int speed) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.classe = classe;
		this.race = race;
		this.origin = origin;
		this.level = level;
		this.experience = experience;
		this.atributes = atributes;
		this.hitPoints = hitPoints;
		this.speed = speed;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public CharacterClass getClasse() {
		return classe;
	}

	public void setClasse(CharacterClass classe) {
		this.classe = classe;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public Atributes getAtributes() {
		return atributes;
	}

	public void setAtributes(Atributes atributes) {
		// this.race.toString().equals("Human");
		if (this.race.toString().equals("Human")) {
			this.atributes = atributes;
			int cha = this.atributes.getCha();
			this.atributes.setCha(cha + 1);
			int str = this.atributes.getStr();
			this.atributes.setStr(str + 1);
			int con = this.atributes.getCon();
			this.atributes.setCon(con + 1);
			int intel = this.atributes.getIntel();
			this.atributes.setIntel(intel + 1);
			int dex = this.atributes.getDex();
			this.atributes.setDex(dex + 1);
			int tech = this.atributes.getTech();
			this.atributes.setTech(tech + 1);
		}

		this.atributes = atributes;
	}

	public int getHitPoints() {
		if (this.classe.toString().equals("Hacker")) {
			// hp base = 4
			return this.hitPoints += this.atributes.getConModifier() + 4;

		} else if (this.classe.toString().equals("Medic")) {
			// hp base = 8
			return this.hitPoints += this.atributes.getConModifier() + 8;
		} else if (this.classe.toString().equals("Ambusher")) {
			// hp base = 3
			return this.hitPoints += this.atributes.getConModifier() + 3;
		} else if (this.classe.toString().equals("Sniper")) {
			// hp base = 5
			return this.hitPoints += this.atributes.getConModifier() + 5;
		} else if (this.classe.toString().equals("Mercenary")) {
			// hp base = 6
			return this.hitPoints += this.atributes.getConModifier() + 6;
		} else
			return 0;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() {

		if (this.classe.toString().equals("Medic")) {
			this.speed = 25;
		} else 
		if (this.classe.toString().equals("Sniper")) {
			this.speed = 15;
		} else {
			this.speed = 121;
		}

	}

	@Override
	public String toString() {
//		String playerName, String characterName, CharacterClass classe, Race race, String origin, int level,
//		double experience, Atributes atributes, int hitPoints, int speed

		String message = String.format(
				"Player name: %s\nCharacter name: %s\nRace: %s\nClass: %s\nOrigin: %s\nLevel: %d\nExperience: %.1f\nHP: %d\nSpeed: %d",
				this.playerName, this.characterName, this.race.toString(), this.classe.toString(), this.origin,
				this.level, this.experience, this.getHitPoints(), this.speed) + this.atributes;
		JOptionPane.showMessageDialog(null, message);
		return "Fim do programa";
	}

}
