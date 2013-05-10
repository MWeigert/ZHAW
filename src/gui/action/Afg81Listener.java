/**
 * 
 */
package gui.action;

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

	public Afg81Listener(Label label) {
		super();
		this.label = label;
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
			fileInfo += "FileName = " + path.getFileName() + "\n" + "Parent = " + path.getParent() + "\n\n"
					+ "isExecutable(): " + Files.isExecutable(path) + "\n" + "isHidden(): " + Files.isHidden(path)
					+ "\n" + "isReadable(): " + Files.isReadable(path) + "\n" + "isWriteable(): "
					+ Files.isWritable(path) + "\n\n" + "getOwner(): " + Files.getOwner(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		label.setText(fileInfo);
	}
}