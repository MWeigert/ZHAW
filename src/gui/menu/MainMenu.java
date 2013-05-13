/**
 * 
 */
package gui.menu;

import gui.action.lektion1.WrapperBooleanListener;
import gui.action.lektion1.WrapperByteListener;
import gui.action.lektion1.Afg14Listener;
import gui.action.lektion1.WrapperDoubleListener;
import gui.action.lektion1.WrapperFloatListener;
import gui.action.lektion1.WrapperIntegerListener;
import gui.action.lektion1.WrapperLongListener;
import gui.action.lektion1.WrapperShortListener;
import gui.action.lektion2.Afg21Listener;
import gui.action.lektion2.Afg22Listener;
import gui.action.lektion2.Afg23Listener;
import gui.action.lektion8.Afg81Listener;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import lektion3.Afg31Listener;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class MainMenu {

	MenuBar menu;

	public MainMenu(Label label) {
		menu = new MenuBar();

		Menu lektion1Menu = new Menu("Lektion 1");

		Menu aufgabe13 = new Menu("Aufgabe 3");
		MenuItem byteSub = new MenuItem("Byte");
		byteSub.setOnAction(new WrapperByteListener(label));
		MenuItem shortSub = new MenuItem("Short");
		shortSub.setOnAction(new WrapperShortListener(label));
		MenuItem integerSub = new MenuItem("Integer");
		integerSub.setOnAction(new WrapperIntegerListener(label));
		MenuItem longSub = new MenuItem("Long");
		longSub.setOnAction(new WrapperLongListener(label));
		MenuItem doubleSub = new MenuItem("Double");
		doubleSub.setOnAction(new WrapperDoubleListener(label));
		MenuItem floatSub = new MenuItem("Float");
		floatSub.setOnAction(new WrapperFloatListener(label));
		MenuItem booleanSub = new MenuItem("Boolean");
		booleanSub.setOnAction(new WrapperBooleanListener(label));

		aufgabe13.getItems().addAll(byteSub, shortSub, integerSub, longSub,
				doubleSub, floatSub, booleanSub);

		MenuItem aufgabe14 = new MenuItem("Aufgabe 4");
		aufgabe14.setOnAction(new Afg14Listener(label));

		lektion1Menu.getItems().addAll(aufgabe13, aufgabe14);

		Menu lektion2Menu = new Menu("Lektion 2");

		MenuItem aufgabe21 = new MenuItem("Aufgabe 1");
		aufgabe21.setOnAction(new Afg21Listener(label));
		MenuItem aufgabe22 = new MenuItem("Aufgabe 2");
		aufgabe22.setOnAction(new Afg22Listener(label));
		MenuItem aufgabe23 = new MenuItem("Aufgabe 3");
		aufgabe23.setOnAction(new Afg23Listener(label));

		lektion2Menu.getItems().addAll(aufgabe21, aufgabe22, aufgabe23);

		Menu lektion3Menu = new Menu("Lektion 3");
		
		MenuItem aufgabe31 = new MenuItem("Aufgabe 1");
		aufgabe31.setOnAction(new Afg31Listener(label));
		
		lektion3Menu.getItems().addAll(aufgabe31);
		
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
