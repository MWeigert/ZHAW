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
public class WrapperBooleanListener implements EventHandler<ActionEvent> {

	Label label;

	public WrapperBooleanListener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();

		Boolean wBoolean = new Boolean(true);

		info += "Byte (mit true instanziert)\n\n";

		info += "Spezielle Rückgabe Methoden beim Wrapper:\n";
		info += "---------------------------------------------------------------\n";
		info += "booleanValue: " + wBoolean.booleanValue() + "\n\n";

		info += "Weitere Methoden der Wrapperklasse Byte\n";
		info += "---------------------------------------------------------------\n";
		info += "getClass(): " + wBoolean.getClass() + "\n";
		info += "toString(wBoolean): " + Boolean.toString(wBoolean) + "\n";
		info += "hashCode(): " + wBoolean.hashCode() + "\n\n";

		info += "Verknüpfte Konstanten:\n";
		info += "---------------------------------------------------------------\n";
		info += "False: " + Boolean.FALSE + "\n";
		info += "True: " + Boolean.TRUE + "\n";
		info += "Type: " + Boolean.TYPE;

		label.setText(info);
	}

}
