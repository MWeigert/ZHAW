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
public class WrapperIntegerListener implements EventHandler<ActionEvent> {

	Label label;

	public WrapperIntegerListener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Integer wInteger = new Integer(42);

		info += "Integer (mit 42 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wInteger.byteValue() + "\n";
		info += "doubleValue(): " + wInteger.doubleValue() + "\n";
		info += "floatValue(): " + wInteger.floatValue() + "\n";
		info += "intValue(): " + wInteger.intValue() + "\n";
		info += "longValue(): " + wInteger.longValue() + "\n";
		info += "shortValue(): " + wInteger.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Integer\n";
		info += "---------------------------------------------------------------\n";
		info += "bitCount(wInteger): " + Integer.bitCount(wInteger) + "\n";
		info += "getClass(): " + wInteger.getClass() + "\n";
		info += "toBinaryString(wInteger): " + Integer.toBinaryString(wInteger)
				+ "\n";
		info += "hashCode(): " + wInteger.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Integer.MAX_VALUE + "\n";
		info += "Min. Value: " + Integer.MIN_VALUE + "\n";
		info += "Size (Bit): " + Integer.SIZE + "\n";
		info += "Type: " + Integer.TYPE;

		label.setText(info);
	}

}
