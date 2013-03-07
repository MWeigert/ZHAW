/**
 * 
 */
package lektion2;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Kunde {

	String name;
	String vorname;
	int alter;
	boolean geschlecht; // 0 = männlich 1 = weiblich

	public Kunde(String name, String vorname, int alter, boolean geschlecht) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

}
