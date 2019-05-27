
public class Team {

	private String name;
	private int rang;
	private int punkte = 0;
	private int tordifferenz = 0;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int neuePunkte) {
		punkte = punkte + neuePunkte;
	}
	
	public int getTordifferenz() {
		return tordifferenz;
	}
	
	public void setTordifferenz (int tordifferenz) {
		this.tordifferenz = tordifferenz;
	}

}
