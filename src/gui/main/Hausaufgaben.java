/**
 * 
 */
package gui.main;

import gui.menu.MainMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Hausaufgaben extends Application {

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
		// TODO Auto-generated method stub
		label = new Label();

		BorderPane border = new BorderPane();

		border.setTop(new MainMenu(label).getMainMenu());
		border.setCenter(label);

		Scene scene = new Scene(border);

		primaryStage.setTitle("Java Zertifizierung - Vertiefungskurs");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
