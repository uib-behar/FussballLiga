import java.util.Date;

public class Spiel {

	private Team mannschaft1;
	private Team mannschaft2;
	private int tore1;
	private int tore2;

	public Spiel(Team mannschaft1, Team mannschaft2) {

		this.mannschaft1 = mannschaft1;
		this.mannschaft2 = mannschaft2;

	}

	public Team getMannschaft1() {
		return mannschaft1;
	}

	public void setMannschaft1(Team mannschaft1) {
		this.mannschaft1 = mannschaft1;
	}

	public Team getMannschaft2() {
		return mannschaft2;
	}

	public void setMannschaft2(Team mannschaft2) {
		this.mannschaft2 = mannschaft2;
	}

	void setErgebnis (String ergebnis) {

		String[] result = ergebnis.split(":");

		tore1 = Integer.parseInt(result[0]);
		tore2 = Integer.parseInt(result[1]);

	}

	public int getTore1() {
		return tore1;
	}

	public int getTore2() {
		return tore2;

	}

}
