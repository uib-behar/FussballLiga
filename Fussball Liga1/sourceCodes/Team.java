
public class Team {

	private String name;
	private int punkte;
	private int tordifferenz;

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
	
	public int getTordifferenz() {
		return tordifferenz;
	}
	
	public void setTordifferenz (int tordifferenz) {
		this.tordifferenz = tordifferenz;
	}

	public String toString() {
		
		return getName();
		
	}
}
