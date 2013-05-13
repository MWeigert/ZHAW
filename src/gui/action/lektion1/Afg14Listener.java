/** Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse ein Datenfeld
 *	vom Typ StringBuilder und ein Datenfeld vom Typ String.
 * 	Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der Klassen StringBuilder und String.
 * 	Führen Sie in einem Loop Konkatenierungs-Operationen aus für StringBuilder und String und vergleichen Sie
 * 	die Performance der beiden Klassen.
 * 
 */
package gui.action.lektion1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Afg14Listener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public Afg14Listener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

		String str = "";
		String info = new String();
		StringBuilder strBuilder = new StringBuilder();
		StringBuffer strBuffer = new StringBuffer();

		info += "Laufzeitberechnung verschiedener String Variablen Typen"
				+ "\n" + "bei ca. 250'000 Konkatenierungen des Buchstaben A."
				+ "\n"
				+ "========================================================"
				+ "\n";

		long start = System.currentTimeMillis();

		// Konkatenierung der String Variablen
		for (int i = 1; i < 250000; i++) {
			str = str + 'A';
		}
		long stop = System.currentTimeMillis();
		long lz = stop - start;
		if (lz > 999) {
			double sek = lz / 1000;
			info += "Laufzeit String: " + sek + " Sekunden" + "\n";
		} else {
			info += "Laufzeit String: " + lz + " Millisekunden" + "\n";
		}

		// Konkatenierung der StringBuilder Variablen
		start = System.currentTimeMillis();
		for (int i = 1; i < 250000; i++) {
			strBuilder.append('A');
		}
		stop = System.currentTimeMillis();
		lz = stop - start;
		info += "Laufzeit StringBuilder: " + lz + " Millisekunden" + "\n";

		// Konkatenierung der StringBuffer Variablen
		start = System.currentTimeMillis();
		for (int i = 1; i < 250000; i++) {
			strBuffer.append('A');
		}
		stop = System.currentTimeMillis();
		lz = stop - start;
		info += "Laufzeit StringBuffer: " + lz + " Millisekunden";

		label.setText(info);
		aufgabe.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse\n"
				+ "ein Datenfeld vom Typ StringBuilder und ein Datenfeld vom Typ String. Überprüfen Sie in\nIhrer "
				+ "Anwendung die Funktionsweise der Methoden der Klassen StringBuilder und String.\nFühren Sie in einem "
				+ "Loop Konkatenierungs-Operationen aus für StringBuilder und String\nund vergleichen Sie die Performance "
				+ "der beiden Klassen.");
	}

}
