/** Schreiben Sie ein kleines Programm :
 *	Untersuchen der Path Klasse im nio Paket ( Path erzeugen, Path Informationen abfragen, 2 Paths zusammenf�hren �ber die
 *	resolve() Methode, 2 Paths vergleichen).
 *	Untersuchen der Files Klasse im nio Paket ( File Zugriff �berpr�fen, File Location in verschiedenen Paths �berpr�fen,
 *	File/Directory l�schen/kopieren/versetzen, Metadaten abfragen).
 *	Untersuchen der PathMatcher Klasse  im nio Paket (Files finden �ber die unterschiedlichen Glob Patterns gem�ss
 *	Vorlesungsunterlagen).
 */
package gui.action.lektion8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

/**
 * @author MWeigert
 * 
 */
public class Afg81Listener implements EventHandler<ActionEvent> {

	Label label = new Label();
	Label aufgabe = new Label();

	public Afg81Listener(Label label, Label aufgabe) {
		super();
		this.label = label;
		this.aufgabe = aufgabe;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();

		File file = fc.showOpenDialog(null);

		Path path = file.toPath();

		String fileInfo = "Path = " + path.toString() + "\n\n";

		fileInfo += "FileSystem: " + path.getFileSystem() + "\n\n";

		try {
			fileInfo += "FileName = " + path.getFileName() + "\n" + "Parent = "
					+ path.getParent() + "\n\n" + "isExecutable(): "
					+ Files.isExecutable(path) + "\n" + "isHidden(): "
					+ Files.isHidden(path) + "\n" + "isReadable(): "
					+ Files.isReadable(path) + "\n" + "isWriteable(): "
					+ Files.isWritable(path) + "\n\n" + "getOwner(): "
					+ Files.getOwner(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		label.setText(fileInfo);
		aufgabe.setText("Schreiben Sie ein kleines Programm: Untersuchen der Path Klasse im nio Paket\n" +
				"( Path erzeugen, Path Informationen abfragen, 2 Paths zusammenf�hren �ber die resolve()\n" +
				"Methode, 2 Paths vergleichen).	Untersuchen der Files Klasse im nio Paket ( File Zugriff\n" +
				"�berpr�fen, File Location in verschiedenen Paths �berpr�fen, File/Directory\n" +
				"l�schen/kopieren/versetzen, Metadaten abfragen). Untersuchen der PathMatcher Klasse\n" +
				" im nio Paket (Files finden �ber die unterschiedlichen Glob Patterns gem�ss\n" +
				"Vorlesungsunterlagen).");
	}
}