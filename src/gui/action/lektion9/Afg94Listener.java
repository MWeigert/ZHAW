/**
 * 
 */
package gui.action.lektion9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Afg94Listener implements EventHandler<ActionEvent> {

	Label label;
	Label aufgabe;

	public Afg94Listener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info=new String();
		
		label.setText(info);
		aufgabe.setText("Schreiben Sie ein kleines Programm in dem Sie die Collection-Klassen BlockingQueue,\n" +
				"ConcurrentHashMap und ConcurrentSkipListMap im Paket java.util.concurrent auf ihre\n" +
				"Funktionalität hin überprüfen.");
	}

}
