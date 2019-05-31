import java.util.ArrayList;

public class Tabelle {

	ArrayList<Spieltag> arrSpieltage = new ArrayList<>();

	private ArrayList<Team> teams;

	public Tabelle() {
		teams = new ArrayList<>();
	}

	void addTeams(Team name) {
		teams.add(name);
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public String toString() {

		String erg = "";

		for (int i = 0; i < teams.size(); i++) {
			erg += teams.get(i).getName() + " \n";

		}

		return erg;
	}

	public void tabelleSortieren() {
		
		Team temp = null;

		for(int i = 0; i<teams.size(); i++) {
			for(int j = i+1; j<teams.size(); j++) {
				if(teams.get(i).getPunkte() < teams.get(j).getPunkte()){
					temp = teams.get(i);
					teams.set(i, teams.get(j));
					teams.set(j, temp);
				}
			}
		}
	}

	public String getTabelle() {
		String s = "Team\tTordifferenz\tPunkte\n";

		tabelleSortieren();

		for (Team t : teams) {
			s += t.toString() + "\n";
		}
		return s;
	}

	void addSpieltag(Spieltag spieltag) {

		for (int i = 0; i < arrSpieltage.size(); i++) {

			arrSpieltage.add(spieltag);
		}

	}


}
