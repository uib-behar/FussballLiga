import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int spieltag = 1;

		Scanner sc = new Scanner(System.in);

		Liga liga1 = new Liga("1. Soccer League");

		Team team1 = new Team("HS United");
		Team team2 = new Team("Fachschaft Informatik");
		Team team3 = new Team("VFL Neckarau");
		Team team4 = new Team("MFC 08 Lindenhof");
		Team team5 = new Team("Uni Mannheim");
		Team team6 = new Team("Team Hochschule");

		liga1.addTeams(team1);
		liga1.addTeams(team2);
		liga1.addTeams(team3);
		liga1.addTeams(team4);
		liga1.addTeams(team5);
		liga1.addTeams(team6);

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

		matchAusgabe(heimTeam, auswärtsTeam);

		matchDay(heimTeam, auswärtsTeam, liga1);

	//System.out.println(liga1.toString());

	 } while (spieltagAnlegen(spieltag, sc) == true);
		System.out.println("Abschluss der Tabelle: ");
		// tabelleAnzeigen(neueTabelle);

	}

	static boolean spieltagAnlegen(int spieltag, Scanner sc) {

		boolean weiterspielen = true;

		for (;;) {

			System.out.println("Möchtest du einen neuen Spieltag anlegen? (j/n)");
			String matchday = sc.nextLine();

			if (matchday.equals("j")) {
				System.out.println("Der " + spieltag + ". Spieltag beginnt.");
				System.out.println();
				break;

			} else if (matchday.equals("n")) {
				return false;

			} else
				System.out.println("falsche Eingabe. Bitte Wiederholen!");
		}

		return true;

	}

	static void matchDay(String heimTeam, String auswärtsTeam, Liga liga1) {
		
		String heimteam = "";
		String auswärtsteam = "";

		Scanner scan = new Scanner(System.in);

			for (Team teamQ : liga1.teams) {
				if (teamQ.getName().equals(heimTeam))
					heimteam = heimTeam;
			}

			for (Team teamR : liga1.teams) {
				if (teamR.getName().equals(auswärtsTeam))
					auswärtsteam = auswärtsTeam;

			}

			System.out.print("Wie war das Ergebnis? ");

			String ergebnis = scan.nextLine();

			String[] ergebnisArray = ergebnis.split(":");

			System.out.println(
					heimTeam + "  " + ergebnisArray[0] + " : " + ergebnisArray[1] + "  " + auswärtsTeam);

		}

	static void matchAusgabe(String heimTeam, String auswärtsTeam) {

		System.out.println(" \nEs spielt " + heimTeam + " gegen " + auswärtsTeam + "\n");

	}

	static int countPoints(Team punkte) {

		int neuePunkte = 0;

		return neuePunkte;
	}

	static void tabelleAnzeigen(Tabelle neueTabelle) {
		
		

	}

}