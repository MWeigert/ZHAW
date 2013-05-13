/** Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, >>, >>>, ^, & und  | auf ihre Funktionalität
 *	testen.
 */
package gui.action.lektion2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Afg21Listener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public Afg21Listener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();
		byte byte1 = 0b0001101;
		byte byte2 = 0b1011101;

		info += "Byte 1 = 0000 1101 (13) und Byte 2 = 0101 1101 (93)" + "\n";
		info += "********************************************************"
				+ "\n";
		info += "Anwendung von << um 3" + "\n";
		info += "Byte 1 << 3 = " + (byte1 << 3) + "(0110 1000)" + "\n";
		info += "Byte 2 << 3 = " + (byte2 << 3) + "(10 1110 1000)" + "\n";
		info += "********************************************************"
				+ "\n";
		info += "Anwendung von >> um 3" + "\n";
		info += "Byte 1 >> 3 = " + (byte1 >> 3) + "(0000 0001)" + "\n";
		info += "Byte 2 >> 3 = " + (byte2 >> 3) + "(0000 1011)" + "\n";
		info += "********************************************************"
				+ "\n";
		info += "Anwendung von Byte 1 & Byte 2" + "\n";
		info += "Byte 1 & Byte 2 = " + (byte1 & byte2) + "(0000 1101)" + "\n\n";
		info += "Kontrolle:                       0000 1101" + "\n";
		info += "                                  & 0101 1101" + "\n";
		info += "                                      -----------" + "\n";
		info += "                                      0000 1101" + "\n";
		info += "********************************************************"
				+ "\n";
		info += "Anwendung von Byte 1 | Byte 2" + "\n";
		info += "Byte 1 | Byte 2 = " + (byte1 | byte2) + "(0101 1101)" + "\n\n";
		info += "Kontrolle:                       0000 1101" + "\n";
		info += "                                     | 0101 1101" + "\n";
		info += "                                      -----------" + "\n";
		info += "                                      0101 1101" + "\n";
		info += "********************************************************"
				+ "\n";
		label.setText(info);
		aufgabe.setText("Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, >>, >>>, ^, & und\n" +
				"| auf ihre Funktionalität testen.");
	}
}
