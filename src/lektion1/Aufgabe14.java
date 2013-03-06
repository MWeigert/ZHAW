/**
 * Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse ein Datenfeld vom Typ
 * StringBuilder und ein Datenfeld vom Typ String. Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der
 * Klassen StringBuilder und String. Führen Sie in einem Loop Konkatenierungs-Operationen aus für StringBuilder und
 * String und vergleichen Sie die Performance der beiden Klassen.
 */
package lektion1;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		StringBuilder strBuilder = new StringBuilder();
		StringBuffer strBuffer = new StringBuffer();

		System.out.println("Laufzeitberechnung verschiedener String Variablen Typen");
		System.out.println("bei ca. 250'000 Konkatenierungen des Buchstaben A.");
		System.out.println("========================================================");
		
		long start = System.currentTimeMillis();
		
		// Konkatenierung der String Variablen
		for (int i = 1; i < 250000; i++) {
			str = str + 'A';
		}
		long stop = System.currentTimeMillis();
		long lz = stop - start;
		if (lz>999) {
			double sek = lz/1000;
			System.out.println("       Laufzeit String: " + sek + " Sekunden");
		} else {
			System.out.println("       Laufzeit String: " + lz + " Millisekunden");
		}
		
		// Konkatenierung der StringBuilder Variablen
		start = System.currentTimeMillis();
		for (int i = 1; i < 250000; i++) {
			strBuilder.append('A');
		}
		stop = System.currentTimeMillis();
		lz = stop - start;
		System.out.println("Laufzeit StringBuilder: " + lz + " Millisekunden");
		
		// Konkatenierung der StringBuffer Variablen
		start = System.currentTimeMillis();
		for (int i = 1; i < 250000; i++) {
			strBuffer.append('A');
		}
		stop = System.currentTimeMillis();
		lz = stop - start;
		System.out.println(" Laufzeit StringBuffer: " + lz + " Millisekunden");
	}

}
