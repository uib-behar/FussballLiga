import java.util.ArrayList;

public class Liga {

	private String name;
	private Tabelle neueTabelle;

	public Liga(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Tabelle getTabelle() {
		return neueTabelle;
	}

}
