import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int spieltag = 1;
		int heimTore = 0;
		int gastTore = 0;
		
		String playMatchday = "";
		String input;
		

		Scanner sc = new Scanner(System.in);

		Liga liga1 = new Liga("Soccer League");
		Tabelle tabelle = new Tabelle();

		Team team1 = new Team("HS United", tabelle);
		Team team2 = new Team("Die Informatiker", tabelle);
		Team team3 = new Team("VFL Neckarau", tabelle);
		Team team4 = new Team("MFC 08 Lindenhof", tabelle);
		Team team5 = new Team("Uni Mannheim", tabelle);
		Team team6 = new Team("Team Hochschule", tabelle);
		Team team7 = new Team("1. FC Mannheim", tabelle);
		Team team8 = new Team("eSports 68", tabelle);

//		liga1.getTabelle().addTeams(team1);
//		liga1.getTabelle().addTeams(team2);
//		liga1.getTabelle().addTeams(team3);
//		liga1.getTabelle().addTeams(team4);
//		liga1.getTabelle().addTeams(team5);
//		liga1.getTabelle().addTeams(team6);
//		liga1.getTabelle().addTeams(team7);
//		liga1.getTabelle().addTeams(team8);

		System.out.println();
		System.out.println("Willkommen zur " + liga1.getName() + "\n");
		
		boolean weiterspielen = true;

		do {
			
			System.out.println("\n-> Tabelle \n-> Spiel");
			
			input=sc.nextLine();
			
			if(input.equals("Tabelle")) {
				System.out.println("Tabelle: \n" + tabelle.getTabelle());
			} else if(input.equals("Spiel")) {		
			System.out.println("Möchtest du einen neuen Spieltag anlegen? (j/n)");
			playMatchday = sc.nextLine();

			spieltagAnlegen(playMatchday, spieltag, sc, weiterspielen);

			System.out.print("Name der Heim-Mannschaft eingeben: ");
			String heimTeam = sc.nextLine();

			System.out.println();

			System.out.print("Name der Auswärts-Mannschaft eingeben: ");
			String auswärtsTeam = sc.nextLine();
			

			// matchAusgabe(heimTeam, auswärtsTeam);

			matchDay(heimTeam, auswärtsTeam, liga1, heimTore, gastTore, tabelle);
			System.out.println(tabelle.getTabelle());
			
			}

		} while (weiterspielen= true);
		System.out.println("Abschluss der Tabelle \n" + tabelle.getTabelle());

	}

	static boolean spieltagAnlegen(String playMatchday, int spieltag, Scanner sc, boolean weiterspielen) {

		for (;;) {

			if (playMatchday.equals("j")) {
				System.out.println("Der " + spieltag + ". Spieltag beginnt.");
				spieltag++;
				System.out.println();
				weiterspielen = true;
				break;

			} else if (playMatchday.equals("n")) {
				weiterspielen = false;
				break;

			} else
				System.out.println("falsche Eingabe. Bitte Wiederholen!");
		}
		return weiterspielen;

	}

	static void matchDay(String heimTeam, String auswärtsTeam, Liga liga1, int heimTore, int gastTore,
			Tabelle tabelle) {

		Scanner scan = new Scanner(System.in);

		Team heim = null;
		Team gast = null;

		for (Team t : tabelle.getTeams()) {
			if (t.getName().equals(heimTeam))
				heim = t;
			else if (t.getName().equals(auswärtsTeam))
				gast = t;
		}

		Spiel spiel1 = new Spiel(heim, gast);

		System.out.print("Wie war das Ergebnis? ");
		String eingabe = scan.nextLine();

		spiel1.setErgebnis(eingabe);

		if(heimTore > gastTore) {
			heim.ergebnisMatch(3, heimTore - gastTore);
			gast.ergebnisMatch(0, gastTore - heimTore);
		}else if (heimTore < gastTore) {
			heim.ergebnisMatch(0, heimTore - gastTore);
			gast.ergebnisMatch(3, gastTore - heimTore);
		} else {
			heim.ergebnisMatch(1, heimTore - gastTore);
			gast.ergebnisMatch(1, gastTore - heimTore);

		}

	//	matchAusgabe(heimTeam, auswärtsTeam, spiel1, tabelle);

	}

	static void matchAusgabe(String heimTeam, Team auswärtsTeam, Spiel spiel1, Tabelle tabelle) {
		
		Team heim = null;
		Team gast = null;
		
		for (Team tt : tabelle.getTeams()) {
			if (tt.getName().equals(heimTeam))
				heim = tt;
			else if (tt.getName().equals(auswärtsTeam))
				gast = tt;
		}

		System.out.println(heim + "  " + spiel1.getTore1() + " : " + spiel1.getTore2() + "  " + gast);

	}

	static void tabelleAnzeigen(Tabelle neueTabelle) {

	}

}