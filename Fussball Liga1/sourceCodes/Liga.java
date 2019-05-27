import java.util.ArrayList;

public class Liga {

	private String name;

	public ArrayList<Team> teams = new ArrayList<Team>();
	
	public Liga(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void addTeams(Team name) {
		teams.add(name);

	}

	public String toString() {

		String erg = "";

		for (int i = 0; i < teams.size(); i++) {

			erg += teams.get(i).getName() + " \n";

		}

		return erg;

	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
}
