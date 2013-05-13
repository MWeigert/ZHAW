/**Schreiben Sie ein kleines Programm, in dem Sie die unterschiedlichen loop-Konstrukte auf
 * ihre Funktionsfähigkeit hin überprüfen.
 */
package lektion3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 * @author Mathias Weigert
 * 
 */
public class Afg31Listener implements EventHandler<ActionEvent> {

	Label label;

	public Afg31Listener(Label label) {
		super();
		this.label = label;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();
		Long i = (long) 0;

		info += "While-Schleife mit 500'000 Durchläufen\n";
		info += "--------------------------------------------------\n";
		Long start = System.currentTimeMillis();
		while (i < 500000) {
			i++;
		}
		Long stop = System.currentTimeMillis();
		info += this.runTimeOutput(start, stop);
		i = (long) 0;
		start = System.currentTimeMillis();
		do
			i++;
		while (i < 500000);
		stop = System.currentTimeMillis();
		info += "\nDo-Schleife mit 500'000 Durchläufen\n";
		info += "--------------------------------------------------\n";
		info += this.runTimeOutput(start, stop);

		info += "\nFor-Schleife mit 500'000 Durchläufen\n";
		info += "--------------------------------------------------\n";
		start = System.currentTimeMillis();
		for (i = (long) 0; i < 500000; i++) {
		}
		stop = System.currentTimeMillis();
		info += this.runTimeOutput(start, stop);

		label.setText(info);
	}

	public String runTimeOutput(Long start, Long stop) {
		long lz = stop - start;
		if (lz > 999) {
			double sek = lz / 1000;
			return "Laufzeit String: " + sek + " Sekunden" + "\n";
		} else {
			return "Laufzeit String: " + lz + " Millisekunden" + "\n";
		}
	}
}
