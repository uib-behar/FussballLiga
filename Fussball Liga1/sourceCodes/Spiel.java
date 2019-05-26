import java.util.Date;

public class Spiel {

	private Team mannschaft1;
	private Team mannschaft2;

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

}
