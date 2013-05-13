/** Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit einigen Datenfeldern definieren. Überschreiben
 *	Sie die equals()-Methode für die Klasse Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit der Datenfelder
 *	überprüft werden.
 */
package gui.action.lektion2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import lektion2.Kunde;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Afg22Listener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public Afg22Listener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		char ch;
		Kunde kunde1 = new Kunde("Duck", "Donald", 45, false);
		if (kunde1.isGeschlecht()) {
			ch = 'w';
		} else
			ch = 'm';
		info += "Kunde 1: " + kunde1.getVorname() + " " + kunde1.getName()
				+ " " + kunde1.getAlter() + " " + ch + "\n";
		Kunde kunde2 = new Kunde("Duck", "Dagobert", 65, false);
		if (kunde2.isGeschlecht()) {
			ch = 'w';
		} else
			ch = 'm';
		info += "Kunde 2: " + kunde2.getVorname() + " " + kunde2.getName()
				+ " " + kunde2.getAlter() + " " + ch + "\n";
		Kunde kunde3 = new Kunde("Duck", "Donald", 45, false);
		if (kunde1.isGeschlecht()) {
			ch = 'w';
		} else
			ch = 'm';
		info += "Kunde 3: " + kunde3.getVorname() + " " + kunde3.getName()
				+ " " + kunde1.getAlter() + " " + ch + "\n\n";
		info += "Kunde 1 equal Kunde 2: " + kunde1.equals(kunde2) + "\n";
		info += "Kunde 1 equal Kunde 3: " + kunde1.equals(kunde3) + "\n";
		info += "Kunde 2 equal Kunde 3: " + kunde2.equals(kunde3) + "\n";
		info += "Kunde 2 equal Kunde 1: " + kunde2.equals(kunde1) + "\n";
		info += "Kunde 3 equal Kunde 1: " + kunde3.equals(kunde1) + "\n";
		info += "Kunde 3 equal Kunde 2: " + kunde3.equals(kunde2);

		label.setText(info);
		aufgabe.setText("Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit einigen Datenfeldern\n" +
				"definieren. Überschreiben Sie die equals()-Methode für die Klasse Kunde dahin, dass Objekte\nder " +
				"Klasse Kunde auf Gleichheit der Datenfelder überprüft werden.");
	}
}
