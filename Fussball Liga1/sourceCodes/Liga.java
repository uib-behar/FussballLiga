import java.util.ArrayList;

public class Liga {

	private String name;

	private ArrayList<Team> teams = new ArrayList<>();

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
}
