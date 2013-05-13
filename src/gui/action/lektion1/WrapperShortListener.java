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
public class WrapperShortListener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public WrapperShortListener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Short wShort = new Short((short) 23);

		info += "Short (mit 23 instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "byteValue(): " + wShort.byteValue() + "\n";
		info += "doubleValue(): " + wShort.doubleValue() + "\n";
		info += "floatValue(): " + wShort.floatValue() + "\n";
		info += "intValue(): " + wShort.intValue() + "\n";
		info += "longValue(): " + wShort.longValue() + "\n";
		info += "shortValue(): " + wShort.shortValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Short\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wShort.getClass() + "\n";
		info += "hashCode(): " + wShort.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "Max. Value: " + Short.MAX_VALUE + "\n";
		info += "Min. Value: " + Short.MIN_VALUE + "\n";
		info += "Size (Bit): " + Short.SIZE + "\n";
		info += "Type: " + Short.TYPE;

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
