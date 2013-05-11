/**
 * 
 */
package gui.menu;

import gui.action.lektion1.Afg14Listener;
import gui.action.lektion2.Afg21Listener;
import gui.action.lektion2.Afg22Listener;
import gui.action.lektion2.Afg23Listener;
import gui.action.lektion8.Afg81Listener;
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

		MenuItem aufgabe14 = new MenuItem("Aufgabe 4");
		aufgabe14.setOnAction(new Afg14Listener(label));

		lektion1Menu.getItems().addAll(aufgabe14);

		Menu lektion2Menu = new Menu("Lektion 2");

		MenuItem aufgabe21 = new MenuItem("Aufgabe 1");
		aufgabe21.setOnAction(new Afg21Listener(label));
		MenuItem aufgabe22 = new MenuItem("Aufgabe 2");
		aufgabe22.setOnAction(new Afg22Listener(label));
		MenuItem aufgabe23 = new MenuItem("Aufgabe 2");
		aufgabe23.setOnAction(new Afg23Listener(label));

		lektion2Menu.getItems().addAll(aufgabe21, aufgabe22, aufgabe23);

		Menu lektion3Menu = new Menu("Lektion 3");
		Menu lektion4Menu = new Menu("Lektion 4");
		Menu lektion5Menu = new Menu("Lektion 5");
		Menu lektion6Menu = new Menu("Lektion 6");
		Menu lektion7Menu = new Menu("Lektion 7");
		Menu lektion8Menu = new Menu("Lektion 8");

		MenuItem aufgabe81 = new MenuItem("Aufgabe 1");
		aufgabe81.setOnAction(new Afg81Listener(label));

		lektion8Menu.getItems().addAll(aufgabe81);

		menu.getMenus().addAll(lektion1Menu, lektion2Menu, lektion3Menu,
				lektion4Menu, lektion5Menu, lektion6Menu, lektion7Menu,
				lektion8Menu);
	}

	public MenuBar getMainMenu() {
		return menu;
	}
}
