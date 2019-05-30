
public class Team {

	private String name;
	private int punkte;
	private int tore = 0;;

	public Team(String name, Tabelle tabelle) {
		this.name = name;
		tabelle.addTeams(this);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int neuePunkte) {
		this.punkte = punkte;
	}

	public int getTore() {
		return tore;
	}

	public void setTore(int tore) {
		this.tore = tore;
	}
	
	public void ergebnisMatch (int punkte, int tore) {
		this.punkte = this.punkte + punkte;
		this.tore = this.tore + tore;
	}

	public String toString() {

		return getName() + "\t" + getTore() + "\t" + getPunkte();

	}
}
