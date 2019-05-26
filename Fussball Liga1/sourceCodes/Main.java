import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Liga liga1 = new Liga("1. Soccer League");

		Team team1 = new Team("HS United");
		Team team2 = new Team("Fachschaft Informatik");
		Team team3 = new Team("VFL Neckarau");
		Team team4 = new Team("MFC 08 Lindenhof");
		Team team5 = new Team("Uni Mannheim");
		Team team6 = new Team("Team Hochschule");

		Spiel spiel1 = new Spiel(team1, team2);
		Spiel spiel2 = new Spiel(team3, team4);
		Spiel spiel3 = new Spiel(team5, team6);

		liga1.addTeams(team1);
		liga1.addTeams(team2);
		liga1.addTeams(team3);
		liga1.addTeams(team4);
		liga1.addTeams(team5);
		liga1.addTeams(team6);

		System.out.println();

		System.out.println("Willkommen zur " + liga1.getName() + "\n");

		spieltagAnlegen(sc);

		System.out.print("Name der Heim-Mannschaft eingeben: ");
		String heimTeam = sc.nextLine();

		System.out.println();

		System.out.print("Name der Auswärts-Mannschaft eingeben: ");
		String auswärtsTeam = sc.nextLine();
		
		matchAusgabe(heimTeam, auswärtsTeam);
		
		matchDay(heimTeam, auswärtsTeam, teams);

		System.out.println(liga1.toString());

	}

	static void spieltagAnlegen(Scanner sc) {

		int spieltag = 0;

		for (;;) {

			System.out.println("Möchtest du einen neuen Spieltag anlegen? (j/n)");

			String matchday = sc.nextLine();

			if (matchday.equals("j")) {
				spieltag++;
				System.out.println("Der " + spieltag + ". Spieltag beginnt.");
				System.out.println();
				break;
			} else if (matchday.equals("n")) {
				break;

			} else
				System.out.println("falsche Eingabe. Bitte Wiederholen!");
		}

	}

	static void matchDay (String heimTeam, String auswärtsTeam, ArrayList <Team> teams) {

		for (Team teamQ : teams) {

			if (teamQ.getName().equals(heimTeam)) {

				if(teamQ.getName().equals(auswärtsTeam)) {
					
					Scanner scan = new Scanner(System.in);
					
					String ergebnis = scan.nextLine();
					
					String[] ergebnisArray = ergebnis.split(":");
					
					System.out.println(heimTeam + "  " + ergebnisArray[0] + " : " + ergebnisArray[1] + "  " + auswärtsTeam);

				}

			}

		}

	}
	
	static void matchAusgabe(String heimTeam, String auswärtsTeam) {
		
		System.out.println("Es spielt " + heimTeam + " gegen " + auswärtsTeam + "\n");

	}

}