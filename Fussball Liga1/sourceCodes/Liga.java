import java.util.ArrayList;

public class Liga {

	private String name;
	private Tabelle neueTabelle;

	public Liga(String name) {
		setName(name);
		neueTabelle = new Tabelle();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Tabelle getNeueTabelle() {
		return neueTabelle;
	}

}
