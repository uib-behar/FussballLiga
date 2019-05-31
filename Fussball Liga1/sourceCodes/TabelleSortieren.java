import java.util.Comparator;

public class TabelleSortieren implements Comparator<Team> {
	
	
	public int compare(Team a, Team b) {
		if (a.getPunkte() > b.getPunkte()) {
			return 1;
		}
		if (a.getPunkte() < b.getPunkte()) {
			return -1;
		}
		return 0;
	}

}
