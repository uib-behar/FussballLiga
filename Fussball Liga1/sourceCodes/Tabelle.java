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

	public String getTabelle() {
		String s = "Team\tTordifferenz\tPunkte\n";

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

//	public static Tabelle bubblesort (Tabelle tab) {
//		
//			ArrayList<Team> neueTeams = ArrayList <>();
//
//			for(int i = 1; i < tab.teams.size(); i++) {
//				for(int j = 0; j < tab.teams.size()-i; j++) {
//
//					if(tab.teams.get(j).getPunkte() > tab.teams.get(j+1).getPunkte() {
//						
//						neueTeams.add()
//						
//						
//						
//						
//						
//						temp=zusortieren[j];
//						zusortieren[j]=zusortieren[j+1];
//						zusortieren[j+1]=temp;
//
//					}
//				}
//
//			}
//			
//			return zusortieren;
//
//		}


	}

}
