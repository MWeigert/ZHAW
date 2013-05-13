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
public class WrapperFloatListener implements EventHandler<ActionEvent> {

	Label label;

	public WrapperFloatListener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Float wFloat = new Float(3.141);

		info += "Float (mit 3.141 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wFloat.byteValue() + "\n";
		info += "doubleValue(): " + wFloat.doubleValue() + "\n";
		info += "floatValue(): " + wFloat.floatValue() + "\n";
		info += "intValue(): " + wFloat.intValue() + "\n";
		info += "longValue(): " + wFloat.longValue() + "\n";
		info += "shortValue(): " + wFloat.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Double\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wFloat.getClass() + "\n";
		info += "floatToIntBits(wFloat): " + Float.floatToIntBits(wFloat)
				+ "\n";
		info += "floatToRawIntBits(wFloat): " + Float.floatToRawIntBits(wFloat)
				+ "\n";
		info += "isInfinite(wFloat): " + Float.isInfinite(wFloat) + "\n";
		info += "isNaN(wFloat): " + Float.isNaN(wFloat)
				+ "(NaN - not a number)\n";
		info += "toHexString(wFloat): " + Float.toHexString(wFloat) + "\n";
		info += "hashCode(): " + wFloat.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Float.MAX_VALUE + "\n";
		info += "Min. Value: " + Float.MIN_VALUE + "\n";
		info += "Max. Exponent: " + Float.MAX_EXPONENT + "\n";
		info += "Min. Exponent: " + Float.MIN_EXPONENT + "\n";
		info += "Min. Normal: " + Float.MIN_NORMAL + "\n";
		info += "NaN: " + Float.NaN + "\n";
		info += "Negative Infinity: " + Float.NEGATIVE_INFINITY + "\n";
		info += "Positive Infinity: " + Float.POSITIVE_INFINITY + "\n";
		info += "Size (Bit): " + Float.SIZE + "\n";
		info += "Type: " + Float.TYPE;

		label.setText(info);
	}

}
