
public class Team {

	private String name;
	private int punkte;
	private int tore;
	private int gegentore;

	public Team(String name) {
		this.name = name;
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
		punkte = punkte + neuePunkte;
	}

	public int getTore() {
		return tore;
	}

	public void setTore(int tore) {
		this.tore = tore;
	}

	public int getGegentore() {
		return gegentore;
	}

	public void setGegentore(int gegentore) {
		this.gegentore = gegentore;
	}

}
