import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int spieltag = 1;

		Scanner sc = new Scanner(System.in);

		Liga liga1 = new Liga("Soccer League");

		Team team1 = new Team("HS United");
		Team team2 = new Team("Die Informatiker");
		Team team3 = new Team("VFL Neckarau");
		Team team4 = new Team("MFC 08 Lindenhof");
		Team team5 = new Team("Uni Mannheim");
		Team team6 = new Team("Team Hochschule");
		Team team7 = new Team("1. FC Mannheim");
		Team team8 = new Team("eSports 68");

		liga1.getTabelle().addTeams(team1);
		liga1.getTabelle().addTeams(team2);
		liga1.getTabelle().addTeams(team3);
		liga1.getTabelle().addTeams(team4);
		liga1.getTabelle().addTeams(team5);
		liga1.getTabelle().addTeams(team6);
		liga1.getTabelle().addTeams(team7);
		liga1.getTabelle().addTeams(team8);

		System.out.println();
		System.out.println("Willkommen zur " + liga1.getName() + "\n");

		do {

			spieltagAnlegen(spieltag, sc);
			spieltag++;

			System.out.print("Name der Heim-Mannschaft eingeben: ");
			String heimTeam = sc.nextLine();

			System.out.println();

			System.out.print("Name der Auswärts-Mannschaft eingeben: ");
			String auswärtsTeam = sc.nextLine();

			// matchAusgabe(heimTeam, auswärtsTeam);

			matchDay(heimTeam, auswärtsTeam, liga1);

			// System.out.println(liga1.toString());

		} while (spieltagAnlegen(spieltag, sc) == true);
		System.out.println("Abschluss der Tabelle: ");
		// tabelleAnzeigen(neueTabelle);

	}

	static boolean spieltagAnlegen(int spieltag, Scanner sc) {

		boolean weiterspielen = true;

		for (;;) {

			System.out.println("Möchtest du einen neuen Spieltag anlegen? (j/n)");
			String playMatchday = sc.nextLine();

			if (playMatchday.equals("j")) {
				System.out.println("Der " + spieltag + ". Spieltag beginnt.");
				System.out.println();
				break;

			} else if (playMatchday.equals("n")) {
				return false;

			} else
				System.out.println("falsche Eingabe. Bitte Wiederholen!");
		}

		return true;

	}

	static void matchDay(String heimTeam, String auswärtsTeam, Liga liga1) {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < liga1.getTabelle().getTeams().size(); i++) {

			if (liga1.getTabelle().getTeams().get(i).equals(heimTeam))
				heimTeam = liga1.getTabelle().getTeams().get(i).getName();

			else if (liga1.getTabelle().getTeams().get(i).equals(auswärtsTeam))
				auswärtsTeam = liga1.getTabelle().getTeams().get(i).getName();
		}

			Spiel spiel1 = new Spiel(spiel1.getMannschaft1(),spiel1.getMannschaft2());

			System.out.print("Wie war das Ergebnis? ");
			String eingabe = scan.nextLine();

			spiel1.setErgebnis(eingabe);

			matchAusgabe(heimTeam, auswärtsTeam, spiel1);

	}

	static void matchAusgabe(Team heimTeam, Team auswärtsTeam, Spiel spiel1) {

		System.out.println(heimTeam + "  " + spiel1.getTore1() + " : " + spiel1.getTore2() + "  " + auswärtsTeam);

	}

	static int countPoints(Team punkte) {

		int neuePunkte = 0;

		return neuePunkte;
	}

	static void tabelleAnzeigen(Tabelle neueTabelle) {

	}

}