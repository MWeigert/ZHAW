/**
 * 
 */
package gui.menu;

import gui.action.Afg81Listener;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class MainMenu {

	MenuBar menu;

	public MainMenu(Label label) {
		menu = new MenuBar();

		Menu lektion1Menu = new Menu("Lektion 1");
		Menu lektion2Menu = new Menu("Lektion 2");
		Menu lektion3Menu = new Menu("Lektion 3");
		Menu lektion4Menu = new Menu("Lektion 4");
		Menu lektion5Menu = new Menu("Lektion 5");
		Menu lektion6Menu = new Menu("Lektion 6");
		Menu lektion7Menu = new Menu("Lektion 7");
		Menu lektion8Menu = new Menu("Lektion 8");

		 MenuItem aufgabe1 = new MenuItem("Aufgabe 1");
		 aufgabe1.setOnAction(new Afg81Listener(label));
		 
		 lektion8Menu.getItems().addAll(aufgabe1);

		menu.getMenus().addAll(lektion1Menu, lektion2Menu, lektion3Menu, lektion4Menu, lektion5Menu, lektion6Menu,
				lektion7Menu, lektion8Menu);
	}

	public MenuBar getMainMenu() {
		return menu;
	}
}
