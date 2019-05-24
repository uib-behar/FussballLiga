import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		Liga liga1 = new Liga ("1. deutsche Liga");
		
		Team team1 = new Team ("HS United");
		Team team2 = new Team ("SV Mannheim");
		
		Spiel spiel1 = new Spiel (team1, team2, 1 , "2:0" );
		
		liga1.addTeams(team1);
		liga1.addTeams(team2);
		System.out.println();
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");
		
		System.out.println(now.format(df));
		
		
		System.out.println("Willkommen zur " + liga1.getName() + "\n");
		
		System.out.println(liga1.toString());
		
		
	}

}