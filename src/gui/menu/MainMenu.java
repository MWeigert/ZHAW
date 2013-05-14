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
import gui.action.lektion3.Afg31Listener;
import gui.action.lektion8.Afg81Listener;
import gui.action.lektion9.Afg91Listener;
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

	public MainMenu(Label label, Label aufgabe) {
		menu = new MenuBar();

		Menu lektion1Menu = new Menu("Lektion 1");

		Menu aufgabe13 = new Menu("Aufgabe 3");
		MenuItem byteSub = new MenuItem("Byte");
		byteSub.setOnAction(new WrapperByteListener(label, aufgabe));
		MenuItem shortSub = new MenuItem("Short");
		shortSub.setOnAction(new WrapperShortListener(label, aufgabe));
		MenuItem integerSub = new MenuItem("Integer");
		integerSub.setOnAction(new WrapperIntegerListener(label, aufgabe));
		MenuItem longSub = new MenuItem("Long");
		longSub.setOnAction(new WrapperLongListener(label, aufgabe));
		MenuItem doubleSub = new MenuItem("Double");
		doubleSub.setOnAction(new WrapperDoubleListener(label, aufgabe));
		MenuItem floatSub = new MenuItem("Float");
		floatSub.setOnAction(new WrapperFloatListener(label, aufgabe));
		MenuItem booleanSub = new MenuItem("Boolean");
		booleanSub.setOnAction(new WrapperBooleanListener(label, aufgabe));

		aufgabe13.getItems().addAll(byteSub, shortSub, integerSub, longSub,
				doubleSub, floatSub, booleanSub);

		MenuItem aufgabe14 = new MenuItem("Aufgabe 4");
		aufgabe14.setOnAction(new Afg14Listener(label, aufgabe));

		lektion1Menu.getItems().addAll(aufgabe13, aufgabe14);

		Menu lektion2Menu = new Menu("Lektion 2");

		MenuItem aufgabe21 = new MenuItem("Aufgabe 1");
		aufgabe21.setOnAction(new Afg21Listener(label, aufgabe));
		MenuItem aufgabe22 = new MenuItem("Aufgabe 2");
		aufgabe22.setOnAction(new Afg22Listener(label, aufgabe));
		MenuItem aufgabe23 = new MenuItem("Aufgabe 3");
		aufgabe23.setOnAction(new Afg23Listener(label, aufgabe));

		lektion2Menu.getItems().addAll(aufgabe21, aufgabe22, aufgabe23);

		Menu lektion3Menu = new Menu("Lektion 3");

		MenuItem aufgabe31 = new MenuItem("Aufgabe 1");
		aufgabe31.setOnAction(new Afg31Listener(label, aufgabe));

		lektion3Menu.getItems().addAll(aufgabe31);

		Menu lektion4Menu = new Menu("Lektion 4");
		Menu lektion5Menu = new Menu("Lektion 5");
		Menu lektion6Menu = new Menu("Lektion 6");
		Menu lektion7Menu = new Menu("Lektion 7");
		Menu lektion8Menu = new Menu("Lektion 8");

		MenuItem aufgabe81 = new MenuItem("Aufgabe 1");
		aufgabe81.setOnAction(new Afg81Listener(label, aufgabe));

		lektion8Menu.getItems().addAll(aufgabe81);
		
		Menu lektion9Menu = new Menu("Lektion 9");
		
		MenuItem aufgabe91 = new MenuItem("Aufgabe 1");
		aufgabe91.setOnAction(new Afg91Listener(label, aufgabe));

		lektion9Menu.getItems().addAll(aufgabe91);
		
		menu.getMenus().addAll(lektion1Menu, lektion2Menu, lektion3Menu,
				lektion4Menu, lektion5Menu, lektion6Menu, lektion7Menu,
				lektion8Menu, lektion9Menu);
	}

	public MenuBar getMainMenu() {
		return menu;
	}
}
