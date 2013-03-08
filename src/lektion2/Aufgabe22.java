/**
 * Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit einigen Datenfeldern definieren. Überschreiben
 *	Sie die equals()-Methode für die Klasse Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit der Datenfelder
 *	überprüft werden.
 */
package lektion2;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Aufgabe22 {

	/**
	 * @param args
	 */
	public static <Symbols> void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Kunde kunde1 = new Kunde("Duck", "Donald", 45, false);
		if (kunde1.geschlecht) {
			ch = 'w';
		} else
			ch = 'm';
		System.out.println("Kunde 1: " + kunde1.getVorname() + " " + kunde1.getName() + " "
				+ kunde1.getAlter() + " " + ch);
		Kunde kunde2 = new Kunde("Duck", "Dagobert", 65, false);
		if (kunde2.geschlecht) {
			ch = 'w';
		} else
			ch = 'm';
		System.out.println("Kunde 2: " + kunde2.getVorname() + " " + kunde2.getName() + " "
				+ kunde2.getAlter() + " " + ch);
		Kunde kunde3 = new Kunde("Duck", "Donald", 45, false);
		if (kunde1.geschlecht) {
			ch = 'w';
		} else
			ch = 'm';
		System.out.println("Kunde 3: " + kunde3.getVorname() + " " + kunde3.getName() + " "
				+ kunde1.getAlter() + " " + ch);
		System.out.println();
		System.out.println("Kunde 1 equal Kunde 2: " + kunde1.equals(kunde2));
		System.out.println("Kunde 1 equal Kunde 3: " + kunde1.equals(kunde3));
		System.out.println("Kunde 2 equal Kunde 3: " + kunde2.equals(kunde3));
		System.out.println("Kunde 2 equal Kunde 1: " + kunde2.equals(kunde1));
		System.out.println("Kunde 3 equal Kunde 1: " + kunde3.equals(kunde1));
		System.out.println("Kunde 3 equal Kunde 2: " + kunde3.equals(kunde2));
	}

}
