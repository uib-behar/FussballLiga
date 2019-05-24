import java.util.Date;

public class Spiel {

	private Team team1;
	private Team team2;
	private int spieltag;
	private String ergebnis;

	public Spiel(Team team1, Team team2, int spieltag, String ergebnis) {

		this.team1 = team1;
		this.team2 = team2;
		this.spieltag = spieltag;
		this.ergebnis = ergebnis;

	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public int getSpieltag() {
		return spieltag;
	}

	public void setSpieltag(int spieltag) {
		this.spieltag = spieltag;
	}

	public String getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(String ergebnis) {
		this.ergebnis = ergebnis;
	}

}
