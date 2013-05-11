/** Schreiben Sie ein kleines Programm, in dem Sie einen zweidimensionalen Array definieren, erzeugen und initialisieren,
 *	initialisieren Sie den Array auf zwei verschiedene Arten.
 */
package gui.action.lektion2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Afg23Listener implements EventHandler<ActionEvent> {

	Label label;

	public Afg23Listener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		String[] strArray1;
		int[] intArray1;
		boolean[] boolArray1;

		strArray1 = new String[128];
		String[] strArray2 = { "Es", "war", "einmal", "in", "einem", "tiefen",
				"..." };

		intArray1 = new int[42];
		int[] intArray2 = { 128, 25, 23, 49, 889, 5, 13 };

		boolArray1 = new boolean[23];
		boolean[] boolArray2 = { true, false, false, true, true, true, false };

		info += "strArray1: strArray1 = new String[128]" + "\n";
		info += "Element 25: " + strArray1[25] + "\n";
		info += "strArray2: String[] strArray2 =  {'Es', 'war', 'einmal', 'in', 'einem', 'tiefen', '...'} "
				+ "\n";
		info += "Element 4: " + strArray2[4] + "\n\n";
		info += "intArray1: intArray1 = new int[42];" + "\n";
		info += "Element 13: " + intArray1[13] + "\n";
		info += "intArray2: int[] intArray2 = { 128, 25, 23, 49, 889, 5, 13 }"
				+ "\n";
		info += "Element 1: " + intArray2[1] + "\n\n";
		info += "boolArray1: boolArray1 = new boolean[23]" + "\n";
		info += "Element 15: " + boolArray1[15] + "\n";
		info += "boolArray2: boolean[] boolArray2 = { true, false, false, true, true, true, false }"
				+ "\n";
		info += "Element 5: " + boolArray2[5] + "\n";

		label.setText(info);
	}

}
