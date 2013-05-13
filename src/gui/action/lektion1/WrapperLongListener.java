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
public class WrapperLongListener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public WrapperLongListener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Long wLong = new Long((long) 666);

		info += "Long (mit 666 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wLong.byteValue() + "\n";
		info += "doubleValue(): " + wLong.doubleValue() + "\n";
		info += "floatValue(): " + wLong.floatValue() + "\n";
		info += "intValue(): " + wLong.intValue() + "\n";
		info += "longValue(): " + wLong.longValue() + "\n";
		info += "shortValue(): " + wLong.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Long\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wLong.getClass() + "\n";
		info += "toBinaryString(wInteger): " + Long.toBinaryString(wLong)
				+ "\n";
		info += "bitCount(wInteger): " + Long.bitCount(wLong) + "\n";
		info += "highestOneBit(wLong): " + Long.highestOneBit(wLong) + "\n";
		info += "lowestIneBit(wLong): " + Long.lowestOneBit(wLong) + "\n";
		info += "toHexString(wLong): " + Long.toHexString(wLong) + "\n";
		info += "toOctalString(wLong): " + Long.toOctalString(wLong) + "\n";
		info += "numberOfLeadingZeros(wLong): "
				+ Long.numberOfLeadingZeros(wLong) + "\n";
		info += "numberOfTrailingZeros(wLong): "
				+ Long.numberOfTrailingZeros(wLong) + "\n";
		info += "reverseBytes(wLong): " + Long.reverseBytes(wLong) + "\n";
		info += "reverse(wLong): " + Long.reverse(wLong) + "\n";
		info += "rotateLeft(wLong, 3)" + Long.rotateLeft(wLong, 3) + "\n";
		info += "rotateRight(wLong, 3): " + Long.rotateRight(wLong, 3) + "\n";
		info += "signum(wLong): " + Long.signum(wLong)
				+ "-1 für negativ, 0 für 0 und 1 für positiv" + "\n";
		info += "hashCode(): " + wLong.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Long.MAX_VALUE + "\n";
		info += "Min. Value: " + Long.MIN_VALUE + "\n";
		info += "Size (Bit): " + Long.SIZE + "\n";
		info += "Type: " + Long.TYPE;

		label.setText(info);
		aufgabe = this.setAufgabe(aufgabe);
	}

	public Label setAufgabe(Label aufgabe) {
		aufgabe.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse\n"
				+ "verschiedene Datenfelder vom Typ der numerischen Wrapper Klassen. Überprüfen Sie in\nIhrer Anwendung die "
				+ "Funktionsweise der Methoden der numerischen Wrapper Klassen.");
		return aufgabe;
	}

}
