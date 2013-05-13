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
public class WrapperDoubleListener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public WrapperDoubleListener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe=aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Double wDouble = new Double(23.7);

		info += "Double (mit 23.7 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wDouble.byteValue() + "\n";
		info += "doubleValue(): " + wDouble.doubleValue() + "\n";
		info += "floatValue(): " + wDouble.floatValue() + "\n";
		info += "intValue(): " + wDouble.intValue() + "\n";
		info += "longValue(): " + wDouble.longValue() + "\n";
		info += "shortValue(): " + wDouble.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Double\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wDouble.getClass() + "\n";
		info += "doubleToLongBits(wDouble): "
				+ Double.doubleToLongBits(wDouble) + "\n";
		info += "doubleToRawLongBits(wDouble): "
				+ Double.doubleToRawLongBits(wDouble) + "\n";
		info += "isInfinite(wDouble): " + Double.isInfinite(wDouble) + "\n";
		info += "isNaN(wDouble): " + Double.isNaN(wDouble)
				+ "(NaN - not a number)\n";
		info += "toHexString(wLong): " + Double.toHexString(wDouble) + "\n";
		info += "hashCode(): " + wDouble.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Double.MAX_VALUE + "\n";
		info += "Min. Value: " + Double.MIN_VALUE + "\n";
		info += "Max. Exponent: " + Double.MAX_EXPONENT + "\n";
		info += "Min. Exponent: " + Double.MIN_EXPONENT + "\n";
		info += "Min. Normal: " + Double.MIN_NORMAL + "\n";
		info += "NaN: " + Double.NaN + "\n";
		info += "Negative Infinity: " + Double.NEGATIVE_INFINITY + "\n";
		info += "Positive Infinity: " + Double.POSITIVE_INFINITY + "\n";
		info += "Size (Bit): " + Double.SIZE + "\n";
		info += "Type: " + Double.TYPE;

		label.setText(info);
		aufgabe=this.setAufgabe(aufgabe);
	}
	
	public Label setAufgabe(Label aufgabe) {
		aufgabe.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse\n"
				+ "verschiedene Datenfelder vom Typ der numerischen Wrapper Klassen. Überprüfen Sie in\nIhrer Anwendung die "
				+ "Funktionsweise der Methoden der numerischen Wrapper Klassen.");
		return aufgabe;
	}

}
