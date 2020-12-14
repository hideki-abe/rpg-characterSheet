package character.sheet.data;

public class Atributes {

	private int str;
	private int strModifier;
	private int dex;
	private int dexModifier;
	private int con;
	private int conModifier;
	private int intel;
	private int intelModifier;
	private int tech;
	private int techModifier;
	private int cha;
	private int chaModifier;

	public Atributes(int str, int dex, int con, int intel, int tech, int cha) {
		this.str = str;
		this.modifier(str);
		this.dex = dex;
		this.modifier(dex);
		this.con = con;
		this.modifier(con);
		this.intel = intel;
		this.modifier(intel);
		this.tech = tech;
		this.modifier(tech);
		this.cha = cha;
		this.modifier(cha);
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str += str;
	}

	public int getStrModifier() {
		return strModifier;
	}

	public void setStrModifier(int strModifier) {
		this.strModifier += strModifier;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex += dex;
	}

	public int getDexModifier() {
		return dexModifier;
	}

	public void setDexModifier(int dexModifier) {
		this.dexModifier = dexModifier;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con += con;
	}

	public int getConModifier() {
		return conModifier;
	}

	public void setConModifier(int conModifier) {
		this.conModifier += conModifier;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel += intel;
	}

	public int getIntelModifier() {
		return intelModifier;
	}

	public void setIntelModifier(int intelModifier) {
		this.intelModifier = intelModifier;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}

	public int getTechModifier() {
		return techModifier;
	}

	public void setTechModifier(int techModifier) {
		this.techModifier += techModifier;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha += cha;
	}

	public int getChaModifier() {
		return chaModifier;
	}

	public void setChaModifier(int chaModifier) {
		this.chaModifier += chaModifier;
	}

	private int modifier(int atribute) {

		return (atribute / 2) - 5;
	}
	
	public void attModifiers() {
		
		this.setStrModifier(this.modifier(this.str));
		this.setDexModifier(this.modifier(this.dex));
		this.setConModifier(this.modifier(this.con));
		this.setIntelModifier(this.modifier(this.intel));
		this.setTechModifier(this.modifier(this.tech));
		this.setChaModifier(this.modifier(this.cha));
	}
	
	@Override
	public String toString() {
		// int str, int dex, int con, int intel, int tech, int cha
		
		return String.format(
				"\nAtributes: \nstr = %d(%d)\ndex = %d(%d)\ncon = %d(%d)\nintel = %d(%d)\ntech = %d(%d)\ncha = %d(%d)",
				this.str, this.strModifier, this.dex, this.dexModifier, this.con, this.conModifier, this.intel,
				this.intelModifier, this.tech, this.techModifier, this.cha, this.chaModifier);
	}
}
