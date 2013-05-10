/** 1. Schreiben Sie ein kleines Programm :
 *	Untersuchen der Path Klasse im nio Paket ( Path erzeugen, Path Informationen abfragen, 2 Paths zusammenführen über die
 *	resolve() Methode, 2 Paths vergleichen).
 *	Untersuchen der Files Klasse im nio Paket ( File Zugriff überprüfen, File Location in verschiedenen Paths überprüfen,
 *	File/Directory löschen/kopieren/versetzen, Metadaten abfragen).
 *	Untersuchen der PathMatcher Klasse  im nio Paket (Files finden über die unterschiedlichen Glob Patterns gemäss
 *	Vorlesungsunterlagen).
 * 
 */
package lektion8;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Aufgabe01 extends Application {

	Label label;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Button loadBtn = new Button("Load File");
		// loadBtn.setOnAction(loadBtnEventListener);
		//
		 label = new Label();

		MenuBar menu = new MenuBar();
		Menu lektion8Menu = new Menu("Lektion 8");
		MenuItem aufgabe1 = new MenuItem("Aufgabe 1");
		aufgabe1.setOnAction(loadBtnEventListener);
		lektion8Menu.getItems().addAll(aufgabe1);
		menu.getMenus().add(lektion8Menu);

		BorderPane border = new BorderPane();
		
		border.setTop(menu);
		border.setCenter(label);
		
//		VBox rootBox = new VBox();
//		rootBox.getChildren().addAll(menu, label);

//		Scene scene = new Scene(rootBox, 400, 350);
		Scene scene = new Scene(border);
		
		primaryStage.setTitle("Lektion 8: Aufgabe 1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	EventHandler<ActionEvent> loadBtnEventListener = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {

			FileChooser fc = new FileChooser();

			File file = fc.showOpenDialog(null);

			Path path = file.toPath();

			String fileInfo = "Path = " + path.toString() + "\n\n";

			fileInfo += "FileSystem: " + path.getFileSystem() + "\n\n";

			try {
				fileInfo += "FileName = " + path.getFileName() + "\n" + "Parent = " + path.getParent() + "\n"
						+ "isExecutable(): " + Files.isExecutable(path) + "\n" + "isReadable(): "
						+ Files.isReadable(path) + "\n" + "isWriteable(): " + Files.isWritable(path) + "\n"
						+ "getOwner(): " + Files.getOwner(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			label.setText(fileInfo);
		}

	};

}
