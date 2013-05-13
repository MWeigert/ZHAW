/** Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse verschiedene Datenfelder
 *  vom Typ der numerischen Wrapper Klassen. Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der
 *  numerischen Wrapper Klassen.
 */
package gui.action.lektion1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class WrapperByteListener implements EventHandler<ActionEvent> {

	Label label;

	public WrapperByteListener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Byte wByte = new Byte((byte) 0b0001101);

		info += "Byte (mit 0b0001101 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wByte.byteValue() + "\n";
		info += "doubleValue(): " + wByte.doubleValue() + "\n";
		info += "floatValue(): " + wByte.floatValue() + "\n";
		info += "intValue(): " + wByte.intValue() + "\n";
		info += "longValue(): " + wByte.longValue() + "\n";
		info += "shortValue(): " + wByte.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Byte\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wByte.getClass() + "\n";
		info += "hashCode(): " + wByte.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Byte.MAX_VALUE + "\n";
		info += "Min. Value: " + Byte.MIN_VALUE + "\n";
		info += "Size (Bit): " + Byte.SIZE + "\n";
		info += "Type: " + Byte.TYPE;

		label.setText(info);
	}

}
