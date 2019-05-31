import java.util.ArrayList;

public class Spieltag {
	
	ArrayList<Spiel> arrSpiele = new ArrayList<>();
	
	public Spieltag() {
			
	}
	
	public void spielSpeichern(Spiel s) {
		arrSpiele.add(s);
	}

}
