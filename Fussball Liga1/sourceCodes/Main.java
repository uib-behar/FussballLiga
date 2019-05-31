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
		Team team2 = new Team("UIBler MA", tabelle);
		Team team3 = new Team("Waldhof MA", tabelle);
		Team team4 = new Team("Lindenhof", tabelle);
		Team team5 = new Team("Uni Mannem", tabelle);
		Team team6 = new Team("Hochschule", tabelle);
		Team team7 = new Team("FC Mannheim", tabelle);
		Team team8 = new Team("eSports 68", tabelle);

		System.out.println("Willkommen zur " + liga1.getName() + "\n\n" + tabelle.getTabelle());

		boolean beenden;

		do {

			System.out.println("\n-> Tabelle \n-> Spiel");

			input = sc.nextLine();

			if (input.equals("Tabelle")) {
				System.out.println("Tabelle: \n" + tabelle.getTabelle());
			} else if (input.equals("Spiel")) {

				System.out.println("Möchtest du einen neuen Spieltag anlegen? (j/n)");
				playMatchday = sc.nextLine();

				if (playMatchday.equals("j")) {
					System.out.println("Der " + spieltag + ". Spieltag beginnt. \n");


					System.out.print("Name der Heim-Mannschaft eingeben: ");
					String heimTeam = sc.nextLine();

					System.out.print("\nName der Auswärts-Mannschaft eingeben: ");
					String auswärtsTeam = sc.nextLine();

					matchDay(heimTeam, auswärtsTeam, liga1, heimTore, gastTore, tabelle);

					spieltag++;

				} else if (playMatchday.equals("n")) {
					
					System.out.print("Name der Heim-Mannschaft eingeben: ");
					String heimTeam = sc.nextLine();

					System.out.print("\nName der Auswärts-Mannschaft eingeben: ");
					String auswärtsTeam = sc.nextLine();

					matchDay(heimTeam, auswärtsTeam, liga1, heimTore, gastTore, tabelle);

					spieltag++;
					
					
				} else
	
					break;
				}

		} while (beenden = true);
		System.out.println("Abschluss der Tabelle \n" + tabelle.getTabelle());

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

		System.out.print("Wie war das Ergebnis? \t");
		String eingabe = scan.nextLine();
		System.out.println();

		String[] result = eingabe.split(":");

		heimTore = Integer.parseInt(result[0]);
		gastTore = Integer.parseInt(result[1]);

		if (heimTore > gastTore) {
			heim.ergebnisMatch(3, heimTore - gastTore);
			gast.ergebnisMatch(0, gastTore - heimTore);
		} else if (heimTore < gastTore) {
			heim.ergebnisMatch(0, heimTore - gastTore);
			gast.ergebnisMatch(3, gastTore - heimTore);
		} else {
			heim.ergebnisMatch(1, heimTore - gastTore);
			gast.ergebnisMatch(1, gastTore - heimTore);

		}	

	}


}
